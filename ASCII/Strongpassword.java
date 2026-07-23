package ASCII;
import java.util.*;
public class Strongpassword {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter password: ");
        String s=sc.nextLine();
        sc.close();
        if(s.length()<8){
            System.out.println("Weak");
            return;
        }
        boolean hasUpper=false,hasLower=false,hasSpecial=false,hasDigit=false;
        for(char ch:s.toCharArray()){
            if(Character.isUpperCase(ch)) hasUpper=true;
            else if(Character.isLowerCase(ch)) hasLower=true;
            else if(Character.isDigit(ch)) hasDigit=true;
            else hasSpecial=true;
        }
        if(!hasDigit || !hasLower || !hasSpecial || !hasUpper){
            System.out.println("Weak");
        }
        else {
            System.out.println("Strong");
        }
    }
}
