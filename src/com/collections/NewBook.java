package com.collections;

import com.util.InputUtil;

import java.util.ArrayList;
import java.util.List;

public class NewBook {
    // GLOBAL LIST TO STORE PERSON RECORD
    List<Book> BOOK = new ArrayList<>();
    private Object Book;


    //	ADD METHOD
    public void addRecord()
    {
        final String fname, lname, address, city, state, phone,zip;

        System.out.print("Enter First Name : ");
        fname = InputUtil.getStringValue();
        System.out.print("Enter Last Name : ");
        lname = InputUtil.getStringValue();
        System.out.print("Enter Phone Number : ");
        phone = InputUtil.getStringValue();
        System.out.print("Enter Address : ");
        address = InputUtil.getStringValue();
        System.out.print("Enter city : ");
        city = InputUtil.getStringValue();
        System.out.print("Enter zip : ");
        zip = InputUtil.getStringValue();
        System.out.print("Enter state : ");
        state = InputUtil.getStringValue();

        BOOK.add(new Book(fname,lname,address,city,state,phone,zip));
    } // END of addRecord()

    //	DISPLAY METHOD
    public void displayRecord()
    {
        if (BOOK.isEmpty())
        {
            System.out.println("No Records!!!");
        }
        else {
            for (Book person : BOOK) {
                System.out.println(Book);
            }
        }
    } // END OF displayRecord

    //	EDIT METHOD
    public void editRecord()
    {
        int id,choice, i=0;
        String fname,lname,address,city,state,phone,zip;
        for(Book person: BOOK)
        {
            System.out.println("ID: #"+BOOK.indexOf(person)+" : "+person);
        }
        System.out.print("\nEnter #ID to Edit Contact : ");
        id = InputUtil.getIntValue();
        System.out.println(BOOK.get(id));
        while(i==0) {
            System.out.println("""
                    What You Want to edit...
                    \t1: Address
                    \t2: city
                    \t3: State
                    \t4: Phone
                    \t5: Zip Code
                    \t6. Save And Exit
                    """);
            choice = InputUtil.getIntValue();
            switch (choice) {
                case 1 -> {
                    System.out.print("Enter new Address : ");
                    address = InputUtil.getStringValue();
                    BOOK.get(id).setAddress(address);
                }
                case 2 -> {
                    System.out.print("Enter new City : ");
                    city = InputUtil.getStringValue();
                    BOOK.get(id).setCity(city);
                }
                case 3 -> {
                    System.out.print("Enter new State : ");
                    state = InputUtil.getStringValue();
                    BOOK.get(id).setState(state);
                }
                case 4 -> {
                    System.out.print("Enter new Phone : ");
                    phone = InputUtil.getStringValue();
                    BOOK.get(id).setPhone(phone);
                }
                case 5 -> {
                    System.out.print("Enter new Zip Code : ");
                    zip = InputUtil.getStringValue();
                    BOOK.get(id).setZip(zip);
                }
                case 6 -> i = 1;
                default -> System.out.println("Please Enter Valid Option");
            }
            System.out.println(BOOK.get(id));
        }
    } //end of edit() method

    //	DELETE METHOD
    public void deleteRecord()
    {
        int id;
        for(Book p: BOOK)
        {
            System.out.println("ID: #"+BOOK.indexOf(p)+" : "+p);
        }
        System.out.print("\nEnter #ID to delete Contact : ");
        id = InputUtil.getIntValue();
        BOOK.remove(id);
    }
}

