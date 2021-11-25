package com.search;

import java.awt.print.Book;
import java.util.List;

public class sort {
    public static void sortByName(List<Book> person) {
        person.sort(Book.firstNameSorting);
        for (Book p : person) {
            System.out.println(p);
        }
    }

    public static void sortByCity(List<Book> person) {
        person.sort(Book.citySorting);
        for (Book p : person) {
            System.out.println(p);
        }
    }

    public static void sortByState(List<Book> person) {
        person.sort(Book.stateSorting);
        for (Book p : person) {
            System.out.println(p);
        }
    }

    public static void sortByZip(List<Book> person) {
        person.sort(Book.zipSorting);
        for (Book p : person) {
            System.out.println(p);
        }
    }
}

