/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elsu.hpc;

import java.lang.*;
import java.lang.reflect.*;
import java.util.*;

/**
 *
 * @author dhaliwal-admin
 */
public class hpTArray<T> {

    private int _arraySize = 25; //Integer.MAX_VALUE;

    private Object _lockLast = new Object();
    private volatile int _arrayLast = -1;
    private Object _lockFirst = new Object();
    private volatile int _arrayFirst = -1;
    private volatile boolean _hasData = false;

    private T[] _node = null;

    public hpTArray() {
        _node = (T[]) (new Object[_arraySize]);
    }

    @Override
    protected void finalize() throws Throwable {
        try {
            _arrayLast = -1;
            _arrayFirst = -1;
            
            for (int i = 0; i < _arraySize; i++) {
                _node[i] = null;
            }
        } finally {
            super.finalize();
        }
    }

    public hpTArray(int size) {
        _arraySize = size;

        _node = (T[]) (new Object[_arraySize]);
    }

    public int getArraySize() {
        return this._arraySize;
    }

    public int addItem(T value) throws Exception {
        int result = -1;

        result = incrementLast();

        _node[result] = value;      // store the data
        _hasData = true;

        return result;
    }

    public T removeItem() throws Exception {
        T result = null;
        int first = -1;

        first = incrementFirst();

        result = _node[first];
        _node[first] = (T) null;

        return result;
    }

    protected synchronized int incrementFirst() throws Exception {
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
                ++_arrayFirst;
                result = _arrayFirst;
            }
        }

        if ((result == -1) && (_hasData)) {
            _arrayFirst = 0;
            result = _arrayFirst;
        }

        //System.out.println("..F " + _arrayFirst + ":" + _arrayLast + " -"
        //        + _hasData + " .... " + result);
        return result;
    }

    protected synchronized int incrementLast() throws Exception {
        int result = -1;

        if (_arrayLast == _arraySize - 1) {
            if ((_arrayFirst <= 0)
                    && (_hasData)) {
                throw new Exception(">>> >>> queue is full >>> >>>");
            }

            if (_arrayFirst == _arraySize - 1) {
                _arrayFirst = -1;
                _hasData = false;

                result = incrementLast();
            } else {
                _arrayLast = 0;
                result = _arrayLast;
            }
        } else {
            _arrayLast++;
            result = _arrayLast;
        }

        //System.out.println("..L " + _arrayFirst + ":" + _arrayLast + " -"
        //        + _hasData);
        return result;
    }
}
