import java.util.ArrayList;
import java.util.Scanner;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: financeapp <File Name>");
            return;
        }

        // Reading the given file
        ArrayList<String> list = new ArrayList<>();
        try (Scanner scan = new Scanner(Paths.get(args[0]))) {
            while (scan.hasNextLine()) {
                list.add(scan.nextLine());
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println(list);
    }
}
