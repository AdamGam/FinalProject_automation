package utilities;

import java.sql.DriverManager;

public class ManageDB extends CommonOps{
    /*
###############################################################################
Method name : openConnection
Method Description :  this method open the connection of data base
###############################################################################
*/
    public static void openConnection(String dbURL, String user, String pass){

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(dbURL, user, pass);
            stmt = con.createStatement();
        } catch (Exception e) {
            System.out.println("error occurred while connection to DB, see Details: " + e);
        }
    }
    /*
###############################################################################
Method name : closeConnection
Method Description : this method close the connection of data base
###############################################################################
*/
    public static void closeConnection(){
        try {
            con.close();
        } catch (Exception e) {
            System.out.println("error occurred while closing to DB, see Details: " + e);
        }
    }
}
