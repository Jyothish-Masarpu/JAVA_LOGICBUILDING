package StarPatterns;
public class SquareFill {
    public static void main(String[] args) {
        int n=4;
        int i,j;
        System.out.println("Square Fill Pattern:");
        for(i=1;i<=n;i++){
            for(j=1;j<=n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
