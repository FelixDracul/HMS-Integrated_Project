/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ReceptionistGUI;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Kulitha Abeywardena
 */
public class InsertData extends DBConnection{
    String insertApp(String appid, String patid, String docid, String billid, String date, String time, int qnum){
        String query ="INSERT INTO appointments (appID,patientID,DocID,billID,date,time,queueNum) VALUES ('"+appid+"', '"+patid+"', '"+docid+"', '"+billid+"', '"+date+"', '"+time+"', "+qnum+")";
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
            message ="Error: " + ex;
        }
        
        return message;
    }
    
    String insertPat(String pid, String pfn, String pln, String pdob, int pcnum, String paddr, String gen){
        String query = "INSERT INTO patients (patID,pFName,pLName,pDoB,pContactNum,pAddress,pGender) VALUES ('"+pid+"', '"+pfn+"', '"+pln+"', '"+pdob+"', "+pcnum+", '"+paddr+"', '"+gen+"')";
        String message="";
        try{
            Class.forName(driver);
            Connection con = DriverManager.getConnection(url, userName, Password);
            Statement st = con.createStatement();
            st.executeUpdate(query);
            message = "Patient has been successfully registered!";
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Error: " + ex);
        }
        return message;
    }
    
    String insertBill(String bid, String aid, String pid, double totfee){
        String query = "INSERT INTO bills (billID, appID, patID, totalFee) VALUES ('"+bid+"', '"+aid+"', '"+pid+"', "+totfee+")";
        String message="";
        try{
            Class.forName(driver);
            Connection con = DriverManager.getConnection(url, userName, Password);
            Statement st = con.createStatement();
            st.executeUpdate(query);
            message = "Bill has been successfully added! Bill number is: " + bid;
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Error: " + ex);
        }
        return message;
    }
}
