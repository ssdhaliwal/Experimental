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
public class fpaHeaderBlock {
    public int _arrayFirst = 0;
    public int _arrayLast = 0;
    public boolean _hasData = false;
    
    public fpaHeaderBlock(String controlFile, String storePath) {
        
    }
    
    
    public void writeHeaderBlock() {
        
    }
    
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        
        result.append(String.format("%15d", _arrayFirst));
        result.append(String.format(",%15d", _arrayLast));
        result.append(String.format(",%5s", String.valueOf(_hasData)));
        
        return result.toString();
    }
}
