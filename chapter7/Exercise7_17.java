// (Sort students) Write a program that prompts the user to enter the number of stu-
// dents, the students’ names, and their scores and prints student names in decreasing
// order of their scores. Assume the name is a string without spaces, use the Scan­
// ner’s next() method to read a name.
package chapter7;

import java.util.Scanner;

public class Exercise7_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number of students: "); 

        int numberOfStudents = input.nextInt();
        String[] studentNames = new String[numberOfStudents];
        double[] studentScores = new double[numberOfStudents];

        System.out.print("Enter student names and score: ");

        for (int i = 0; i < studentScores.length; i++) {
            studentNames[i] = input.next(); 
            studentScores[i] = input.nextDouble(); 
        }

        selectionSort(studentScores, studentNames);
        
        for (int j = studentScores.length - 1; j >= 0; j--) {
            System.out.println("Name: " + studentNames[j] + "; Score: " + studentScores[j]); 
        }

        input.close();
    }

    public static void selectionSort(double[] list, String[] names) {
        for (int i = 0; i < list.length - 1; i++) {
            double currentMin = list[i];
            int currentMinIndex = i;

            for (int j = i + 1; j < list.length; j++) {
                if (currentMin > list[j]) {
                    currentMin = list[j];
                    currentMinIndex = j;
                } 
            }

            if (currentMinIndex != i) {
                list[currentMinIndex] = list[i];
                list[i] = currentMin;
                String temp = names[currentMinIndex];
                names[currentMinIndex] = names[i];
                names[i] = temp;
            }
        }
    }
}
