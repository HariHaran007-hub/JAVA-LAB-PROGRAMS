package BILL;
public class BillDetails {
    private String consumerNumber;
    private String consumerName;
    private double previousReading;
    private double currentReading;
    private boolean isDomestic;

    public BillDetails(String consumerNumber, String consumerName, double previousReading, double currentReading, boolean isDomestic) {
        this.consumerNumber = consumerNumber;
        this.consumerName = consumerName;
        this.previousReading = previousReading;
        this.currentReading = currentReading;
        this.isDomestic = isDomestic;
    }
    public BillDetails(){

    }

    public String getConsumerNumber() {
        return consumerNumber;
    }

    public void setConsumerNumber(String consumerNumber) {
        this.consumerNumber = consumerNumber;
    }

    public String getConsumerName() {
        return consumerName;
    }

    public void setConsumerName(String consumerName) {
        this.consumerName = consumerName;
    }

    public double getPreviousReading() {
        return previousReading;
    }

    public void setPreviousReading(int previousReading) {
        this.previousReading = previousReading;
    }

    public double getCurrentReading() {
        return currentReading;
    }

    public void setCurrentReading(int currentReading) {
        this.currentReading = currentReading;
    }

    public boolean isDomestic() {
        return isDomestic;
    }

    public void setDomestic(boolean domestic) {
        isDomestic = domestic;
    }

    public BillDetails getInstance(String consumerNumber, String consumerName, double previousReading, double currentReading, boolean isDomestic){
        return new BillDetails(consumerNumber,consumerName,previousReading,currentReading,isDomestic);
    }
}