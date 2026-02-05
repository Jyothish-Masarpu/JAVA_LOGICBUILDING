package ControlStatements;
import java.util.*;
public class HammingNumber {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n=sc.nextInt();
        sc.close();
        while(n%2==0){
            n=n/2;
        }
        while(n%3==0){
            n=n/3;
        }
        while(n%5==0){
            n=n/5;
        }
        String res=(n==1)?"Hamming number":"Not Hamming number";
        System.out.println(res);
    }
}
