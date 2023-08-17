package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Result {

    public List<User> data( int count ) {
        List<User> ls = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            User u = new User();
            u.setName("Name: " + i);
            u.setRandom(new Random());
            ls.add(u);
        }
        return ls;
    }

}
