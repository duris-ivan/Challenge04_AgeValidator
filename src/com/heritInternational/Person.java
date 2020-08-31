package com.heritInternational;

import java.io.*;
import java.util.Scanner;

/**
 * Code description: Age validation
 * ---------------------------------
 * Assignment from HackerRank Challenge:
 * https://www.hackerrank.com/challenges/30-class-vs-instance/problem
 *
 *
 * Details:
 * ...if initial age < 0, program will show the following statement "Age is not valid..."
 * ...if initial age < 13, program will show the following statement "person is now a teenager..."
 * ...if 13 <= initial age < 18 , program will show the following statement " person is a teenager...."
 * ...if initial  18 <=age>30 , program will show the following statement " person is old...."
 * ...if initial 30 => age , program will show the following statement "Age value is not valid"
 */

public class Person {
    private int age;

    public Person(int initialAge) {
        if (initialAge>=0)
            this.age = initialAge;
        else{
            this.age = 0;
            System.out.println("Age is not valid, setting age to 0.");
        }
    }

    public void amIOld() {
        if (age<13)
            System.out.println("You are young.");
        else if(age>=13 & age<18)
            System.out.println("You are a teenager.");
        else
            System.out.println("You are old.");
    }

    public void yearPasses() {
        age++;
    }

    public static void main(String[] args) {
        System.out.println("enter number of TCs");
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        if (T>=1 & T<=4){
            for (int i = 0; i < T; i++) {
                System.out.println("enter age");
                int age = sc.nextInt();
                if (age>=-5 & age<=30){
                    Person p = new Person(age);
                    p.amIOld();
                    for (int j = 0; j < 3; j++) {
                        p.yearPasses();
                    }
                    p.amIOld();
                    System.out.println();
                }
                else
                    System.out.println("Age value is not valid");
            }
        }

        sc.close();
    }
}