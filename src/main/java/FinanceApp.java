import java.io.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.nio.file.Paths;


public class FinanceApp {
    public static void main(String[] args) throws IOException {

        System.out.println(new Date());
        if (args.length != 1) {
            System.out.println("Usage: financeapp <File Name>");
            return;
        }
        // Reading the given file
        try (BufferedReader reader = new BufferedReader(new FileReader(args[0]))) {
            UserInterface ui = new UserInterface(reader);
            ui.start();
        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }


        /*try (Scanner scan = new Scanner(Paths.get(args[0]))) {
            UserInterface ui = new UserInterface(scan);
            ui.start();

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }*/
    }
}
