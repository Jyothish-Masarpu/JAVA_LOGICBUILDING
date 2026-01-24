/* 
Strong Number
A number in which the sum of the factorials of its digits equals the number 
itself (also called special number).
Examples: 145, 1, 2
 */
package Numbers;
import java.util.*;
public class StrongNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=sc.nextInt();
        sc.close();
        if(num<0){
            System.out.println("Invalid Input");
            return;
        }
        int temp=num,factsum=0;
        while(temp>0){
            int fact=1;
            int digit=temp%10;
            for(int i=1;i<=digit;i++){
                fact=fact*i;
            }
            factsum+=fact;
            temp/=10;
        }
        System.out.println(factsum==num?"Strong number":"NA");
    }
}
