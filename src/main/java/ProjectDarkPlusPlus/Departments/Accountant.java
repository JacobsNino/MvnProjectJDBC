package ProjectDarkPlusPlus.Departments;

import ProjectDarkPlusPlus.Data.DatabaseHandler;

import java.sql.SQLException;

public class Accountant {
    DatabaseHandler db;

    public Accountant() throws SQLException {
    this.db = new DatabaseHandler();
    }

    public void getCurrentEmployees() throws SQLException {
        db.fetchCurrentEmployees();
    }
    public void createUser(int employee_id,String firstname, String lastname, String dateofbirth,String telephoneNumber,String telephoneNumberICE,int monthlySalary) throws SQLException {
        db.createUser(employee_id,firstname,lastname,dateofbirth,telephoneNumber,telephoneNumberICE,monthlySalary);

    }
    public void deleteUser(int employee_id) throws SQLException {
        db.deleteUser(employee_id);
    }
    public void updateUser(int userId, String firstname, String lastname, String dateofbirth, String telephoneNumber, String telephoneNumberICE, int monthlySalary) throws SQLException {
        db.updateUser(userId,firstname,lastname,dateofbirth,telephoneNumber,telephoneNumberICE,monthlySalary);
    }
    public void updateUserfirstname(int user_id, String firstname) throws SQLException {
        db.updateUserFirstname(user_id,firstname);

    }
    public void updateUserlastname(int user_id, String lastname) throws SQLException {
        db.updateUserlastname(user_id,lastname);

    }
    public void updateUserdateofbirth(int user_id, String dateofbirth) throws SQLException {
        db.updateUserdateofbirth(user_id,dateofbirth);

    }
    public void updateUsertelephoneNumber(int user_id, String telephoneNumber) throws SQLException {
        db.updateUsertelephone(user_id,telephoneNumber);

    }
    public void updateUsertelephoneNumberICE(int user_id, String telephoneNumberICE) throws SQLException {
        db.updateUsertelephoneNumberICE(user_id,telephoneNumberICE);

    }
    public void updateUsermonthlySalary(int user_id, int monthlysalary) throws SQLException {
        db.updateUsermonthlySalary(user_id,monthlysalary);

    }
}
