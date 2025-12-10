package com.bridgelabs;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
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
