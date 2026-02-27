package ASCII;
import java.util.Scanner;
public class CharacterClassification {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char ch=sc.next().charAt(0);
        sc.close();
        if(ch>=65 && ch<=90){
            System.out.println(ch+" is Uppercase");
        }
        else if(ch>=97 && ch<=122){
            System.out.println(ch+" is LowerCase");
        }
        else if(ch>=48 && ch<=57){
            System.out.println(ch+" is digit");
        }
        else{
            System.out.println(ch+" is Special Character");
        }
    }
}
