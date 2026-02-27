package ASCII;
public class PrintAsciiTable {
    public static void main(String[] args) {
        for(int i=0;i<=127;i++){
            char ch=(char)i;
           if(i>=32 && i!= 127){
            System.out.printf("%3d -> %c%n",i,ch);
           }
           else{
            System.out.printf("%3d -> Non-printable%n", i);
           }
        }
    }
}
