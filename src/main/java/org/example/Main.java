package org.example;

import java.util.Scanner;
import java.util.List;

public class Main {
    private static void printLine() {
        String line = String.valueOf('-').repeat(40);
        System.out.println(line);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String continueInput;
        CuratorJournal journal = new CuratorJournal();

        do {
            System.out.println("\tEnter record data");

            String lastName = ConsoleRegexInput.getInput(scanner, "Student's Last Name", "^[A-Za-z\\-]+$", "Last name should only contain alphabetic characters and hyphens.");
            String firstName = ConsoleRegexInput.getInput(scanner, "Student's First Name", "^[A-Za-z\\-]+$", "First name should only contain alphabetic characters and hyphens.");
            String birthDate = ConsoleRegexInput.getInput(scanner, "Birth Date (dd/mm/yyyy)", "^(3[01]|[12][0-9]|0?[1-9])(\\/|-)(1[0-2]|0?[1-9])\\2([0-9]{2})?[0-9]{2}$", "Birth date must be valid date in the format dd/mm/yyyy.");
            String phoneNumber = ConsoleRegexInput.getInput(scanner, "Phone Number (format +380XXXXXXXXX)", "^\\+380\\d{9}$", "Phone number must start with +380 and contain 9 digits after.");
            String address = ConsoleRegexInput.getInput(scanner, "Home Address (street, house, apartment)", "^\\S+\\s+\\S+\\s+\\S+$", "Address should contain street, house, and apartment separated by spaces.");

            JournalEntry record = new JournalEntry(lastName, firstName, birthDate, phoneNumber, address);
            journal.addJournalEntry(record);

            System.out.println("Entry successfully added to the journal.");

            List<JournalEntry> records = journal.getAllEntries();
            System.out.println("\nAll journal entries:");
            for (JournalEntry entry : records) {
                System.out.println(entry);
            }

            System.out.print("\nDo you want to enter a new record? (y/n): ");
            continueInput = scanner.nextLine().trim().toLowerCase();

            printLine();
        } while (continueInput.equals("y") || continueInput.equals("yes"));

        scanner.close();

        if (!continueInput.equals("n") && !continueInput.equals("no")) {
            System.out.println("Will exit program as input is invalid");
        }
    }
}