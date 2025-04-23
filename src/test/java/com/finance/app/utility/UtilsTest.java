package com.finance.app.utility;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


class UtilsTest {
    private String description;

    @Test
    void shouldReturnUnknownWhenEmptyDescription() {
        // Arrange
        description = "";

        // Act & Assert
        assertEquals("Unknown",Utils.getCategory(description));
    }

    @Test
    void shouldReturnGasWhenDescriptionIsExxonMobil() {
        // Arrange
        description = "ExxonMobil";

        // Act & Assert
        assertEquals("Gas", Utils.getCategory(description));
    }

    @Test
    void shouldReturnSubscriptionsWhenDescriptionIsAudible() {
        // Arrange
        description = "Audible";

        // Act & Assert
        assertEquals("Subscriptions", Utils.getCategory(description));
    }

    @Test
    void shouldThrowNullPointerExceptionWhenDescriptionIsNull() {
        // Arrange
        description = null;

        // Act & Assert
        assertThrows(NullPointerException.class, () -> Utils.getCategory(description));
    }

}