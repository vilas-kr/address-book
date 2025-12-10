package com.bridgelabs;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class AddressBook {

    private List<Contact> contacts;

    public AddressBook(){
        contacts = new ArrayList<Contact>();
    }

}
