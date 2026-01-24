/*
Automorphic Number
A number whose square ends with the number itself.
Examples: 5, 6, 25, 76, 376, 625
*/
package Numbers;
import java.util.*;
public class AutomorphicNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		sc.close();
		if (num < 0) {
			System.out.println("Invalid Input");
			return;
		}
		long sq = 1L * num * num;
		int temp = num, count = 0;
		if (num == 0) count = 1;
		else {
			while (temp != 0) {
				count++;
				temp /= 10;
			}
		}
		long mod = 1;
		for (int i = 0; i < count; i++) {
			mod *= 10;
		}
		System.out.println(num == (sq % mod) ? "Automorphic" : "NA");
	}

}
