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
        listCommands();
        processCommands();
    }

    private void processCommands() {
        Scanner scan = new Scanner(System.in);
        while (true) {
            String command = scan.nextLine();
            if (command.equals("quit")) {
                break;
            } else if (command.equals("list")) {
                this.printAll();
            }
        }
    }

    public static void listCommands() {
        System.out.println("Commands: ");
        System.out.println("1. list - to list all the transactions");
        System.out.println("2. quit - to quit");
    }

    public static void printHeader() {
        System.out.print("Transaction date\tDescription\t\t\t\t Cost\n");
        System.out.println("--------------------------------------------------");
    }

    public void printAll() {
        printHeader();
        for (Transactions transaction : transactionList) {
            //System.out.println(transaction);
            System.out.printf("%-12s\t\t%-25s%.2f\n", transaction.getTransactionDate(), transaction.getDescription(), transaction.getAmount());
        }
    }
}
