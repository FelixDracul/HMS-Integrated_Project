/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DoctorGUI;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Maleesha Nanayakkara
 */
public class InsertData extends DBConnection {String prescripinsert(String AppID,String MENAME,String Dosagemg){
     String query ="INSERT INTO pastmedi (AppID,medicineN,Dosage_(mg)) VALUES ("+AppID+", "+MENAME+","+Dosagemg+")";
     String message="";
     try{
            Class.forName(driver);
            Connection con = DriverManager.getConnection(url, userName, Password);
            Statement st = con.createStatement();
            st.executeUpdate(query);
            message ="Medicine has been entered !";
            
        
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null,ex.getMessage());
            message ="Error" + ex;
        }
        
        return message;
    }
}
        
  
    

