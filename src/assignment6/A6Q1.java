/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment6;

import java.util.Scanner;

/**
 *
 * @author keonj9218
 */
public class A6Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //creating a scanner for user input
        Scanner input = new Scanner(System.in);
        System.out.println("How many students are in the class?");
        int students = input.nextInt();
        //create a list of the number of students and their marks 
        double[] marks = new double[students];
        System.out.println("Enter the marks:");
        for (int i = 0; i < marks.length; i++) {
            marks[i] = input.nextDouble();
        }

        // use a for loop to determin the sum
        // start with an accumulator
        double sum = 0;
        // for loop to go through each number
        for (int i = 0; i < marks.length; i++) {
            //add whatever number i'm on to sum
            sum = sum + marks[i];
        }

        double avg = sum / marks.length;
        System.out.println("The class average is " + avg + "%");
    }
}
