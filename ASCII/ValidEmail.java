package ASCII;
import java.util.*;
public class ValidEmail {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter mail: ");
        String email=sc.nextLine();
        sc.close();
        String regex="^[A-Za-z0-9._%+-]+@[A-Za-z0-9-]+\\.[A-Za-z]{2,}$";
        if(email.matches(regex)){
            System.out.println("Valid");
            return;
        }
        else{
            System.out.println("Invalid");
        }
    }
}
