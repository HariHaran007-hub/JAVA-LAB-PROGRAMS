import java.io.DataInputStream;
import java.io.IOException;


public class Main {
    private static DataInputStream dataInputStream = new DataInputStream(System.in);


    public static void main(String[] args) throws IOException {
        BillDetails details = new BillDetails();
        boolean isNotExecutable = false;
        while (!isNotExecutable) {
            int condition;
            System.out.println("Enter 1 --> Run the application \n " +
                    "     2 --> Exit the application");
            condition = Integer.parseInt(dataInputStream.readLine());

            switch (condition) {
                case 1:
                    System.out.println("Starting the application.....");
                    System.out.println("Enter consumer ID: ");
                    String ID = dataInputStream.readLine();
//                    scanner.nextLine();
                    System.out.println("Enter consumer name: ");
                    String name = dataInputStream.readLine();
                    System.out.println("Enter previous reading: ");
                    double previousReading = Double.parseDouble(dataInputStream.readLine());

                    System.out.println("Enter current reading: ");
                    double currentReading = Double.parseDouble(dataInputStream.readLine());

                    System.out.println("Enter \n D --> Domestice wiring \n" +
                            " C --> Comercial wiring");
                    String conditionString = dataInputStream.readLine();
                    boolean isDomestic = conditionString.equalsIgnoreCase("d");
                    calculateBill(details.getInstance(ID, name, previousReading, currentReading, isDomestic));
                    break;

                case 2:
                    System.out.println("Exiting the application......");
                    isNotExecutable = true;
                    break;
            }
        }
    }

    private static void calculateBill(BillDetails details) {

        double charge;
        double reading;
        if (details.isDomestic()) {
            reading = details.getCurrentReading() - details.getPreviousReading();

            if (reading <= 100) {
                charge = reading * 1;
            } else if (reading > 100 && reading <= 200) {
                charge = (100 * 1) + ((reading-100 )* 2.50) ;
            } else if (reading > 200 && reading <= 500) {
                charge = (100*1)+(100*2.50) +(reading-200) * 4;
            } else {
                charge = (100*1)+(100*2.50)+(300*4)+((reading-500)*6);
            }
        } else {
            reading = details.getCurrentReading() - details.getPreviousReading();
            if (reading <= 100) {
                charge = reading * 2;
            } else if (reading > 100 && reading <= 200) {
                charge = (100 * 1) + ((reading-100 )* 4.50) ;
            } else if (reading > 200 && reading <= 500) {
                charge = (100*1)+(100*2.50) +(reading-200) * 6;
            } else {
                charge = (100*1)+(100*2.50)+(300*4)+((reading-500)*7);
            }
        }
        printDetails(details, charge, reading, details.isDomestic());

    }

    private static void printDetails(BillDetails details, double charge, double reading, boolean isDomestic) {
        System.out.println("-------------------------------------------------------");
        System.out.println("Name : " + details.getConsumerName() + "\t\t" + "Consumer ID: " + details.getConsumerNumber());
        System.out.println("Current Reading : " + reading+"\nCharge: "+charge);
        if (isDomestic) {
            System.out.print("Type of wiring: Domestic wiring ");
        } else {
            System.out.print("Type of wiring: Industrial wiring ");
        }
        System.out.println();
        System.out.println("-------------------------------------------------------");
           }
}
