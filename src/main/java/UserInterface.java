import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {
    private ArrayList<Transactions> transactionList;
    private Scanner scanner;

    public UserInterface(Scanner scan) {
        this.scanner = scan;
        this.transactionList = new ArrayList<>();

    }

    public void start() {
        String header = scanner.nextLine();
        while (scanner.hasNextLine()) {
            String transaction = scanner.nextLine();
            String[] str = transaction.split("[\",]+");
            Transactions statement = new Transactions(str[3], Double.parseDouble(str[4]), str[1]);
            this.transactionList.add(statement);
        }
    }

}
