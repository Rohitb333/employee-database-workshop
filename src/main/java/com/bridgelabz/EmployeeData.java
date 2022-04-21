package com.bridgelabz;

import java.util.ArrayList;
import java.util.Date;

/*********************************************************************
 * @author Rohit Bansod
 * @version 1.0
 * @since 21-03-2022
 *
 **********************************************************************/

public class EmployeeData {
    public int id;
    public String name;
    public Date doj;
    ArrayList<EmployeeData> employeeList;

    public EmployeeData(int id, String name, Date doj) {
        this.id = id;
        this.name = name;
        this.doj = doj;
    }

    public EmployeeData() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {

        this.id = id;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDoj() {

        return doj;
    }

    public void setDoj(Date doj) {
        this.doj = doj;
    }

    @Override
    public String toString() {
        return "EmployeePayrollData{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", doj='" + doj + '\'' +
                '}';
    }
}

