package ControlStatements;
import java.util.*;
public class TrainSeats {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the seat number (1-72): ");
        int num=sc.nextInt();
        sc.close();
        if(num<1 || num>72){
            System.out.println("Invalid Seat number");
            return;
        }
        int rem=num%8;
        switch(rem){
            case 1:
            System.out.println("Lower Berth");
            break;
            case 2:
            System.out.println("Middle Berth");
            break;
            case 3:
            System.out.println("Upper Berth");
            break;
            case 4:
            System.out.println("Lower Berth");
            break;
            case 5:
            System.out.println("Middle Berth");
            break;
            case 6:
            System.out.println("Upper Berth");
            break;
            case 7:
            System.out.println("Side Lower Berth");
            break;
            case 0:
            System.out.println("Side Upper Berth");
            break;
            default:
            System.out.println("Invalid seat number");
        }
    }
}
