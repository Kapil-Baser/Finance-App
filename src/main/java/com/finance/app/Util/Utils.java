package com.finance.app.Util;

public class Utils {
    public static String getCategory(String description) {
        String desL = description.toLowerCase();
        if (desL.contains("cafe") || desL.contains("drink") || desL.contains("tea") || desL.contains("donuts")) {
            return "Dining out";
        } else if (desL.contains("popeyes") || desL.contains("doordash") || desL.contains("bbq") || desL.contains("starbucks")) {
            return "Take out";
        } else if (desL.contains("prime") || desL.contains("subscription") || desL.contains("audible")) {
            return "Subscriptions";
        }
        return "Unknown";
    }
}
