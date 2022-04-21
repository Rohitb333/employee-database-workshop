package com.bridgelabz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*********************************************************************
 * Purpose: Class for JDBC Connection.
 *
 * @author Rohit Bansod
 * @version 1.0
 * @since 21-04-2022
 *
 **********************************************************************/

public class EmployeeDataBase {
    public static final String urlJd = "jdbc:mysql://localhost:3306/payroll_service";
    public static final String userName = "root";
    public static final String password = "Pass@123";
    private static Connection connection = null;

    public static Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(urlJd, userName, password);
        } catch (ClassNotFoundException e) {
            throw new EmployeeException("invalid driver");
        } catch (SQLException throwable) {
            throw new EmployeeException("Invalid get connection parameters");
        }
        return connection;
    }

}