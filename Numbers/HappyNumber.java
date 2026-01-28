/*
Happy Number
If repeatedly replacing the number with the sum of squares of its
digits eventually results in 1, it's happy.
Examples: 1, 7, 10, 13, 19
*/
package Numbers;
import java.util.*;
public class HappyNumber {
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
                int digit=num%10;
                sum+=digit*digit;
                num/=10;
            }
            num=sum;
        }
        System.out.println(num==1 ? "Happy number":"NA");
    }
}
