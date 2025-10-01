package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CuratorJournal {
    private final List<JournalEntry> journal = new ArrayList<>();

    public void addJournalEntry(JournalEntry record) {
        journal.add(record);
    }

    public List<JournalEntry> getAllEntries() {
        return Collections.unmodifiableList(journal);
    }
}
