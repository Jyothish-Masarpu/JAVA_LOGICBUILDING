package ASCII;
import java.util.*;
public class FirstRepeatingCharacter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a String: ");
        String s=sc.nextLine();
        sc.close();
        boolean[] seen=new boolean[256];
        boolean found=false;
        for(char ch:s.toCharArray()){
            if(seen[ch]){
                System.out.println("First Repeating Character: "+ch);
                found=true;
                break;
            }
            seen[ch]=true;
        }
        if(!found) System.out.println("Not Found");
    }
}
