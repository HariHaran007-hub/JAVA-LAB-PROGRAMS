import java.io.DataInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    private static DataInputStream dataInputStream = new DataInputStream(System.in);

    public static void main(String[] args) {
        try {
            boolean isNotExecutable = false;
            while (!isNotExecutable) {
                System.out.println("Press: \n\t\t 1 --> Enter the application\n\t\t 2 --> Exit the application");
                int condition = Integer.parseInt(dataInputStream.readLine());
                switch (condition) {
                    case 1:
                        System.out.println("---------PAY SLIP GENERATOR----------");
                        paySlip();
                        break;
                    case 2:
                        System.out.println("Exiting the application.....");
                        isNotExecutable = true;

                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private static void paySlip() throws IOException {
        System.out.println("Enter category: \n\t\t 1 --> Programmer \n\t\t 2 --> Associate Professor " +
                "\n\t\t 3 --> Assistant Professor\n\t\t 4 --> Professor");
        int condition = Integer.parseInt(dataInputStream.readLine());

        System.out.print("Enter Employee name and ID: ");
        String name = dataInputStream.readLine();
        String employeeID = dataInputStream.readLine();
        System.out.println("Enter Employee address: ");
        String employeeAddress = dataInputStream.readLine();
        System.out.println("Enter employee email ID: ");
        String employeeEmailID = dataInputStream.readLine();
        System.out.println("Enter employee mobile number: ");
        String employeeMobileNumber = dataInputStream.readLine();
        System.out.println("Enter basic pay");
        double basicPay = Double.parseDouble(dataInputStream.readLine());

        switch (condition) {
            case 1://programmer
                Programmer p = Programmer.getInstance(name, employeeID, employeeAddress, employeeEmailID, employeeMobileNumber, basicPay);
                programmerBillGenerator(p);
                break;

            case 2:
                //associate professor
                AssociateProfessor aap = AssociateProfessor.getInstance(name, employeeID, employeeAddress, employeeEmailID, employeeMobileNumber, basicPay);
                associateProfessorBilGenerator(aap);
                break;

            case 3:
                //assistant professor
                AssistantProfessor ap = AssistantProfessor.getInstance(name, employeeID, employeeAddress, employeeEmailID, employeeMobileNumber, basicPay);
                assistantProfessorBillGenerator(ap);
                break;

            case 4:
                //Professor
                Professor pp = Professor.getInstance(name, employeeID, employeeAddress, employeeEmailID, employeeMobileNumber, basicPay);
                professorBillGenerator(pp);
                break;
        }
    }

    private static void programmerBillGenerator(Programmer p) {
        System.out.println("------------------------------PAY SLIP-----------------------------------");
        System.out.println("Name: " + p.getEmployeeName() + "\t\t\tID: " + p.getEmployeeId() + "\n"
                + "Residential Address: " + p.getEmployeeAddress() + "\t\t\tEmail ID: " + p.getEmployeeEmailID() + "\n" +
                "Mobile number: " + p.getMobileNumber() + "\t\t\tBasic pay: " + p.getBasicPay() + "\nCategory: Programmer\n"
                + "----------------------------------------------------------------------\n" +
                "Gross salary: " + p.getGrossSalary() + "\t\t\tNet salary: " + p.getNetSalary() + "\n" +
                "----------------------------------------------------------------------\n");
    }

    private static void assistantProfessorBillGenerator(AssistantProfessor p) {
        System.out.println("------------------------------PAY SLIP-----------------------------------");
        System.out.println("Name: " + p.getEmployeeName() + "\t\t\tID: " + p.getEmployeeId() + "\n"
                + "Residential Address: " + p.getEmployeeAddress() + "\t\t\tEmail ID: " + p.getEmployeeEmailID() + "\n" +
                "Mobile number: " + p.getMobileNumber() + "\t\t\tBasic pay: " + p.getBasicPay() + "\nCategory: Assistant professor\n"
                + "----------------------------------------------------------------------\n" +
                "Gross salary: " + p.getGrossSalary() + "\t\t\tNet salary: " + p.getNetSalary() + "\n" +
                "----------------------------------------------------------------------\n");
    }

    private static void associateProfessorBilGenerator(AssociateProfessor p) {
        System.out.println("------------------------------PAY SLIP-----------------------------------");
        System.out.println("Name: " + p.getEmployeeName() + "\t\t\tID: " + p.getEmployeeId() + "\n"
                + "Residential Address: " + p.getEmployeeAddress() + "\t\t\tEmail ID: " + p.getEmployeeEmailID() + "\n" +
                "Mobile number: " + p.getMobileNumber() + "\t\t\tBasic pay: " + p.getBasicPay() + "\nCategory: Associative professor\n"
                + "----------------------------------------------------------------------\n" +
                "Gross salary: " + p.getGrossSalary() + "\t\t\tNet salary: " + p.getNetSalary() + "\n" +
                "----------------------------------------------------------------------\n");
    }

    private static void professorBillGenerator(Professor p) {
        System.out.println("------------------------------PAY SLIP-----------------------------------");
        System.out.println("Name: " + p.getEmployeeName() + "\t\t\tID: " + p.getEmployeeId() + "\n"
                + "Residential Address: " + p.getEmployeeAddress() + "\t\t\tEmail ID: " + p.getEmployeeEmailID() + "\n" +
                "Mobile number: " + p.getMobileNumber() + "\t\t\tBasic pay: " + p.getBasicPay() + "\nCategory: Professor\n"
                + "----------------------------------------------------------------------\n" +
                "Gross salary: " + p.getGrossSalary() + "\t\t\tNet salary: " + p.getNetSalary() + "\n" +
                "----------------------------------------------------------------------\n");
    }
}
