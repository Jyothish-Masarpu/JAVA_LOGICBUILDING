package ASCII;
import java.util.*;
public class Anagram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter 1st string: ");
        String s=sc.nextLine();
        System.out.print("\nEnter 2nd String: ");
        String p=sc.nextLine();
        sc.close();
        s=s.toLowerCase().replaceAll("\\s+","");
        p=p.toLowerCase().replaceAll("\\s+","");
        if(s.length()!=p.length()){
            System.out.println("Not Anagrams");
            return;
        }
        boolean anagram=true;
        int[] freq=new int[256];
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)]++;
            freq[p.charAt(i)]--;
        }
        for(int i:freq){
            if(i!=0){
                anagram=false;
                break;
            }
        }
        System.out.println(anagram?"Anagrams":"Not Anagrams");
    }
}
