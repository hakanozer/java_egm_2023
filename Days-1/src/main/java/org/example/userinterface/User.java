package org.example.userinterface;

import lombok.Data;

@Data
public class User {

    private String name;
    private String surname;
    private String email;
    private String password;
    @PhoneNumber
    private long phone;


}
