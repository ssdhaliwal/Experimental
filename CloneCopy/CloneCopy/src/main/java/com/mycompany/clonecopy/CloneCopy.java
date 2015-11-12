/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.clonecopy;

/**
 *
 * @author ssdhaliwal
 */
public class CloneCopy {
    
    public static void main(String[] args) {
        Object value = new Values();
        
        Object pInt = (int)1;
        Object pDouble = (double)1.004;
        Object pString = "original";
        Object oInt = Integer.valueOf("12");
        Object oDouble = Double.valueOf("2.332");
        Object oTimeStamp = new java.sql.Timestamp(System.currentTimeMillis());
        
        System.out.println(pInt.toString() + "/" + pDouble.toString() + "/" + pString + "/" + oInt.toString() + "/" + oDouble.toString() + "//" + value.toString() + "//" + oTimeStamp);
        
        Object cValue = value;
        Object cpInt = pInt;
        Object cpDouble = pDouble;
        Object cpString = pString;
        Object coInt = oInt;
        Object coDouble = oDouble;
        Object coTimeStamp = oTimeStamp;

        System.out.println(cpInt.toString() + "/" + cpDouble.toString() + "/" + cpString + "/" + coInt.toString() + "/" + coDouble.toString() + "//" + cValue.toString() + "//" + coTimeStamp);
        
        ((Values)cValue).i += 5;
        ((Values)cValue).d += 15.5;
        ((Values)cValue).s += "_clone";
        
        cpInt = 3;
        cpDouble = 3.332;
        cpString = "clone";
        coInt = 7;
        coDouble = 3.23;
        coTimeStamp = new java.sql.Timestamp(System.currentTimeMillis());

        System.out.println();
        System.out.println(pInt.toString() + "/" + pDouble.toString() + "/" + pString + "/" + oInt.toString() + "/" + oDouble.toString() + "//" + value.toString() + "//" + oTimeStamp);
        System.out.println(cpInt.toString() + "/" + cpDouble.toString() + "/" + cpString + "/" + coInt.toString() + "/" + coDouble.toString() + "//" + cValue.toString() + "//" + coTimeStamp);
    }
}
