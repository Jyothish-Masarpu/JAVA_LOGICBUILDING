package ASCII;
import java.util.*;
public class CheckPalindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a String: ");
        String s=sc.nextLine();
        sc.close();
        int i=0,j=s.length()-1;
        boolean pal=true;
        while(i<j){
            while(i<j && !Character.isLetterOrDigit(s.charAt(i))) i++;
            while(i<j && !Character.isLetterOrDigit(s.charAt(j))) j--;
            if(Character.toLowerCase(s.charAt(i))!=Character.toLowerCase(s.charAt(j))){
                System.out.println("Not a palindrome");
                pal=false;
                break;
            }
            i++;
            j--;
        }
        if(pal) System.out.println("Palindrome");
    }
}
