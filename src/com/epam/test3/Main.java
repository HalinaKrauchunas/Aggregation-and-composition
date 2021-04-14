package com.epam.test3;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        InputStreamReader reader = new InputStreamReader (System.in);
        ArrayList<Student> students = new ArrayList<> (10);

        while (students.size () != 2){
            students.add (new Student (reader));
        }

        for (Student student : students) {
            if (Arrays.stream(student.getProgress ()).min ().getAsInt ()> 8){
                System.out.println (student);
            }
        }
    }
}