/************
 * Question: Write a program to pass an integer as input and find the 
 * average of all the digits.
 ************
 * @Etucator (Victor Banerjee)
 * Example : 4621 (Sum = 13, counter = 4 , avg = 13/4
 */

import java.util.*;
  public class AvgOfDigit {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input an integer");
        int num = sc.nextInt();
        int last;
        int sum = 0, counter = 0;
        while (num > 0) {
            last = num % 10; 
            num = num /10;
            sum = sum + last;
            counter = counter + 1;
        }
        double avg = (double)sum / counter;
        System.out.println("The Average of Digit is "+ avg);
  } 
}
