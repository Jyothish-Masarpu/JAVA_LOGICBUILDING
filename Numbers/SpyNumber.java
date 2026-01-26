/*
Spy Number
A number in which the sum and the product of its digits are equal.
Examples: 123, 132, 1124
*/
package Numbers;
import java.util.*;
public class SpyNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=sc.nextInt();
        sc.close();
        if(num<0){
            System.out.println("Invalid Input");
            return;
        }
        int temp=num,sum=0,product=1;
        while(temp!=0) {    
            int digit=temp%10;
            sum+=digit;
            product*=digit;
            temp/=10;
        }
        System.out.println(sum==product ? "Spy Number" : "NA");
    }
}
