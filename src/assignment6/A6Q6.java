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
public class A6Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a scanner for user input
        Scanner input = new Scanner(System.in);
        System.out.println("How many students are in the class?");
        int students = input.nextInt();

        System.out.println("Enter " + students + " marks");
        //give them lines to input integers
        int[] marks = new int[students];
        for (int i = 0; i < marks.length; i++) {
            marks[i] = input.nextInt();
        }
        // go through all numbers from the begining to end
        for (int y = 0; y < students; y++) {
            for (int x = 0; x < students; x++) {
                //if the next number is less than the preivious number swap their positions
                if (marks[y] < marks[x]) {
                    int small = marks[x];
                    int big = marks[y];
                    marks[y] = small;
                    marks[x] = big;
                }
            }
        }
        System.out.println("Size of Class: " + students);
        //output all the numbers previously organized
        System.out.println("Marks from lowest to highest are: ");
        for (int i = 0; i < students; i++) {
            System.out.println(marks[i]);
        }
        double sum = 0;
            // for loop to go through each number
            for(int i = 0; i < marks.length; i++){
                //add whatever number i'm on to sum
                sum = sum + marks[i];
        }
            System.out.println("");
            double avg = sum/marks.length;
            System.out.println("The class average is: " + avg + "%");
    }
}
