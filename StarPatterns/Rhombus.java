package StarPatterns;
public class Rhombus {
    public static void main(String[] args) {
        int n=6;
        int i,j;
        System.out.println("Rhombus Pattern:");
        for(i=1;i<=n;i++){
            for(j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            for(j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
