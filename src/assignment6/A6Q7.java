/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment6;

/**
 *
 * @author keonj9218
 */
public class A6Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create an array of numbers from 0 to 1000
        int[] numbers = new int[1000];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i;
        }
        //create a for statement from 2 to 1000
        for (int p = 2; p < 1000;) {
            //if p = -1 add p to itself
            if (numbers[p] != -1) {
                int increment = p;
                int non = p + increment;
                //while loop to make every number that isn't prime to be set as -1
                while (non < 1000) {
                    numbers[non] = -1;
                    non = non + increment;
                }
                //add to p so it can check the next set
                p++;
            } else {
                p++;
            }
        }
        //output all prime numbers from 2 to 1000
        System.out.println("The prime numbers between 2 to 1000 are:");
        for(int i = 2; i < 1000; i++){
            if(numbers[i] != -1)
                System.out.println(i);
        }
    }
}