package com.example.thirukuralpazhagu;

import java.io.Serializable;

public class RecycleAdapter implements Serializable {
    private String users;
    public RecycleAdapter(String users) {
        this.users = users;
    }
    public String getUsers() {
        return users;
    }

    public void setUsers(String users) {
        this.users = users;
    }
}
