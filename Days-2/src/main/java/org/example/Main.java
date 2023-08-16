package org.example;

import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        City c = new City();
        c.setCid(100);
        c.setName("İzmir");
        c.setCode("35");
        City c1 = new City(101, "Samsun", "55");

        City[] cities = {c,c1};
        String[] arr = {"Ankara", "İstanbul", "Bursa"};
        System.out.println(arr);
        UserArrayList userArrayList = new UserArrayList();
        userArrayList.result();

        System.out.println("=======HashMap=========");
        UseHashMap hashMap = new UseHashMap();
        hashMap.result();
        hashMap.standard(EGrup.A);

        System.out.println("=======XML=========");
        XmlRead xmlRead = new XmlRead();
        Set<Currency> list = xmlRead.xml();
        Currency[] arrx = list.toArray( new Currency[]{} );
        System.out.println( arrx.length );
        for ( Currency cx : arrx ) {
            System.out.println( cx );
        }
        System.out.println( arrx[0].getBanknoteSelling() );

    }

}