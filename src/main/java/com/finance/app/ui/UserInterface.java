package com.finance.app.ui;

import com.finance.app.model.Transaction;
import com.finance.app.utility.TransactionMapper;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.BufferedReader;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class UserInterface {
    private final BufferedReader reader;
    private final List<Transaction> transactions = new ArrayList<>();

    public UserInterface(final BufferedReader reader) {
        this.reader = reader;
    }

    public void start() {
        // Skipping the first line since it contains the header
        Stream<String> statements = reader.lines().skip(1);

        statements.forEachOrdered(statement -> {
            Transaction transaction = TransactionMapper.fromStatement(statement);
            transactions.add(transaction);
        });

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
            } else {
                listCommands();
            }
        }
    }

    public static void listCommands() {
        System.out.println("Commands: ");
        System.out.println("1. list - to list all the transactions");
        System.out.println("2. quit - to quit");
    }

    public static void printHeader() {
        System.out.print("#\tTransaction date\tPosted date\t\t\tDescription\t\t\t\t Cost\t\tCategory%n");
        System.out.println("-----------------------------------------------------------------------------------------");
    }

    public void printAll() {
        printHeader();

        IntStream.range(0, transactions.size())
                .forEach(count -> System.out.printf("%d\t%s%n", (count + 1), transactions.get(count)));

    }
}
