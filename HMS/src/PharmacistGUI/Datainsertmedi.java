/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PharmacistGUI;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Maleesha Nanayakkara
 */
public class Datainsertmedi extends DBMconnection {String mediinsert (int MCode, String MName, String Mg, int MQty, double Mprice, String MBrand){
        String query ="INSERT INTO medicine_in (Code, Name, Dosage, Quantity, Unit_price, Brand) VALUES ('"+MCode+"', '"+MName+"', '"+Mg+"', '"+MQty+"', '"+Mprice+"','"+MBrand+"')";
        String message="";
        try{
            Class.forName(driver);
            Connection con = DriverManager.getConnection(url, userName, Password);
            Statement st = con.createStatement();
            st.executeUpdate(query);
            message ="Data has been entered successfully!";
            
        
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null,ex.getMessage());
            message ="Error" + ex;
        }
        
        return message;
    }
    
}
