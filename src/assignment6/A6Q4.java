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
public class A6Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a scanner for user input
        Scanner input = new Scanner(System.in);
        //ask them to enter 10 marks
        System.out.println("Enter 10 marks:");
        //give them 10 lines to input 10 integers
        int[] marks = new int[10];
        for (int i = 0; i < marks.length; i++) {
            marks[i] = input.nextInt();


        }
       // go through all 10 numbers from the begining to end
        for (int y = 0; y < 10; y++) {
            for (int x = 0; x < 10; x++) {
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
        System.out.println(" The numbers in your list from lowest to highest are: ");
        for (int i = 0; i < 10; i++) {
            System.out.println(marks[i]);
        }
    }
}