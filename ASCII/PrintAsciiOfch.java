package ASCII;
import java.util.Scanner;
public class PrintAsciiOfch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char ch=sc.next().charAt(0);
        sc.close();
        System.out.println((int)ch);
    }
}
