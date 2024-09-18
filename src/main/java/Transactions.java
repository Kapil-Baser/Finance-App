import java.time.LocalDate;

public class Transactions {
    private final String description;
    private final double amount;
    private final String transactionDate;
    private String category;
    //private LocalDate transactionDate;

    public Transactions(String des, double amount, String date) {
        this.description = des;
        this.amount = amount;
        this.transactionDate = date;
        this.category = getCategory(des);
    }

    public String getDescription() {
        return description;
    }

    public double getAmount() {
        return amount;
    }

    public String getTransactionDate() {
        return this.transactionDate;
    }

    public void printAll() {
        System.out.print("Transaction Date\t");
        System.out.print("Item Description\t");
        System.out.print("Amount\n");
        System.out.printf("%s\t\t\t", this.transactionDate);
        System.out.printf("%s\t\t\t\t", this.description);
        System.out.printf("%s", this.amount);
    }

    @Override
    public String toString() {
        return this.transactionDate + "\t\t\t " + this.description + "\t\t\t\t" + this.amount;
    }

    public String getCategory() {
        return this.category;
    }

    private String getCategory(String description) {
        String desL = description.toLowerCase();
        if (desL.contains("cafe") || desL.contains("drink") || desL.contains("tea") || desL.contains("donuts")) {
            return "Dining out";
        } else if (desL.contains("popeyes") || desL.contains("doordash") || desL.contains("bbq") || desL.contains("starbucks")) {
            return "Take out";
        }
        return "Unknown";
    }
}
