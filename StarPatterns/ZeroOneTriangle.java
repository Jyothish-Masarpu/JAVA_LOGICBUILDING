package StarPatterns;
public class ZeroOneTriangle {
    public static void printPattern(int n)
    {
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if(((i+j)&1)==1){
                    System.out.print("0"+" ");
                }
                else{
                    System.out.print("1"+" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        int n = 6;
        printPattern(n);
    }
}