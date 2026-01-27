package Numbers;
import java.util.*;
public class OctaltoDecimal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter an octal number: ");
        int octal=sc.nextInt();
        sc.close();
        if(octal<0){
            System.out.println("Invalid Input");
            return;
        }
        int decimal=0, place=0;
        while(octal!=0){
            int digit=octal%10;
            decimal+=digit*Math.pow(8, place);
            octal/=10;
            place++;
        }
        System.out.println("Decimal Number: "+decimal);
    }
}
