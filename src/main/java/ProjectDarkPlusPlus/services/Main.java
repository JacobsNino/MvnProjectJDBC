package ProjectDarkPlusPlus.services;

import ProjectDarkPlusPlus.Departments.Accountant;
import ProjectDarkPlusPlus.Departments.ProjectManager;
import ProjectDarkPlusPlus.model.employeeId;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws SQLException {

        Accountant accountant = new Accountant();
        ProjectManager projectManager = new ProjectManager();

        accountant.getCurrentEmployees();
       accountant.createUser(7,"bob","baggins","15/10/1979","047758597","047784592",1655);


        accountant.deleteUser(7);
        accountant.getCurrentEmployees();







    }
}
