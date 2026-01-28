/*
Tech Number
A number with an even number of digits which when split in the
middle, the sum of parts squared gives the number.
Examples: 2025, 3025, 9801
*/
package Numbers;
import java.util.*;
public class TechNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        long num=sc.nextLong();
        sc.close();
        if(num<0){
            System.out.println("Invalid Input");
            return;
        }
        long temp=num;
        int count=0;
        while(temp!=0){
            count++;
            temp/=10;
        }
        if(count%2!=0){
            System.out.println("NA");
            return;
        }
        long pow=1;
        for(long i=0;i<count/2;i++){
            pow=pow*10;
        }
        long firstpart=num/pow;
        long secondpart=num%pow;
        long sum=firstpart+secondpart;
        System.out.println(num==sum*sum?"TechNumber":"NA");
    }
}
