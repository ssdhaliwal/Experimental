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
public class fpaDataBlock {
    public int _id = 0;
    public String _data = null;
    
    public fpaDataBlock(String controlFile, String storePath) {
        
    }
    
    public void writeDataBlock(int id, String data) {
        
    }

    @Override
    protected void finalize() throws Throwable {
        try {
        } finally {
            super.finalize();
        }
    }
    
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        
        result.append(String.format("%15d", _id));
        result.append(String.format(",%35s", _data));
        
        return result.toString();
    }
}
