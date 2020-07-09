package ProjectDarkPlusPlus.model;

public class Projects {
    private String projectid;
    private String startdate;
    private String description;
    private String price;
    private  String estimatedendDate;


    public Projects() {
    }

    public Projects(String projectid, String startdate, String description, String price, String estimatedendDate) {
        this.projectid = projectid;
        this.startdate = startdate;
        this.description = description;
        this.price = price;
        this.estimatedendDate = estimatedendDate;
    }

    public String getProjectid() {
        return projectid;
    }

    public void setProjectid(String projectid) {
        this.projectid = projectid;
    }

    public String getStartdate() {
        return startdate;
    }

    public void setStartdate(String startdate) {
        this.startdate = startdate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getEstimatedendDate() {
        return estimatedendDate;
    }

    public void setEstimatedendDate(String estimatedendDate) {
        this.estimatedendDate = estimatedendDate;
    }

    @Override
    public String toString() {
        return "Projects{" +
                "projectid='" + projectid + '\'' +
                ", startdate='" + startdate + '\'' +
                ", description='" + description + '\'' +
                ", price='" + price + '\'' +
                ", estimatedendDate='" + estimatedendDate + '\'' +
                '}';
    }
}
