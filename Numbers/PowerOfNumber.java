package Numbers;
public class PowerOfNumber {
    public static void main(String[] args) {
        int base=2;
        int exponent=10;
        long result=1;
        for(int i=1;i<=exponent;i++) {
            result=result*base;
        }
        System.out.println(base+"^"+exponent+"="+result);
    }
}