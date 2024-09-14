import java.time.LocalDate;

public class Transactions {
    private String description;
    private double amount;
    private String transactionDate;
    //private LocalDate transactionDate;

    public Transactions(String des, double amount, String date) {
        this.description = des;
        this.amount = amount;
        this.transactionDate = date;
    }

    public String getDescription() {
        return description;
    }

    public double getAmount() {
        return amount;
    }

    public void printAll() {
        System.out.print("Transaction Date\t");
        System.out.print("Item Description\t");
        System.out.print("Amount\n");
        System.out.printf("%s\t\t\t", this.transactionDate);
        System.out.printf("%s\t\t\t\t", this.description);
        System.out.printf("%s", this.amount);
    }
}
