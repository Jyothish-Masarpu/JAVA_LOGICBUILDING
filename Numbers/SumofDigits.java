/*
Write a Java program to calculate the sum of digits of a given number.
Examples: 123 -> 6, 456 -> 15
 */
package Numbers;
import java.util.*;
public class SumofDigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=sc.nextInt();
        sc.close();
        int sum=0;
        while(num>0){   
            int digit=num%10;
            sum=sum+digit;
            num=num/10;
        }
        System.out.println("Sum of digits: "+sum);
    }
}
