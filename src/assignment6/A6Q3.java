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
public class A6Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create a scanner for user input
        Scanner input = new Scanner(System.in);
        // ask the user to type in two integers
        System.out.println("Enter two integers:");
        //use a for loop to get two integers
        int[] integer = new int[2];
        for (int i = 0; i < integer.length; i++) {
            integer[i] = input.nextInt();
        }
        
        for (int i = 0; i < 2; i++) {
            //if the second number input is larger than the first number swap the spot they are in
            if (integer[1] < integer[0]) {
                int small = integer[1];
                int big = integer[0];
                integer[0] = small;
                integer[1] = big;
            }  
        }
         System.out.println("The integers in ascending order are: " + integer[0] + " " + integer[1]);
    }
}
