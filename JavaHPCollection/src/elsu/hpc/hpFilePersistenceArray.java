/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elsu.hpc;

/**
 *
 * @author ss.dhaliwal
 */
public class hpFilePersistenceArray extends hpTArray<String> {
    // create file with header record - 15 digit first, 15 digit last, 20 char filler
    // total records of size array with record size of 15 digits, 35 char file name
    // lookup file should be random read/write from multiple threads
}
