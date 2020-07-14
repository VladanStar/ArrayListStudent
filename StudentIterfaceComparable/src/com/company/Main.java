package com.company;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        // write your code here
        new Main();
    }

    public Main() {
        ArrayList<Student> studenti = new ArrayList<Student>();

        for (int i = 0; i < 20; i++) {
            Student s = new Student(Util.getRandomIndeks(), Util.getRandomIme(), Util.getRandomIme());
            studenti.add(s);
        }
        Collections.sort(studenti);
        for (Student s : studenti) {
            System.out.println(s);
        }
    }
}
