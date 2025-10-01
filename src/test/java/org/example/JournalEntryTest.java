package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.*;

public class JournalEntryTest {

    @Test
    public void testJournalEntryCreation() {
        JournalEntry entry = new JournalEntry("Doe", "John", "01/01/2000", "+380123456789", "Main St 1 1A");
        assertNotNull(entry);
    }

    @Test
    public void testToString() {
        JournalEntry entry = new JournalEntry("Doe", "John", "01/01/2000", "+380123456789", "Main St 1 1A");
        assertNotNull(entry.toString());
    }
}
