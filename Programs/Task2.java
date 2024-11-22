import java.util.*;
import java.util.Random;

class Student {
    Scanner oc = new Scanner(System.in);
    String[] name;
    int[] id;
    int numSubject, n, total;
    char grade;
    int[] marks;
    double avg;

    Student() {
        System.out.println("Welcome to Student Grade calculator");
        System.out.print("How many students do you want to enter: ");
        n = oc.nextInt();
        name = new String[20];
        id = new int[4];
    }

    void enter() {
        
        for (int i=0; i<n;i++) {
            System.out.print("Enter student " + (i + 1) + " Name: ");
            name[i] = oc.next();

            System.out.print("Enter student ID: ");
            id[i] = oc.nextInt();
            

            System.out.print("Enter the number of subjects: ");
            numSubject = oc.nextInt();
            marks = new int[numSubject];

            total = 0;

            for (int j=0;j<numSubject;j++) {
                System.out.print("Enter marks for subject " + (j + 1) + ": ");
                marks[j] = oc.nextInt();
                total += marks[j];
            }

            avg=(double)total/numSubject;
            grade();
            dis();
        }
    }

    void grade() {
        if (avg>=80) {
            grade='A';
        } else if (avg>=65) {
            grade='B';
        } else if (avg>=50) {
            grade='C';
        } else if (avg>=35) {
            grade='D';
        } else {
            grade='F';
        }
    }

    void dis() {
        System.out.println("\nTotal Marks: " + total);
        System.out.println("Average Percentage: " + avg + "%");
        System.out.println("Grade: " + grade);
        System.out.println("\n");
    }
}

public class Task2 {
    public static void main(String[] args) {
        Student s = new Student();
        s.enter();
    }
}


