/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package memrowset.test;

import ac.core.*;
import ac.factory.*;
import elsu.database.*;
import elsu.events.*;
import java.sql.*;
import java.util.*;
import javax.sql.rowset.*;

/**
 *
 * @author ss.dhaliwal
 */
public class RowsetUnitTest implements IEventSubscriber {

    MemoryResultSet mrs = new MemoryResultSet();

    public ActionFactory af = null;

    public RowsetUnitTest() {
        try {
            af = new ActionFactory();
            af.addEventListener(this);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public RowsetUnitTest(String config) {
        try {
            af = new ActionFactory(config);
            af.addEventListener(this);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // instantiate the main controller class and call its run()
            // method to start service factory
            RowsetUnitTest rut1 = new RowsetUnitTest();

            // update the action object direct syncprovider (if applicable)
            try {
                ActionObjectStack.setSyncProvider(rut1.af.getSyncProvider());
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }

            try {
                WebRowSet wrs = ActionObjectStack.Cursor(rut1.af.getDbManager(),
                        "NCS3.SPS_SITE",
                        new DatabaseDataType[]{DatabaseDataType.dtarray}, new Object[]{new Long[]{830L, 838L}});
                //System.out.println(ActionObject.toXML(wrs));
                System.out.println(".. records selected: " + wrs.size());

                Map<String, FieldDescriptor> _fields = new HashMap<String, FieldDescriptor>();
                ResultSetMetaData wrsRSMD = wrs.getMetaData();
                for (int i = 1; i < wrsRSMD.getColumnCount(); i++) {
                    FieldDescriptor fd = new FieldDescriptor(
                            wrsRSMD.getColumnName(i),
                            (wrsRSMD.isNullable(i) == ResultSetMetaData.columnNoNulls ? false : true),
                            wrsRSMD.isCaseSensitive(i),
                            wrsRSMD.isReadOnly(i),
                            wrsRSMD.isAutoIncrement(i),
                            wrsRSMD.isCurrency(i),
                            wrsRSMD.isSigned(i),
                            wrsRSMD.getColumnDisplaySize(i),
                            wrsRSMD.getPrecision(i),
                            wrsRSMD.getScale(i),
                            wrsRSMD.getColumnClassName(i),
                            i);
                }
                
                RowDescriptor rd = new RowDescriptor(_fields);

            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }

        } catch (Exception ex) {
            // Display a message if anything goes wrong
            System.err.println("RowsetUnitTest, main, " + ex.getMessage());
            System.exit(1);
        }
    }

    @Override
    public Object EventHandler(Object sender, IEventStatusType status, String message, Object o) {
        switch (EventStatusType.valueOf(status.getName())) {
            case DEBUG:
            case ERROR:
            case INFORMATION:
                System.out.println(status.getName() + ":" + message);
                break;
            default:
                break;
        }

        return null;
    }
}
