package com.assignment.sectionthree.classes;

import com.assignment.sectionthree.interfaces.Work;

public class Librarian extends Staff implements Work {

    @Override
    public void addBook() {
        System.out.println("Add books to catalog");
    }

    @Override
    public void removeBook() {
        System.out.println("Remove books from catalog");
    }

    @Override
    public void transactionThroughDebit() {
        System.out.println("Manage transactions through debit card");
    }

    @Override
    public void transactionThroughCredit() {
        System.out.println("Manage transactions through credit card");
    }

    @Override
    public void emailNotification() {
        System.out.println("Notify via email");
    }

    @Override
    public void smsNotification() {
        System.out.println("Notify via SMS");
    }

    @Override
    public void issuePass() {
        System.out.println("Issue library pass");
    }
}
