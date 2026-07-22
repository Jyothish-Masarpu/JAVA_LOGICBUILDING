package ASCII;
import java.util.*;
public class CountFrequency {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a String: ");
        String s=sc.nextLine();
        sc.close();
        int[] freq=new int[256];
        for(char ch:s.toCharArray()){
            freq[ch]++;
        }
        boolean[] seen=new boolean[256];
        for(char ch:s.toCharArray()){
            if(!seen[ch]) System.out.println(ch+" -> "+freq[ch]);
            seen[ch]=true;
        }
    }
}
