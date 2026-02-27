package ASCII;
import java.util.Scanner;

public class CountAllTypes {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String str = sc.nextLine();
        sc.close();

        int alphabets = 0, digits = 0, spaces = 0, special = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
                alphabets++;
            }
            else if (ch >= '0' && ch <= '9') {
                digits++;
            }
            else if (ch == ' ') {
                spaces++;
            }
            else {
                special++;
            }
        }
        System.out.println("Alphabets: " + alphabets);
        System.out.println("Digits: " + digits);
        System.out.println("Spaces: " + spaces);
        System.out.println("Special Characters: " + special);
    }
}