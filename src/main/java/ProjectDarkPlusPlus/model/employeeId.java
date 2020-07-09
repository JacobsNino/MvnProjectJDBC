package ProjectDarkPlusPlus.model;

public class employeeId {
    private int employeeId;
    private String firstname;
    private String lastname;
    private String dateofbirth;
    private String telephonenumber;
    private String telephonenumberICE;
    private int monthlySalary;

    public employeeId() {
    }

    public employeeId(int employeeId, String firstname, String lastname, String dateofbirth, String telephonenumber, String telephonenumberICE, int monthlySalary) {
        this.employeeId = employeeId;
        this.firstname = firstname;
        this.lastname = lastname;
        this.dateofbirth = dateofbirth;
        this.telephonenumber = telephonenumber;
        this.telephonenumberICE = telephonenumberICE;
        this.monthlySalary = monthlySalary;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getDateofbirth() {
        return dateofbirth;
    }

    public void setDateofbirth(String dateofbirt) {
        this.dateofbirth = dateofbirt;
    }

    public String getTelephonenumber() {
        return telephonenumber;
    }

    public void setTelephonenumber(String telephonenumber) {
        this.telephonenumber = telephonenumber;
    }

    public String getTelephonenumberICE() {
        return telephonenumberICE;
    }

    public void setTelephonenumberICE(String telephonenumberICE) {
        this.telephonenumberICE = telephonenumberICE;
    }

    public int getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(int monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    @Override
    public String toString() {
        return "employeeId{" +
                "employeeId='" + employeeId + '\'' +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", dateofbirt='" + dateofbirth + '\'' +
                ", telephonenumber='" + telephonenumber + '\'' +
                ", telephoneICE='" + telephonenumberICE + '\'' +
                ", monthlySalary='" + monthlySalary + '\'' +
                '}';
    }
}
