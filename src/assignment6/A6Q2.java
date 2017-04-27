
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
public class A6Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //creating a scanner for user input
        Scanner input = new Scanner(System.in);
        System.out.println("How many people?");
        int people = input.nextInt();
        //create a list of the number of people and their heights 
        double[] heights = new double[people];
        System.out.println("Enter the heights(in cm):");
        for (int i = 0; i < heights.length; i++) {
            heights[i] = input.nextDouble();
        }

        // use a for loop to determin the sum
        // start with an accumulator
        double sum = 0;
        // for loop to go through each number
        for (int i = 0; i < heights.length; i++) {
            //add whatever number i'm on to sum
            sum = sum + heights[i];
        }

        double avg = sum / heights.length;
        System.out.println("The average height is " + avg);
        
        
        System.out.println("The heights above average are:");
        for (int i = 0; i < heights.length; i++){
            if(heights[i] > avg){   
                System.out.println(heights[i]);
                
            }
        }
    }
}

