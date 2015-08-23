/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elsu.database;

import java.io.*;
import java.util.*;

/**
 *
 * @author ss.dhaliwal
 */
public class EntityDescriptor implements Serializable, Cloneable {
    private static final long serialVersionUID = 5099557402995654788L;
    
    private String _schema = "";
    private String _catalog = "";
    private String _owner = "";
    private String _entity = "";
    
    private boolean _isReadOnly = true;
    private boolean _isDirty = false;
    private int _columnCount = 0;
    private int _rowCount = 0;
    private int _maxRows = 0;

    private Map<String, FieldDescriptor> _fields = null;
    private ArrayList<RowDescriptor> _rows = null;
    private Map<String, Map<String, RowDescriptor>> _index = null;

}
