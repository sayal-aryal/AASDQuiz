package com.edu.miu.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data

public class Contact {
    private String firstName;
    private String lastName;
    private String company;
    private String jobTitle;
    private List<PhoneNumber> phoneNumbers;
    private List<EmailAddress> emailAddresses;

    public Contact(String firstName, String lastName, String company, String jobTitle) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.company = company;
        this.jobTitle = jobTitle;
    }

    public void addPhoneNumber(String number, String label) {
        this.phoneNumbers = new ArrayList<>();
        phoneNumbers.add(new PhoneNumber(number, label));
    }

    public void addEmailAddress(String address, String label) {
        this.emailAddresses = new ArrayList<>();
        emailAddresses.add(new EmailAddress(address, label));
    }

    public void updateFirstName(String newFirstName) {
        this.firstName = newFirstName;
    }

    public void updateLastName(String newLastName) {
        this.lastName = newLastName;
    }

    public void updateCompany(String newCompany) {
        this.company = newCompany;
    }

    public void updateJobTitle(String newJobTitle) {
        this.jobTitle = newJobTitle;
    }

    public void printAsJson() {
        System.out.println("{");
        System.out.println("  \"firstName\": \"" + firstName + "\",");
        System.out.println("  \"lastName\": \"" + lastName + "\",");
        System.out.println("  \"company\": \"" + company + "\",");
        System.out.println("  \"jobTitle\": \"" + jobTitle + "\",");
        System.out.println("  \"phoneNumbers\": [");
        for (PhoneNumber phoneNumber : phoneNumbers) {
            System.out.println("    {");
            System.out.println("      \"address\": \"" + phoneNumber.getNumber() + "\",");
            System.out.println("      \"label\": \"" + phoneNumber.getLabel() + "\"");
            System.out.println("    },");
        }
        System.out.println("  ],");
        System.out.println("  \"emailAddresses\": [");
        for (EmailAddress emailAddress : emailAddresses) {
            System.out.println("    {");
            System.out.println("      \"address\": \"" + emailAddress.getAddress() + "\",");
            System.out.println("      \"label\": \"" + emailAddress.getLabel() + "\"");
            System.out.println("    },");
        }
        System.out.println("  ]");
        System.out.println("}");
    }
}
