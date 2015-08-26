/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package memrowset.test;

import ac.core.*;
import ac.factory.*;
import com.google.gson.*;
import elsu.database.rowset.*;
import elsu.events.*;
import elsu.support.*;
import java.util.*;

/**
 *
 * @author ss.dhaliwal
 */
public class RowsetUnitTest implements IEventSubscriber {

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
                EntityDescriptor wrs = rut1.af.getDbManager().getDataRowSet("SELECT * FROM ncs3.vwSite",
                        null);
                //System.out.println(ActionObject.toXML(wrs));
                //System.out.println(".. records selected: " + wrs.size());

                //RowDescriptor rd = new RowDescriptor(_fields);
                FieldDescriptor fd = null;
                for (String field : wrs.getFields()) {
                    fd = wrs.getField(field);
                    System.out.println(fd.toString());
                }

                for (RowDescriptor rd : wrs.getRows()) {
                    System.out.println(rd.toString());
                }

                Gson gson = new Gson();
                String jObj = GsonXMLStack.Object2JSon(wrs.getRows());
                JsonParser parser = new JsonParser();
                JsonArray jArray = parser.parse(jObj).getAsJsonArray();
                for (JsonElement jElement : jArray) {
                    //JsonObject jObject = (JsonObject)jElement;
                    System.out.println(jElement);
                }

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
