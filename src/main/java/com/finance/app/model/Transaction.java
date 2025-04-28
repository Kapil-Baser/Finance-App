package com.finance.app.model;

import java.time.LocalDate;

public record Transaction(double amount, String category, LocalDate transactionDate, LocalDate postedDate,
                          String description) {

    @Override
    public String toString() {
        return String.format("%-12s\t\t%-12s\t\t%-25s%.2f\t\t%-12s%n", this.transactionDate, this.postedDate, this.description, this.amount, this.category);
    }
}
