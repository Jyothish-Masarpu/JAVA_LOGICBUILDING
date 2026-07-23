package ASCII;
import java.util.*;
public class LongestWordInSentence {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String s=sc.nextLine();
        sc.close();
        StringBuilder sb=new StringBuilder();
        String longest="";
        for(char ch:s.toCharArray()){
            if(ch==' '){
                if(sb.length()>longest.length()){
                    longest=sb.toString();
                }
                sb.setLength(0);
            }
            else{
                sb.append(ch);
            }
        }
        if(sb.length()>longest.length()) longest=sb.toString();
        System.out.println(longest);
    }
}
