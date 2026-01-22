/*
A natural number greater than 1 that has exactly two distinct 
positive divisors: 1 and itself.
Examples: 2, 3, 5, 7, 11, 13
*/
package Numbers;
import java.util.*;
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num=sc.nextInt();
        sc.close();
        if(num<=1){
            System.out.println("Invalid input");
            return;
        }
        for(int i=2;i<=Math.sqrt(num);i++){
            if(num%i==0){
                System.out.println("Not a Prime Number");
                return;
            }
        }
        System.out.println("Prime Number");
    }
}
