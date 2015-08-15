/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elsu.hpc;

import java.lang.*;
import java.util.*;

/**
 *
 * @author dhaliwal-admin
 */
public class hpArray {

    public int _arraySize = 5000000; //Integer.MAX_VALUE;

    public Object _lockLast = new Object();
    public volatile int _arrayLast = -1;
    public Object _lockFirst = new Object();
    public volatile int _arrayFirst = -1;
    public volatile boolean _hasData = false;

    public String[] _node = null;

    public hpArray() {
        _node = new String[_arraySize];
    }

    public int addItem(String value) throws Exception {
        int result = -1;

        synchronized (_lockLast) {
            incrementLast();
            result = _arrayLast;
        }

        _node[result] = value;      // store the data
        _hasData = true;

        return result;
    }

    public String removeItem() throws Exception {
        String result = null;
        int first = -1;

        synchronized (_lockFirst) {
            first = incrementFirst();
        }

        result = _node[first];
        _node[first] = "";

        return result;
    }

    public int incrementFirst() throws Exception {
        int result = -1;

        if (((_arrayFirst == _arrayLast)
                && (_hasData))
                || (!_hasData)) {
            _hasData = false;

            throw new Exception("<<< end of queue reached <<<");
        } else {
            if (_arrayFirst == _arraySize - 1) {
                _arrayFirst = 0;
            } else {
                result = ++_arrayFirst;
            }
        }

        if ((result == -1) && (_hasData)) {
            result = 0;
        }

        //System.out.println("..F " + _arrayFirst + ":" + _arrayLast + " -"
        //        + _hasData + " .... " + result);
        return result;
    }

    public void incrementLast() throws Exception {
        if (_arrayLast == _arraySize - 1) {
            if ((_arrayFirst <= 0)
                    && (_hasData)) {
                throw new Exception(">>> >>> queue is full >>> >>>");
            }

            if (_arrayFirst == _arraySize - 1) {
                _arrayFirst = -1;
                _hasData = false;

                incrementLast();
            } else {
                _arrayLast = 0;
            }
        } else {
            _arrayLast++;
        }

        //System.out.println("..L " + _arrayFirst + ":" + _arrayLast + " -"
        //        + _hasData);
    }
}
