/*
Sunny Number
A number is sunny if adding 1 results in a perfect square.
Examples: 3, 8, 15, 24, 35, 80
*/
package Numbers;
import java.util.*;
public class SunnyNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        long num=sc.nextLong();
        num=num+1;
        sc.close();
        long sq=(long)Math.sqrt(num);
        System.out.println(num+" "+sq);
        System.out.println(sq*sq==num?"Sunny number":"NA");
    }
}
