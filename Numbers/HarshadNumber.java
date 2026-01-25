/*
Harshad (Niven) Number
A number that is completely divisible by the sum of its digits.
Examples: 18, 21, 27, 81
*/
package Numbers;
import java.util.*;
public class HarshadNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=sc.nextInt();
        sc.close();
        if(num<0){
            System.out.println("Invalid Input");
            return;
        }
        int temp=num,sum=0;
        while(temp!=0) {    
            sum+=temp%10;
            temp/=10;
        }
        System.out.println(num%sum==0 ? "Harshad Number" : "NA");
    }
}
