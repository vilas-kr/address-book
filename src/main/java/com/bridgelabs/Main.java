package com.bridgelabs;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello and welcome to Address Book!");
        Library library = new Library();
        AddressBook book;
        Contact contact;

        while (true){
            System.out.print("Enter 1 : Create Address Book\nEnter 2 : Add contacts\nEnter 3 : exit\n" +
                    "Enter your choice : ");
            int choice = scanner.nextInt();
            switch (choice){
                case 1 : library.addAddressBook();
                         break;

                case 2 : book = library.getAddressBook();
                         if(book == null) {
                             System.out.println("Invalid name");
                             break;
                         }
                         contactMenu(book);
                         break;

                case 3 : return;

                default : System.out.println("Invalid input");

            }
        }

    }

    public static void contactMenu(AddressBook book){
        Contact contact;
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.print("Enter 1 : new contact \nEnter 2 : Edit contact\nEnter 3 : delete contact\n" +
                    "Enter 4 : exit\nEnter your choice : ");
            int choice = scanner.nextInt();
            switch (choice){
                case 1 : contact = book.addContact();
                    System.out.println(contact);
                    break;

                case 2 : contact = book.modifyContact();
                    System.out.println(contact);
                    break;

                case 3 : contact = book.removeContact();
                    System.out.println(contact);
                    break;

                case 4 : return;

                default : System.out.println("Invalid input");
            }
        }
    }
}