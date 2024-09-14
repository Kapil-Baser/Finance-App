import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;
import java.nio.file.Paths;


public class FinanceApp {
    public static void main(String[] args) {

        System.out.println(new Date());
        if (args.length != 1) {
            System.out.println("Usage: financeapp <File Name>");
            return;
        }

        // Reading the given file
        ArrayList<Transactions> list = new ArrayList<>();
        try (Scanner scan = new Scanner(Paths.get(args[0]))) {
            String header = scan.nextLine();
            while (scan.hasNextLine()) {
                String transaction = scan.nextLine();
                String[] str = transaction.split("[\",]+");
                Transactions statement = new Transactions(str[3], Double.parseDouble(str[4]), str[1]);
                list.add(statement);
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        list.getFirst().printAll();
    }
}
