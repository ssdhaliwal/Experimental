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
 * @author dhaliwal-admin
 */
public class JavaHPCollection {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        int thReaders = 2;
        int thWriters = 5;
        
        hpTArray<String> hpa = new hpTArray(30);
        //hpStringArray hpa = new hpStringArray(5000000);

        ArrayList<Thread> _thList = new ArrayList<>();
        QueueTWriter qtw = null;
        QueueTReader qtr = null;
        Thread th = null;

        for (int i = 0; i < thWriters; i++) {
            qtw = new QueueTWriter(hpa);
            th = new Thread(qtw);
            th.start();

            _thList.add(th);
        }

        for (int i = 0; i < thReaders; i++) {
            qtr = new QueueTReader(hpa);
            th = new Thread(qtr);
            th.start();

            _thList.add(th);
        }

        for (Thread tht : _thList) {
            try {
                tht.join();
            } catch (Exception exi) {
            }
        }
    }
}
