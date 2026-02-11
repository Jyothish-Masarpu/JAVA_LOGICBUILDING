package ControlStatements;
import java.util.Scanner;
public class CountEvenOddInNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=sc.nextInt();
        sc.close();
        int evenCount=0,oddCount=0;
        while(num>0){
            int digit=num%10;
            if(digit%2==0){
                evenCount++;
            }else{
                oddCount++;
            }
            num/=10;
        }
        System.out.println("Even digits count: "+evenCount);
        System.out.println("Odd digits count: "+oddCount);
    }
}
