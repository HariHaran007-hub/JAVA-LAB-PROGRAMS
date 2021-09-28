public class Employee {

    public String employeeName;
    public String employeeId;
    public String employeeAddress;
    public String employeeEmailID;
    public String mobileNumber;

    public Employee(String employeeName, String employeeId, String employeeAddress, String employeeEmailID, String mobileNumber) {
        this.employeeName = employeeName;
        this.employeeId = employeeId;
        this.employeeAddress = employeeAddress;
        this.employeeEmailID = employeeEmailID;
        this.mobileNumber = mobileNumber;
    }



    public String getEmployeeName() {
        return employeeName;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public String getEmployeeAddress() {
        return employeeAddress;
    }

    public String getEmployeeEmailID() {
        return employeeEmailID;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }



}
