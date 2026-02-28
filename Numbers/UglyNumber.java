/*
Leetcode 263. Ugly Number
reference: https://leetcode.com/problems/ugly-number/
*/
package Numbers;
public class UglyNumber {
    public static void main(String[] args) {
        int n = 6;
        System.out.println("isUgly(" + n + ") = " + isUgly(n));
    }
    public static boolean isUgly(int n) {
        if (n <= 0) {
            return false;
        }
        while (n % 2 == 0) {
            n /= 2;
        }
        while (n % 3 == 0) {
            n /= 3;
        }
        while (n % 5 == 0) {
            n /= 5;
        }
        return n == 1;
    }
}
