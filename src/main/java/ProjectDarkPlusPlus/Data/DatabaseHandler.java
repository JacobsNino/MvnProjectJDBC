package ProjectDarkPlusPlus.Data;

import ProjectDarkPlusPlus.model.employeeId;
import com.mysql.cj.protocol.Resultset;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseHandler {
    private String host = "jdbc:mysql://moktok.javawebdev.com:33306/nino";
    private String user = "nino";
    private String password = "nino2020";
    private Connection connection;
    private Statement statement;
    private ResultSet rs;

    public DatabaseHandler() throws SQLException {
        this.connectToDB();

    }

    public void connectToDB() throws SQLException {
        connection = DriverManager.getConnection(host, user, password);
    }

    public void fetchCurrentEmployees() throws SQLException {
        statement = connection.createStatement();
        rs = statement.executeQuery("SELECT *  FROM Employee");
        System.out.println(" Current employees: ");
        while (rs.next()) {
            System.out.println(rs.getInt("employee_id") + "\t" +
                    rs.getString("firstname") + "\t" +
                    rs.getString("lastname") + "\t" +
                    rs.getString("dateofbirth") + "\t" +
                    rs.getString("telephoneNumber") + "\t" +
                    rs.getString("telephoneNumberICE") + "\t" +
                    rs.getInt("monthlySalary"));
        }
    }

    public void createUser(int employee_id, String firstname, String lastname, String dateofbirth, String telephoneNumber, String telephoneNumberICE, int monthlySalary) throws SQLException {
        PreparedStatement ps = connection.prepareStatement("INSERT INTO Employee " +
                "VALUES(?,?,?,?,?,?,?) ");
        ps.setInt(1, employee_id);
        ps.setString(2, firstname);
        ps.setString(3, lastname);
        ps.setString(4, dateofbirth);
        ps.setString(5, telephoneNumber);
        ps.setString(6, telephoneNumber);
        ps.setInt(7, monthlySalary);

        int res = ps.executeUpdate();
    }

    public void deleteUser(int employee_id) throws SQLException {
        statement = connection.createStatement();
        int res = statement.executeUpdate("DELETE FROM Employee WHERE employee_id = " + employee_id);

    }


    public void updateUser(int userId, String firstname, String lastname, String dateofbirth, String telephoneNumber, String telephoneNumberICE, int monthlySalary) throws SQLException {
        PreparedStatement ps = connection.prepareStatement("UPDATE Employee " +
                "SET firstname = ?," +
                "lastname = ?," +
                "dateofbirth = ?," +
                "telephoneNumber = ?," +
                " telephoneNumberICE = ?," +
                "monthlySalary = ? " +
                "WHERE employee_id = ?");


        ps.setString(1, firstname);
        ps.setString(2, lastname);
        ps.setString(3, dateofbirth);
        ps.setString(4, telephoneNumber);
        ps.setString(5, telephoneNumber);
        ps.setInt(6, monthlySalary);
        ps.setInt(7,userId);

        int res = ps.executeUpdate();
    }

    public void updateUserFirstname(int user_id, String firstname) throws SQLException {
        PreparedStatement ps = connection.prepareStatement("UPDATE Employee " +
                "SET firstname = ?," + "WHERE employee_id = ?");

        ps.setString(1, firstname);
        ps.setInt(2,user_id);

        int res = ps.executeUpdate();

    }

    public void updateUserlastname(int user_id, String lastname) throws SQLException {
        PreparedStatement ps = connection.prepareStatement("UPDATE Employee " +
                "SET lastname = ?," + "WHERE employee_id = ?");

        ps.setString(1, lastname);
        ps.setInt(2,user_id);

        int res = ps.executeUpdate();

    }

    public void updateUserdateofbirth(int user_id, String dateofbirth) throws SQLException {
        PreparedStatement ps = connection.prepareStatement("UPDATE Employee " +
                "SET dateofbirth = ?," + "WHERE employee_id = ?");

        ps.setString(1, dateofbirth);
        ps.setInt(2,user_id);

        int res = ps.executeUpdate();

    }

    public void updateUsertelephone(int user_id, String telephonenumber) throws SQLException {
        PreparedStatement ps = connection.prepareStatement("UPDATE Employee " +
                "SET telephoneNumber = ?," + "WHERE employee_id = ?");

        ps.setString(1, telephonenumber);
        ps.setInt(2,user_id);

        int res = ps.executeUpdate();

    }

    public void updateUsertelephoneNumberICE(int user_id, String telephoneNumberICE) throws SQLException {
        PreparedStatement ps = connection.prepareStatement("UPDATE Employee " +
                "SET telephoneNumberICE = ?," + "WHERE employee_id = ?");

        ps.setString(1, telephoneNumberICE);
        ps.setInt(2,user_id);

        int res = ps.executeUpdate();

    }

    public void updateUsermonthlySalary(int user_id, int monthlySalary) throws SQLException {
        PreparedStatement ps = connection.prepareStatement("UPDATE Employee " +
                "SET monthlySalary = ?," + "WHERE employee_id = ?");

        ps.setInt(1, monthlySalary);
        ps.setInt(2,user_id);

        int res = ps.executeUpdate();

    }
    public void createProject(String project_id, String start_date, String decription, String price, String estimated_endDate) throws SQLException {
        PreparedStatement ps = connection.prepareStatement("INSERT INTO Projects " +
                "VALUES(?,?,?,?,?) ");
        ps.setString(1, project_id);
        ps.setString(2, start_date);
        ps.setString(3, decription);
        ps.setString(4, price);
        ps.setString(5, estimated_endDate);

        int res = ps.executeUpdate();
    }

    public void deleteProject(String Project_id) throws SQLException {
        statement = connection.createStatement();
        int res = statement.executeUpdate("DELETE FROM Projects WHERE Project_id = " + Project_id);

    }


    public void addRecord(int employee_id,String project_id, String date, int hourWork ) throws SQLException {
        PreparedStatement ps = connection.prepareStatement("INSERT INTO Workdone " +
                "VALUES(?,?,?,?,?) ");
        ps.setInt(1, employee_id);
        ps.setString(2, project_id);
        ps.setString(3, date);
        ps.setString(4, date);
        ps.setInt(5, hourWork);

        int res = ps.executeUpdate();
    }

    public void deleteRecord(int employee_id,String Project_id) throws SQLException {
        statement = connection.createStatement();
        int res = statement.executeUpdate("DELETE FROM Workdone WHERE employee_id = " + employee_id + "AND project_id = " + Project_id);
    }


//

}







