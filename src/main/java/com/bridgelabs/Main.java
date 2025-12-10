package com.bridgelabs;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello and welcome to Address Book!");

        AddressBook book = new AddressBook();
        Contact contact;

        while(true){
            System.out.print("Enter 1 : new contact \nEnter 2 : Edit contact\nEnter 3 : exit\n");
            int choice = scanner.nextInt();
            switch (choice){
                case 1 : contact = book.addContact();
                         System.out.println(contact);
                         break;

                case 2 : contact = book.modifyContact();
                         System.out.println(contact);
                         break;

                case 3: return;

                default : System.out.println("Invalid input");
            }
        }

    }
}