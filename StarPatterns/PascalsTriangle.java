package StarPatterns;
public class PascalsTriangle {
    public static void main(String[] args) {
        int row=5;
        for(int i=1;i<=row;i++){
            for(int j=1;j<=row-i;j++){
                System.out.print(" ");
            }
            int x=1;
            for(int k=1;k<=i;k++){
                System.out.print(x+" ");
                x=x*(i-k)/k;
            }
            System.out.println();
        }
    }
}
