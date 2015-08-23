/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elsu.database;

import java.io.*;

/**
 *
 * @author ss.dhaliwal
 */
public class RowDescriptor implements Serializable, Cloneable {
    private static final long serialVersionUID = 934305883195588595L;
    
    private boolean _isDeleted = false;
    private boolean _isChanged = false;
    
    private GenericWrapper[] _originalRow = null;
    private GenericWrapper[] _row = null;
}
