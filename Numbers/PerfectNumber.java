/*
A number whose sum of all its proper positive divisors
(excluding itself) equals the number.
Examples: 6(1+2+3), 28, 496, 8128
*/
package Numbers;
import java.util.*;
public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        sc.close();
        int divsum=0;
        for(int i=1;i<num;i++){
            if(num%i==0) divsum+=i;
        }
        System.out.println(divsum==num?"Perfect number":"No");
    }
}
