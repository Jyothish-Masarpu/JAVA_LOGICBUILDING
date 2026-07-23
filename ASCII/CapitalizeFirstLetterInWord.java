package ASCII;
import java.util.*;
public class CapitalizeFirstLetterInWord {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String s=sc.nextLine();
        sc.close();
        StringBuilder sb=new StringBuilder();
        boolean c=true;
        for(char ch:s.toCharArray()){
            if(ch==' '){
                sb.append(ch);
                c=true;
            }
            else{
                if(c){
                    sb.append(Character.toUpperCase(ch));
                    c=false;
                }
                else{
                    sb.append(ch);
                }
            }
        }
        System.out.println(sb.toString());
    }
}
