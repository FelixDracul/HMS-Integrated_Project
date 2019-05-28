/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DoctorGUI;

/**
 *
 * @author Kulitha Abeywardena
 */
public class DBConnection {
     protected String driver = "com.mysql.jdbc.Driver";
    protected String url = "jdbc:mysql://localhost:3306/hms?serverTimezone=UTC";
    protected String userName ="root";
    protected String Password ="";
    
    public String getDriver(){
        return driver;
    }
    public String getUrl(){
        return url;
    }
    String getUserName(){
        return userName;
    }
    String getPassword(){
        return Password;
    }
    
}
