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
    private boolean _nullable = true;
    private boolean _caseSensitive = false;
    private boolean _readOnly = false;
    private boolean _identity = false;
    private boolean _currency = false;
    private boolean _signed = false;
    private int _displaySize = 0;
    private int _precision = 0;
    private int _scale = 0;
    private String _className = "";

    private int _fieldPosition = 0;

    public FieldDescriptor(String name, boolean nullable, boolean caseSensitive,
            boolean readOnly, boolean identity, boolean currency, boolean signed,
            int displaySize, int precision, int scale, String className, 
            int fieldPosition) {
        this._name = name;
        
        this._nullable = nullable;
        this._caseSensitive = caseSensitive;
        this._readOnly = readOnly;
        this._identity = identity;
        this._currency = currency;
        this._signed = signed;
        
        this._displaySize = displaySize;
        this._precision = precision;
        this._scale = scale;
        
        this._className = className;
        //this._type = type;
        
        this._fieldPosition = fieldPosition;
    }
    
    public String getName() {
        return this._name;
    }

    public boolean isNullable() {
        return this._nullable;
    }

    public boolean isCaseSensitive() {
        return this._caseSensitive;
    }

    public boolean isReadOnly() {
        return this._readOnly;
    }

    public boolean isIdentity() {
        return this._identity;
    }

    public boolean isCurrency() {
        return this._identity;
    }

    public boolean isSigned() {
        return this._identity;
    }

    public int getDisplaySize() {
        return this._displaySize;
    }

    public int getPrecision() {
        return this._precision;
    }

    public int getScale() {
        return this._scale;
    }

    public String getClassName() {
        return this._className;
    }

    public int getFieldPosition() {
        return this._fieldPosition;
    }
}
