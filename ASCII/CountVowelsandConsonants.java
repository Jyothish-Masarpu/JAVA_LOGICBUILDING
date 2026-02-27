package ASCII;
import java.util.Scanner;
public class CountVowelsandConsonants {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        s=s.toLowerCase();
        sc.close();
        int vowels=0,consonants=0;
        for(char ch:s.toCharArray()){
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                vowels++;
            }
            else if(ch>='a' && ch<='z'){
                consonants++;
            }
        }
        System.out.println("Vowels count: "+vowels);
        System.out.println("Consonants count: "+consonants);
    }
}
