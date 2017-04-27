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
public class A6Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a scanner for user input
        Scanner input = new Scanner(System.in);
        System.out.println("How many marks would you like to enter?");
        int number = input.nextInt();
        //ask them to enter 10 marks
        System.out.println("Enter " + number + " marks:");
        //give them lines to input integers
        int[] marks = new int[number];
        for (int i = 0; i < marks.length; i++) {
            marks[i] = input.nextInt();


        }
        // go through all numbers from the begining to end
        for (int y = 0; y < number; y++) {
            for (int x = 0; x < number; x++) {
                //if the next number is less than the preivious number swap their positions
                if (marks[y] < marks[x]) {
                    int small = marks[x];
                    int big = marks[y];
                    marks[y] = small;
                    marks[x] = big;
                }
            }
        }
        //output all the numbers previously organized
        System.out.println("The numbers in your list from lowest to highest are: ");
        for (int i = 0; i < number; i++) {
            System.out.println(marks[i]);
        }
        int median = marks.length / 2;
        System.out.println("The median is: " + marks[median]);
    }
}
