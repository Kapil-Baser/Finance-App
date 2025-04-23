package com.finance.app;

import com.finance.app.ui.UserInterface;

import java.io.*;
import java.util.Date;


public class FinanceApp {
    public static void main(String[] args) {

        System.out.println(new Date());

        if (args.length != 1) {
            System.out.println("Usage: financeapp <File Name>");
            return;
        }
        // Reading the given file
        try (BufferedReader reader = new BufferedReader(new FileReader(args[0]))) {
            UserInterface ui = new UserInterface(reader);
            ui.start();
        } catch (IOException ex) {
            throw new UncheckedIOException(String.format("File: %s not found.", args[0]), ex);
        }

    }
}
