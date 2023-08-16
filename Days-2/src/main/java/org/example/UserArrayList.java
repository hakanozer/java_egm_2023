package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UserArrayList {

    public void result() {

        ArrayList<String> arr = new ArrayList<>();
        List<String> ls = new ArrayList<>();

        // item add
        ls.add("Ankara");
        ls.add("İstanbul");
        ls.add("Bursa");
        ls.add("Adana");

        // index add
        ls.add(1, "Hatay");

        List<String> lsx = new ArrayList<>();
        lsx.add("Gaziantep");
        lsx.add("Samsun");
        ls.addAll(lsx);

        boolean containsStatus =  ls.contains("Hatay");
        System.out.println(containsStatus);

        int size = ls.size();
        int index = 100;
        if ( size >= index ) {
            String st = ls.get(index);
            System.out.println(st);
        }

        String number = "10";
        char[] arrs = number.toCharArray();
        for ( char c : arrs ) {
            if ( Character.isDigit(c) ) {
            }
        }
        int cNumber = Integer.parseInt(number);

        int ind = ls.indexOf("Hatay");
        System.out.println(ind);

        ls.remove("Hatay");

        // ls.clear();

        // Order
        Collections.sort(ls);
        Collections.reverse(ls);

        System.out.println( ls );

        List<City> cities = new ArrayList<>();
        City c = new City();
        c.setCid(100);
        c.setName("İzmir");
        c.setCode("35");

        City c1 = new City(101, "Samsun", "55");
        cities.add(c);
        cities.add(c1);

        for( City item : cities ) {
            System.out.println( item );
        }

    }

}
