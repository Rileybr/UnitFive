package com.company;// ****************************************************************
//   Student.java
//
//   Define a student class that stores name, score on test 1, and
//   score on test 2.  Methods prompt for and read in grades,
//   compute the average, and return a string containing student’s info.
// ****************************************************************
import java.util.Scanner;

public class Student
{
    private String name;
    private double score1;
    private double score2;


    public Student(String studentName)
    {
        name = studentName;
        score1 = 0.0;
        score2 = 0.0;
    }

    public void inputGrades()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter " + name + " grade one test 1: ");
        score1 = scanner.nextDouble();
        System.out.println("Enter " + name + " grade one test 2: ");
        score2 = scanner.nextDouble();
    }

    public double getAverage(){
        return ((score1 + score2)/ 2);
    }

    public String getName()
    {
        return name;
    }


    public String toString(){
        return "Name: " + name + " Test1: " + score1 + " Test2: " + score2;
    }



}
