package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

public class CuratorJournalTest {

    @Test
    public void testAddJournalEntry() {
        CuratorJournal journal = new CuratorJournal();
        JournalEntry entry = new JournalEntry("Doe", "John", "01/01/2000", "+380123456789", "Main St 1 1A");
        journal.addJournalEntry(entry);
        List<JournalEntry> entries = journal.getAllEntries();
        assertEquals(1, entries.size());
        assertEquals(entry, entries.getFirst());
    }

    @Test
    public void testGetAllEntriesIsUnmodifiable() {
        CuratorJournal journal = new CuratorJournal();
        JournalEntry entry = new JournalEntry("Doe", "John", "01/01/2000", "+380123456789", "Main St 1 1A");
        JournalEntry entry2 = new JournalEntry("Doe2", "John2", "30/12/2015", "+380987654321", "Other St 1 9B");
        journal.addJournalEntry(entry);
        journal.addJournalEntry(entry2);
        List<JournalEntry> entries = journal.getAllEntries();
        assertEquals(2, entries.size());
        assertEquals(entry, entries.getFirst());
        assertEquals(entry2, entries.get(1));
        assertThrows(UnsupportedOperationException.class, () -> entries.add(entry));
    }
}
