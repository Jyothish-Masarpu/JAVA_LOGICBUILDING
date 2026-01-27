/*
Trimorphic Number
A number whose cube ends in the same digits as the number itself.
Examples: 4, 24, 76
*/
package Numbers;
import java.util.*;
public class TrimorphicNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Number: ");
        long num=sc.nextLong();
        sc.close();
        if(num<=0){
            System.out.println("Invalid input");
            return;
        }
        long cube=num*num*num;
        long temp=num,pow=1;
        while(temp>0){
            pow*=10;
            temp/=10;
        }
        System.out.println(num==cube%pow?"Trimorphic number":"NA");
    }
}
