package ControlStatements;
import java.util.Scanner;
public class Voting {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int age=sc.nextInt();
        sc.close();
        if(age>=1 && age<=100){
            if(age<18) System.out.println("Not Eligible to vote");
            else if(age>=18) System.out.println("Eligible to Vote");
        }
        else{
            System.out.println("Invalid age");
        }
    }
}
