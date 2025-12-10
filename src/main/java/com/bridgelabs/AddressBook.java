package com.bridgelabs;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@Getter
@Setter
public class AddressBook {

    private List<Contact> contacts;

    public AddressBook(){
        contacts = new ArrayList<Contact>();
    }

    public Contact addContact(){

        Scanner scanner = new Scanner(System.in);
        Contact contact = new Contact();

        //Fetching details
        System.out.print("Enter First Name : ");
        contact.setFirstName(scanner.nextLine());

        System.out.print("Enter Last Name : ");
        contact.setLastName(scanner.nextLine());

        System.out.print("Enter Area : ");
        contact.setArea(scanner.nextLine());

        System.out.print("Enter City : ");
        contact.setCity(scanner.nextLine());

        System.out.print("Enter State : ");
        contact.setState(scanner.nextLine());

        System.out.print("Enter Pincode : ");
        contact.setZip(scanner.nextInt());

        System.out.print("Enter Phone Number : ");
        contact.setPhoneNumber(scanner.nextLong());
        scanner.nextLine();

        System.out.print("Enter Email : ");
        contact.setEmail(scanner.nextLine());

        contacts.add(contact);
        return contact;

    }
}
