package ProjectDarkPlusPlus.Departments;

import ProjectDarkPlusPlus.Data.DatabaseHandler;

import java.sql.SQLException;

public class ProjectManager {
    DatabaseHandler db;

    public ProjectManager() throws SQLException {
        this.db = new DatabaseHandler();
    }

    public void createProject(String project_id, String start_date, String decription, String price, String estimated_endDate) throws SQLException {
        db.createProject(project_id, start_date, decription, price, estimated_endDate);
    }
    public void deleteProject(String Project_id) throws SQLException {
        db.deleteProject(Project_id);
    }

}
