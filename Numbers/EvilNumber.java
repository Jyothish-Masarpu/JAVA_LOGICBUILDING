/*
Evil Number
A number that has an even number of 1s in its binary 
representation.
Examples: 3 (11), 5 (101), 9 (1001)
*/
package Numbers;
public class EvilNumber {
    public static void main(String[] args) {
        int num = abc;
        // if (args.length > 0) {
        //     try {
        //         num = Integer.parseInt(args[0]);
        //     } catch (NumberFormatException e) {
        //         System.out.println("Invalid input. Provide an integer.");
        //         return;
        //     }
        // }
        if (num < 0) {
            System.out.println("Please provide a non-negative integer.");
            return;
        }
        int count = Integer.bitCount(num);
        System.out.println(count % 2 == 0 ? "Evil number" : "Not an evil number");
    }
}
