package org.example;

import org.example.inheritance.A;
import org.example.inheritance.Base;
import org.example.inheritance.C;
import org.example.useabstract.Customer;
import org.example.useabstract.Person;
import org.example.userinterface.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Main {

    public static void main(String[] args) {

       // A a = new A();
       // Object aObj = new A();
       // Base aBase = new A();

        ArrayList<String> arrayList = new ArrayList<>();
        List<String> arStrings = new ArrayList<>();

        run(arrayList);
        run(arStrings);

        A a = new A();
        C c = new C();

        execute(a);
        execute(c);

        Customer customer = new Customer(200);
        System.out.println( customer.name() );
        System.out.println( customer.total() );

        Person person = new Person() {
            @Override
            public int accountNumber() {
                return 100;
            }
        };
        System.out.println( person.name() );
        System.out.println( person.total() );

        UserImpl user = new UserImpl();
        Optional<User> optionalUser = user.userLogin("ali@mail.com", "12345");
        if (optionalUser.isPresent()) {
            User u = optionalUser.get();
        }


        UserImpl user1 = new UserImpl();
        IUser user2 = new UserImpl();
        IAddress user3 = new UserImpl();
        user3.getUserAddress(10);
        iCall(user1);
        iCall(user2);
        iCall(user3);

    }

    public static void iCall(IBase iBase) {
        iBase.userControl("ali");
    }

    public static void execute( Base base ) {
        if ( base instanceof A ) {
           A objA = (A) base;
           objA.pdf();
        }
        base.call();
    }


    public static void run( List<String> arr ) {

    }

}