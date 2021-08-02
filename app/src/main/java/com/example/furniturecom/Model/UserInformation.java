package com.example.furniturecom.Model;

public class UserInformation {
    String name;
    String email;

    public UserInformation(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}
