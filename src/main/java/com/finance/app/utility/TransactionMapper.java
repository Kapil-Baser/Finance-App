package com.finance.app.utility;

import com.finance.app.model.Transaction;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class TransactionMapper {
    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("M/d/yyyy");

    private TransactionMapper() {}

    public static Transaction fromStatement(String statement) {
        String[] str = statement.split("[\",]+");
        return new Transaction(Double.parseDouble(str[4]), Utils.getCategory(str[3]), LocalDate.parse(str[1], formatter), LocalDate.parse(str[2], formatter), str[3]);
    }
}
