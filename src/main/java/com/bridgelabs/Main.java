package com.bridgelabs;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("Hello and welcome!");

        AddressBook book = new AddressBook();

        Contact contact = book.addContact();
        System.out.print(contact);

    }
}