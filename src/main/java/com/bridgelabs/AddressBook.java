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

    //create a new contact and add it to the list
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

    /* find the contact by there first name and return index of the contact
    if contact not present return -1 */
    public int findContactByFirstName(String firstName) {
        for(int i = 0; i < contacts.size(); i++){
            if(contacts.get(i).getFirstName().equalsIgnoreCase(firstName))
                return i;
        }
        return -1;
    }

    public Contact modifyContact(){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter First Name : ");
        String firstName = scanner.nextLine();
        int index = findContactByFirstName(firstName);

        if(index == -1){
            System.out.println("Enter valid name");
            return null;
        }

        //update details
        System.out.print("Enter Last Name : ");
        contacts.get(index).setLastName(scanner.nextLine());

        System.out.print("Enter Area : ");
        contacts.get(index).setArea(scanner.nextLine());

        System.out.print("Enter City : ");
        contacts.get(index).setCity(scanner.nextLine());

        System.out.print("Enter State : ");
        contacts.get(index).setState(scanner.nextLine());

        System.out.print("Enter Pincode : ");
        contacts.get(index).setZip(scanner.nextInt());

        System.out.print("Enter Phone Number : ");
        contacts.get(index).setPhoneNumber(scanner.nextLong());
        scanner.nextLine();

        System.out.print("Enter Email : ");
        contacts.get(index).setEmail(scanner.nextLine());

        return contacts.get(index);
    }

    //Remove contact from the list
    public Contact removeContact(){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter First Name : ");
        String firstName = scanner.nextLine();
        int index = findContactByFirstName(firstName);

        if(index == -1){
            System.out.println("Enter valid name");
            return null;
        }

        Contact contact = contacts.get(index);
        contacts.remove(index);
        return contact;
    }
}
