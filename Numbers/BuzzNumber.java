/*
Buzz Number
A number that is either divisible by 7 or ends with 7.
Examples: 14, 27, 77, 107
*/
package Numbers;
import java.util.*;
public class BuzzNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=sc.nextInt();
        sc.close();
        if(num<0){
            System.out.println("Invalid Input");
            return;
        }
        System.out.println((num%7==0 || num%10==7) ? "Buzz number":"NA");
    }
}
