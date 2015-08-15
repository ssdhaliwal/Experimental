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

    hpArray hpa = new hpArray();
    int p = 1;

    public JavaHPCollection() {

    }

    public void run() {
        testHPArray();

        System.out.println(hpa._arrayFirst + " .. " + hpa._arrayLast);
    }

    public void testHPArray() {

        for (int i = 0; i < hpa._arraySize + 1; i++) {
            try {
                hpa.addItem("this is a test (" + (p++) + ")");
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }

        String value = "";
        while (true) {
            try {
                value = hpa.removeItem();

                System.out.println(value);
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
                break;
            }
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //JavaHPCollection jhpc = new JavaHPCollection();

        //jhpc.run();
        //jhpc.run();
        //jhpc.run();
        hpArray hpa = new hpArray();

        ArrayList<Thread> _thList = new ArrayList<>();
        QueueTWriter qtw = null;
        QueueTReader qtr = null;
        Thread th = null;

        for (int i = 0; i < 300; i++) {
            qtw = new QueueTWriter(hpa);
            th = new Thread(qtw);
            th.start();

            _thList.add(th);
        }

        for (int i = 0; i < 50; i++) {
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
