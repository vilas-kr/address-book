package com.bridgelabs;

import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

@Getter
@Setter
public class Library {

    private HashMap<String, AddressBook> library;

    public Library(){
        library = new HashMap<String, AddressBook>();
    }

    public void addAddressBook(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Addressbook name : ");
        String name = scanner.nextLine();
        System.out.println(name);

        if(library.containsKey(name)){
            System.out.println("Name is already present");
            return;
        }
        library.put(name, new AddressBook());
        System.out.println("Address book created");
    }

    public AddressBook getAddressBook(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Address book name : ");
        String name = scanner.nextLine();
        return library.get(name);
    }

}
