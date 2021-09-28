public class AssociateProfessor extends Employee{

    public double DA;
    public double HRA;
    public double PF;
    public double staffFundClub;
    public double basicPay;



    public AssociateProfessor(String employeeName, String employeeId, String employeeAddress, String employeeEmailID, String mobileNumber,double basicPay) {
        super(employeeName, employeeId, employeeAddress, employeeEmailID, mobileNumber);
        this.basicPay = basicPay;
        this.DA = 17;
        this.HRA = 10;
        this.PF = 12;
        this.staffFundClub = 0.1;
        this.basicPay = basicPay;
    }




    public double getBasicPay() {
        return basicPay;
    }

    public  static AssociateProfessor getInstance(String employeeName, String employeeId, String employeeAddress, String employeeEmailID, String mobileNumber, double basicPay){
        return new AssociateProfessor(employeeName, employeeId, employeeAddress, employeeEmailID, mobileNumber,basicPay);
    }

    public double  getGrossSalary(){
        double da = basicPay *(this.DA/100);
        double hra = basicPay *(this.HRA/100);
        double grossSalary = this.basicPay + da + hra;
        return grossSalary;

    }

    public double getNetSalary(){
        double pf = basicPay * (this.PF /100);
        double staffFund = basicPay * (this.staffFundClub/100);
        return getGrossSalary() - (pf + staffFund);
    }

}