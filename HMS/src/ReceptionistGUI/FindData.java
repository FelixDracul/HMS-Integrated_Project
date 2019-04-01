/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ReceptionistGUI;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Kulitha Abeywardena
 */
public class FindData extends DBConnection{
    
    protected String pid, pfn, pln, did, df;
            
    void findApp(String aid){
        try{
            Class.forName(driver);
            Connection con= DriverManager.getConnection(url, userName, Password);
            //Statement st = con.createStatement();
            String query1 = "SELECT patientID, DocID FROM appointments WHERE appID = ?";
            PreparedStatement pst = con.prepareStatement(query1);
            pst.setString(1, aid);
            ResultSet rs1 = pst.executeQuery(query1);
            
            while(rs1.next()){
                pid = rs1.getString("patientID");
                did = rs1.getString("DocID");
            }
            /*tring query2 = "SELECT pFName, pLName FROM patients WHERE patID = '"+pid+"'";
            ResultSet rs2 = pst.executeQuery(query2);
            
            while(rs2.next()){
                pfn = rs2.getString("pFName");
                pln = rs2.getString("pLName");
            }
            
            String query3 = "SELECT DocFee FROM doctors WHERE DocID = '"+did+"'";
            ResultSet rs3 = pst.executeQuery(query3);
            
            while(rs3.next()){
                df = rs3.getString("DocFee");
            }*/
            JOptionPane.showMessageDialog(null, pid + did);
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Error: " + ex);
        }
    }
}
