/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javahpcollection;

import elsu.hpc.*;
import java.util.*;

/**
 *
 * @author ss.dhaliwal
 */
public class QueueTReader implements Runnable  {

    public hpArray _hpArray = null;

    private static final int MIN_VALUE = 100;
    private static final int MAX_VALUE = 1000;

    public QueueTReader(hpArray array) {
        _hpArray = array;
    }

    public int getRandomWait() {
        Random random = new Random();
        return random.nextInt(MAX_VALUE - MIN_VALUE) + MIN_VALUE;
    }
    
    @Override
    public void run() {
        String item = "";
        String thId = "r(" + Thread.currentThread().getId() + "), ";
        
        while (true) {
            try {
                Thread.sleep(getRandomWait());
                
                item = _hpArray.removeItem();
                System.out.println(thId + item);
            } catch (Exception exi) {
                System.out.println(thId + exi.getMessage());
                
                System.gc();
            }
        }
    }
}
