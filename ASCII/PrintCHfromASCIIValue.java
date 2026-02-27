package ASCII;
import java.util.Scanner;
public class PrintCHfromASCIIValue {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        if(n>=0 && n<=127){
            System.out.println((char)n);
        }
        else{
            System.out.println("Invalid,Enter a value between 0 to 127");
        }
    }
}
