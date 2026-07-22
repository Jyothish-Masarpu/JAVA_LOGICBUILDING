package ASCII;
import java.util.*;
public class ReverseVowels {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str=sc.nextLine();
        sc.close();
        char[] ch=str.toCharArray();
        int left=0,right=str.length()-1;
        while(left<right){
            while(left<right && !vowel(ch[left])) left++;
            while(left<right && !vowel(ch[right])) right--;
            char temp=ch[left];
            ch[left]=ch[right];
            ch[right]=temp;
            left++;
            right--;
        }
        System.out.println("After Reversing Vowels: "+new String(ch));
    }
    private static boolean vowel(char ch){
        return ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U';
    }
}
