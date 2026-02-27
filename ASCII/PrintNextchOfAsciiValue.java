package ASCII;
import java.util.Scanner;
public class PrintNextchOfAsciiValue {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char ch=sc.next().charAt(0);
        sc.close();
        System.out.println((char)(ch+1));
    }
}

