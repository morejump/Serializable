package com.example.hp.serializable;

import java.io.Serializable;

/**
 * Created by HP on 9/9/2016.
 */
public class Contact implements Serializable {
    private String name;
    private String phone_number;

    public Contact(String name, String phone_number) {
        this.name = name;
        this.phone_number = phone_number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }
}
