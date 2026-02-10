package StarPatterns;
public class Butterfly {
    public static void main (String[] args) {
       int n=6;
       int i,j;
       System.out.println("Butterfly Star Pattern: ");
       for(i=1;i<=n;i++){
           for(j=1;j<=2*n;j++){
               if(j>i && j<=(2*n-i)){
                   System.out.print(" ");
               }
               else{
                   System.out.print("*");
               }
           }
           System.out.println();
       }   
       for(i=n;i>0;i--){
           for(j=1;j<=2*n;j++){
               if(j>i && j<=(2*n-i)){
                   System.out.print(" ");
               }
               else{
                   System.out.print("*");
               }
           }
           System.out.println();
       }   
   }
}
