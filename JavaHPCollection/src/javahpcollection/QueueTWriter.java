/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javahpcollection;

import elsu.common.*;
import elsu.hpc.*;
import java.text.*;
import java.util.*;

/**
 *
 * @author ss.dhaliwal
 */
public class QueueTWriter implements Runnable {

    public hpArray _hpArray = null;
    static volatile long _i = 0;

    private static final int MIN_VALUE = 100;
    private static final int MAX_VALUE = 1000;

    public QueueTWriter(hpArray array) {
        _hpArray = array;
    }

    public int getRandomWait() {
        Random random = new Random();
        return random.nextInt(MAX_VALUE - MIN_VALUE) + MIN_VALUE;
    }

    @Override
    public void run() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy MMM dd HH:mm:ss");
        String item = "";
        String thId = "w(" + String.format("%4d", Thread.currentThread().getId()) + "), ";
        
        while (true) {
            try {
                Thread.sleep(getRandomWait());

                item = thId + " item " + (getSeqId()) + ", " + sdf.format(new Date());
                _hpArray.addItem(item);

                System.out.println("         " + item);
            } catch (Exception exi) {
                System.out.println(thId + exi.getMessage());
            }
        }
    }
    
    public synchronized String getSeqId() {
        _i++;
        
        return String.format("%10d", _i);
    } 
}
