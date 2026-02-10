package StarPatterns;
public class ReverseLeftHalfPyramid {
    public static void main(String[] args) {
        int n=6;
        int i,j;
        System.out.println("Reverse Left Half Pyramid: ");
        for(i=n;i>0;i--){
            for(j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
