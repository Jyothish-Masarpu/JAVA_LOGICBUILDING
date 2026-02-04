package ControlStatements;
import java.util.Scanner;
public class Evenodd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num=sc.nextInt();
        sc.close();
        if((num&1)==0){
            System.out.println(num+" is even");
        }
        else{
            System.out.println(num+" is odd");
        }
    }
}
