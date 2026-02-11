package ControlStatements;
import java.util.Scanner;
public class Leapyear {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year=sc.nextInt();
        sc.close();
        boolean isLeap=false;
        if(year%4==0){
            if(year%100==0){
                if(year%400==0){
                    isLeap=true;
                }
            }else{
                isLeap=true;
            }
        }
        System.out.println(isLeap?"Leap Year":"Not a Leap Year");
    }
}
