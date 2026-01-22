/* 
A number that remains the same when its digits are reversed. 
It reads identically from left to right and right to left.
Examples: 121, 131, 12321, 9
*/
package Numbers;
import java.util.*;
public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=sc.nextInt();
        sc.close();
        int rev=0,temp=num;
        while(temp>0){
            rev=(rev*10)+(temp%10);
            temp/=10;
        }
        System.out.println(num==rev?"Palindrome Number":"No");
    }
}
