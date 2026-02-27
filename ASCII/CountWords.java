package ASCII;

import java.util.Scanner;

public class CountWords {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        s=s.trim();
        sc.close();
        if(s.isEmpty()){
            System.out.println("Word count: 0");
            return;
        }
        String[] words=s.split("\\s+");
        System.out.println("Word count: "+words.length);
    }
}
