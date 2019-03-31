/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ReceptionistGUI;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author FelixDracul
 */
public class InsertData extends DBConnection{
    String insertApp(char appid, char patid, char docid, char billid, String symp, String date, String time, int qnum){
        String query ="INSERT INTO appointments (appID,patientID,DocID,billID,symptoms,date,time,queueNum) VALUES ("+appid+", '"+patid+"', '"+docid+"', '"+billid+"', '"+symp+"', '"+date+"', "+qnum+")";
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
