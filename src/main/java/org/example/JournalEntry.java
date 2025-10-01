package org.example;

public class JournalEntry {
    private final String lastName;
    private final String firstName;
    private final String birthDate;
    private final String phoneNumber;
    private final String address;

    public JournalEntry(String lastName, String firstName, String birthDate, String phoneNumber, String address) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.birthDate = birthDate;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student: " + lastName + " " + firstName + ", Birth Date: " + birthDate + ", Phone: " + phoneNumber + ", Address: " + address;
    }
}
