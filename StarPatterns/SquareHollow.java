package StarPatterns;
public class SquareHollow {
    public static void main(String[] args) {
        int n=6;
        int i,j;
        System.out.println("Hollow Square Pattern:");
        for(i=1;i<=n;i++){
            for(j=1;j<=n;j++){
                if(i==1 || i==n || j==1 || j==n){
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
