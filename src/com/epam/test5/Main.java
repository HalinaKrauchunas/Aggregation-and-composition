package com.epam.test5;

public class Main {

    public static void main(String[] args) {

        Counter counter1 = new Counter (9, 3);
        Counter counter2 = new Counter (3, 6, 5);
        Counter counter3 = new Counter (11, 1, 21);
        Counter counter4 = new Counter ();

        System.out.println ("Current state: " + counter1.getCurr () + " " + counter2.getCurr () + " " + counter3.getCurr () + " " + counter4.getCurr ());

        for (int i = 0; i < 10; ++i) {
            counter1.increase ();
            counter2.increase ();
            counter3.increase ();
            counter4.increase ();
        }
        System.out.println ("Current increase(10): " + counter1.getCurr () + " " + counter2.getCurr () + " " + counter3.getCurr () + " " + counter4.getCurr ());

        for (int i = 0; i < 10; ++i) {
            counter1.decrease ();
            counter2.decrease ();
            counter3.decrease ();
            counter4.decrease ();
        }
        System.out.println ("Current decrease(10): " + counter1.getCurr () + " " + counter2.getCurr () + " " + counter3.getCurr () + " " + counter4.getCurr ());
    }
}
