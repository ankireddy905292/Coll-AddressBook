package com.search;
import com.util.InputUtil;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.Dictionary;
import java.util.List;

public class Search {
    public static void searchByCityAndState(Dictionary<String,String> cityDict,Dictionary<String,String> stateDict)
    {
        System.out.println("In Progress...");
    }

    public static void searchByCity(List<Book> person)
    {
        String search;
        int flag = 0;
        List<Book> matches = new ArrayList<>();
        System.out.println("Enter First Name to search : ");
        search = InputUtil.getStringValue();
        for(Book p: person)
        {
            if(p.getCity().equalsIgnoreCase(search))
            {

                flag = 1;
                matches.add(p);
            }
        }
        if(flag == 1)
        {
            System.out.println("...Match Found...");
            for(Book p: matches)
            {
                System.out.println(p);
            }
        }
        else
        {
            System.out.println("Match Not Found!!!");
        }
    }
    public static void searchByState(List<Book> person)
    {
        String search;
        int flag = 0;
        List<Book> matches = new ArrayList<>();
        System.out.println("Enter First Name to search : ");
        search = InputUtil.getStringValue();
        for(Book p: person)
        {
            if(p.getState().equalsIgnoreCase(search))
            {

                flag = 1;
                matches.add(p);
            }
        }
        if(flag == 1)
        {
            System.out.println("...Match Found...");
            for(Book p: matches)
            {
                System.out.println(p);
            }
        }
        else
        {
            System.out.println("Match Not Found!!!");
        }
    }


    }

