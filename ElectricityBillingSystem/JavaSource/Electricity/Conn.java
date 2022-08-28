package ElectricityBillingSystem.JavaSource.Electricity;

import java.sql.*;

public class Conn {
    
    private static final String driver = "com.microsoft.sqlserver.jdbc.SQLServerDrive";

    private static final String jdbcURL = "jdbc:sqlserver://localhost:1433;databasename=ebs;integratedSecurity=true;";

    Connection con;
    Statement state; 

    public Conn(){
    
        try {

            Class.forName(driver);
            con = DriverManager.getConnection(jdbcURL);
            state = con.createStatement();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}