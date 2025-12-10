package com.bridgelabs;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Contact {

    private String firstName;
    private String lastName;
    private String Area;
    private String city;
    private String state;
    private Integer zip;
    private Long phoneNumber;
    private String email;

}
