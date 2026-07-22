package ASCII;
import java.util.Scanner;
public class RemoveVowels {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String: ");
        String str=sc.nextLine();
        sc.close();
        StringBuilder sb=new StringBuilder();
        for (char ch : str.toCharArray()) {
            char c = Character.toLowerCase(ch);
            if (c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u') {
                sb.append(ch);   
            }
        }
        System.out.println("After removing vowels: \""+sb.toString()+"\"");
    }
}
