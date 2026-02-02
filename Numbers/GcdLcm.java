package Numbers;
import java.util.*;
public class GcdLcm {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int x=a,y=b;
        sc.close();
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        int gcd=a;
        int lcm=x*y/gcd;
        System.out.println("LCM of "+x+" and "+y+" is: "+lcm);
        System.out.println("GCD of "+x+" and "+y+" is: "+gcd);
    }
}
