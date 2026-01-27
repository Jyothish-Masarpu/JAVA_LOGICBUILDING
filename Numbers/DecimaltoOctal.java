package Numbers;
import java.util.*;
public class DecimaltoOctal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int num=sc.nextInt();
        sc.close();
        if(num<0){
            System.out.println("Invalid Input");
            return;
        }
        int octal=0, place=1;
        while(num!=0){
            int remainder=num%8;
            octal+=remainder*place;
            num/=8;
            place*=10;
        }
        System.out.println("Octal Number: "+octal);
    }
}
