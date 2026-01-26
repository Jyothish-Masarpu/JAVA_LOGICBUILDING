/*
A positive number that contains at least one zero in it, but not at the beginning.
Examples: 10, 102, 2030
*/
package Numbers;
import java.util.*;
public class DuckNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        String num=sc.next();
        sc.close();
        // for negative numbers
        if(num.charAt(0)=='-'){
            System.out.println("Invalid Input");
            return;
        }
        boolean isDuck=false;
        for(int i=1;i<num.length();i++) {
            if(num.charAt(i)=='0') {
                isDuck=true;
                break;
            }
        }
        System.out.println(isDuck ? "Duck Number" : "NA");
    }
}