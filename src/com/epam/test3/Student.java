//3. Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы, успеваемость (массив из пяти
// элементов). Создайте массив из десяти элементов такого типа. Добавьте возможность вывода фамилий и номеров групп
// студентов, имеющих оценки, равные только 9 или 10.

package com.epam.test3;

import java.io.*;
import java.util.*;

public class Student {

    private String surnameNP;
    private int numbGroup;
    private int[] progress;

    public Student(InputStreamReader reader) {

        System.out.println ("Surname NP: ");
        this.surnameNP = reader.readLine ();
        System.out.println ("Group: ");
        this.numbGroup = Integer.parseInt (String.valueOf (reader.readLine ()));
        this.progress = new int[5];
        System.out.println ("Progress: ");
        for (int count = 0; count < progress.length; count++) {
            progress[count] = Math.abs (Math.min (Integer.parseInt (String.valueOf (reader.readLine ())), 10));
        }
    }

    public String getSurnameNP() {

        return surnameNP;
    }

    public void setSurnameNP(String surnameNP) {

        this.surnameNP = surnameNP;
    }

    public int getNumbGroup() {

        return numbGroup;
    }

    public void setNumbGroup(int numbGroup) {

        this.numbGroup = numbGroup;
    }

    public int[] getProgress() {

        return progress;
    }

    public void setProgress(int[] progress) {

        this.progress = progress;
    }

    @Override
    public String toString() {

        return "Surname NP \"" + surnameNP +
            "\", group: " + numbGroup;
    }
}
