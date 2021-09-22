package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is the maximum number of marks?");
        int maxMarks = input.nextInt();
        Boolean progression = true;
        while (true) {
            System.out.println("What is the attained number of marks by the student?");
            int studentMarks = input.nextInt();
            if (studentMarks > maxMarks){
                progression = false;
            }
            if (progression == true) {
                double studentPercentage = (double) studentMarks / maxMarks * 100;
                System.out.println("The Student got " + studentPercentage + " percent");
                if (studentPercentage >= 40) {
                    System.out.println("Student attained a U");
                }
                if ((studentPercentage > 40) && (studentPercentage< 49)) {
                    System.out.println("Student attained an E");
                }
                if ((studentPercentage > 50) && (studentPercentage< 59)) {
                    System.out.println("Student attained a D");
                }
                if ((studentPercentage > 60) && (studentPercentage< 69)) {
                    System.out.println("Student attained a C");
                }
                if ((studentPercentage > 70) && (studentPercentage< 79)) {
                    System.out.println("Student attained a B");
                }
                if (studentPercentage >= 80) {
                    System.out.println("Student attained an A");
            }
        } }






        }
    }

