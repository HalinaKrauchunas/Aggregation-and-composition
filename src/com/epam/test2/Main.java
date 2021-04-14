package com.epam.test2;

public class Main {

    public static void main(String[] args) {

        Test2 test1 = new Test2 ();
        Test2 test2 = new Test2 ();
        System.out.println (test2.getName ());
        test2.setCost (56);
        System.out.println (test2.getCost ());
        test2.setName ("Alex");
        System.out.println (test2.getName ());

    }
}
