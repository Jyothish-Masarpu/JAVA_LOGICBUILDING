/*
A number in which the sum of each digit raised to the power
of the total number of digits equals the number itself.
Examples: 153, 370, 371, 407
 */
package Numbers;
import java.util.*;
public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=sc.nextInt();
        sc.close();
        int temp=num,org=num,sum=0,count=0;
        while(temp>0){
            count++;
            temp/=10;
        }
        while(org>0){
            sum+=(int)Math.pow(org%10,count);
            org/=10;
        }
        System.out.println(num==sum?"Armstrong Number":"No");
    }
}
