package ASCII;
import java.util.Scanner;
public class CountTotalCharactersinSentence {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        sc.close();
        System.out.println("Total Characters count: "+s.length());
    }
}
