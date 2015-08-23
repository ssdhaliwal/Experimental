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
public class FieldDescriptor implements Serializable, Cloneable {
    private static final long serialVersionUID = -7416407102795717036L;
    
    private String _name = "";
    private boolean _isNullable = true;
    private boolean _isCaseSensitive = false;
    private boolean _isReadOnly = false;
    private boolean _isIdentity = false;
    private boolean _isKey = false;
    private boolean _isHidden = false;
    private int _displaySize = 0;
    private int _bufferSize = 0;
    private int _precision = 0;
    private int _scale = 0;
    private String _className = "";

    private DatabaseDataType _type = DatabaseDataType.dtstring;
    private int _fieldPosition = 0;
}
