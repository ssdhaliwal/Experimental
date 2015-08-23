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
public class MemoryResultSet implements Serializable, Cloneable {
    private static final long serialVersionUID = 7136493755090426373L;

    private Map<String, EntityDescriptor> _entity = null;
}
