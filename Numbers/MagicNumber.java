/*
Magic Number
A number in which the repeated sum of its digits eventually becomes 1.
Examples: 28, 1729, 199
*/
package Numbers;
import java.util.*;
public class MagicNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=sc.nextInt();
        sc.close();
        if(num<0){
            System.out.println("Invalid Input");
            return;
        }
        Set<Integer> seen=new HashSet<>();
        while(num!=1 && seen.add(num)){
            int sum=0;
            while(num>0){
                sum+=num%10;
                num/=10;
            }
            num=sum;
        }
        System.out.println(num==1 ? "Magic number":"NA");
    }
}
