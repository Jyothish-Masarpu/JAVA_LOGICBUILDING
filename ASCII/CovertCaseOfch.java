package ASCII;
import java.util.Scanner;
public class CovertCaseOfch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char ch=sc.next().charAt(0);
        sc.close();
        if(ch>=65 && ch<=90){
            System.out.println((char)(ch+32));
        }
        else if(ch>=97 && ch<=122){
            System.out.println((char)(ch-32));
        }
        else{
            System.out.println("Invalid,Enter a Alphabet");
        }
    }
}
