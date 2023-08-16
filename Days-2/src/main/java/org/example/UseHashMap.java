package org.example;

import java.sql.Array;
import java.util.*;

public class UseHashMap {

    public void result() {

        Map<String, Object> hm = new HashMap<>();
        // item add
        hm.put("name", "Ali Bilmem");
        hm.put("name", "Ali Bilirim");
        hm.put("age", 30);
        hm.put("status", true);

        // get item
        System.out.println( hm.get("name") );

        // keys
        Set<String> keys = hm.keySet();
        for ( String key : keys ) {
            System.out.println( hm.get(key) );
        }

        System.out.println( hm );

        List<Map<EApp, Object>> lsx = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Map<EApp, Object> hmMap = new LinkedHashMap<>();
            hmMap.put(EApp.name, "Erkan - " +i);
            hmMap.put(EApp.surname, "Bilsin");
            hmMap.put(EApp.email, "erkan@mail.com");
            hmMap.put(EApp.phone, 5455558866l);
            System.out.println( hmMap );
            lsx.add(hmMap);
        }

        for ( Map<EApp, Object> item : lsx ) {
            System.out.println( item.get( EApp.name ) );
        }

    }

    public void standard( EGrup eGrup ) {
        switch (eGrup){
            case A:
                break;
            case B:
                break;
            case C:
                break;
        }
    }

}
