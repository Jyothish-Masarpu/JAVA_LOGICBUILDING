package ASCII;
import java.util.*;
public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a String: ");
        String s=sc.nextLine();
        sc.close();
        int[] freq=new int[256];
        for(char ch:s.toCharArray()){
            freq[ch]++;
        }
        boolean found = false;
        for (char ch : s.toCharArray()) {
            if (freq[ch] == 1) {
                System.out.println("First Non repeated character: " + ch);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("No non-repeating character");
        }
    }
}
