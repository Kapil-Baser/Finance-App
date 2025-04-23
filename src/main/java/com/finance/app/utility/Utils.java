package com.finance.app.utility;

import java.util.Objects;

public class Utils {

    private Utils() {}

    public static String getCategory(String description) {
        Objects.requireNonNull(description, "Description must not be null");
        String desL = description.toLowerCase();

        if (desL.contains("cafe") || desL.contains("drink") || desL.contains("tea") || desL.contains("donuts")) {
            return "Dining out";
        } else if (desL.contains("popeyes") || desL.contains("doordash") || desL.contains("bbq") || desL.contains("starbucks")) {
            return "Take out";
        } else if (desL.contains("prime") || desL.contains("subscription") || desL.contains("audible")) {
            return "Subscriptions";
        } else if (desL.contains("donation")) {
            return "Donations";
        } else if (desL.contains("exxonmobil")) {
            return "Gas";
        } else if (desL.contains("safeway")) {
            return "Grocery";
        }
        return "Unknown";
    }
}
