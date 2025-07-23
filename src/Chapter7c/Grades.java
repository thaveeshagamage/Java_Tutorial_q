package Chapter7c;

import java.util.Scanner;

public class Grades {
    private static int[] grades;
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("How many grades would you like to enter? ");
        grades = new int[sc.nextInt()];

        getGrades();

    }
    private static void getGrades() {
        for(int i = 0; i <grades.length; i++){
            System.out.println("Enter grade " +(i+1)+":");
            grades[i] = sc.nextInt();
            if(grades[i] < 0 || grades[i] > 100){
                System.out.println("Invalid grade. Please enter a grade between 0 and 100.");
                i--; // Decrement i to repeat this iteration
            }
        }
        System.out.println("Grades entered successfully.");
        printGrades();
        System.out.println("Sum of total Grades is" + getSumOfGrades());
        System.out.println("Grade Average:" + (getSumOfGrades()/grades.length));
    }
    private static int getSumOfGrades() {
        int sum = 0;
        for(int grade:grades){
            sum += grade;
        }
        return sum;
    }
    private static void printGrades() {
        System.out.println("The grades you entered are: ");
        for(int i =0; i<grades.length; i++){
            System.out.println("Grade" + (i+1) + ":" + grades[i]);
        }
    }

}
