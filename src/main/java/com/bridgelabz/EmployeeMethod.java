package com.bridgelabz;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/*********************************************************************
 * Purpose: Class for Implementation Of EmployeeMethod.
 *
 * @author Rohit Bansod
 * @version 1.0
 * @since 21-04-2022
 *
 **********************************************************************/
public class EmployeeMethod {

    PreparedStatement preparedStatement;
    Connection connection = EmployeeDataBase.getConnection();

    public void insertData(String empName, String doj) {
        String sql = "sql into employee (Name,DOJ) values(?,?);";
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, empName);
            preparedStatement.setString(2, doj);
            preparedStatement.execute();
            System.out.println("Added Successfully");

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public void deleteData(String name) throws SQLException {
        String sql = "sql from employee where Name = ? ";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, name);
        preparedStatement.executeUpdate();
        System.out.println("Delete Record SuccessFully");
    }

    public void displayRecord() throws SQLException {

        try {
            // SQL command data stored in String datatype
            String sql = "select * from employee";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSets = preparedStatement.executeQuery();

            // Printing ID, name, email of customers
            // of the SQL command above
            System.out.println("id\t\t name\t\t DOJ");

            // Condition check
            while (resultSets.next()) {

                int id = resultSets.getInt("Id");
                String name = resultSets.getString("Name");
                String doj = resultSets.getString("DOJ");
                System.out.println(id + "\t\t" + name + "\t\t" + doj);
            }
        }

        // Catch block to handle exception
        catch (SQLException e) {

            // Print exception pop-up on screen
            System.out.println(e);
        }
    }


}

