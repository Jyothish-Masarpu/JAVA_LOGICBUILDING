/*
Palprime Number
A number that is both a palindrome and a prime number.
Examples: 2, 3, 5, 7, 11, 101, 131
*/
package Numbers;
import java.util.*;
public class PalprimeNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        long num=sc.nextLong();
        sc.close();
        if(num<=1){
            System.out.println("NA");
            return;
        }
        boolean isPrime=true;
        for(long i=2;i<=num/2;i++){
            if(num%i==0){
                isPrime=false;
                break;
            }
        }
        if(!isPrime){
            System.out.println("NA");
            return;
        }
        long temp=num,rev=0;
        while(temp!=0){
            rev=rev*10+temp%10;
            temp/=10;
        }
        System.out.println(num==rev?"PalprimeNumber":"NA");
    }
}