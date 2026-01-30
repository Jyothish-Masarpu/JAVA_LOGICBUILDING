/*
Leetcode-509
F(0) = 0, F(1) = 1
F(n) = F(n - 1) + F(n - 2), for n > 1.
*/
package Numbers;
public class FibonacciNumber {
    public static void main(String[] args) {
        int n=4;
        System.out.println(n+" fibonacci term is: "+fib(n));
    }
    static int fib(int n){
        int a=0,b=1,c=0;
        if(n==0) return a;
        if(n==1) return b;
        for(int i=2;i<=n;i++){
            c=a+b;
            a=b;
            b=c;
        }
        return c;
    }
}
