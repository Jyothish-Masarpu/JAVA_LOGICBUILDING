package StarPatterns;
public class NumberIncreasingPyramid {
    public static void main(String[] args) {
        int n=6;
        int i,j;
        System.out.println("Number Increasing Pyramid:");
        for(i=1;i<=n;i++){
            for(j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
