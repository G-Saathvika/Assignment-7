package com.assignment.sectionthree.main;

import com.assignment.sectionthree.classes.Librarian;
import com.assignment.sectionthree.interfaces.ManageBooks;
import com.assignment.sectionthree.interfaces.ManageTransactions;
import com.assignment.sectionthree.interfaces.NotificationService;
import com.assignment.sectionthree.interfaces.Work;

public class Main {
    public static void main(String[] args) {
        Librarian librarian = new Librarian();

        transaction(librarian);
        books(librarian);
        notify(librarian);
        working(librarian);
    }

    public static void transaction(ManageTransactions transactions){
        transactions.transactionThroughCredit();
    }

    public static void books(ManageBooks books){
        books.addBook();
    }

    public static void notify(NotificationService service){
        service.emailNotification();
    }

    public static void working(Work work){
        work.issuePass();
    }
}
