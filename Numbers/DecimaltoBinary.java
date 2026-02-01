package Numbers;
public class DecimaltoBinary {
    public static void main(String[] args) {
        int num=30;
        StringBuilder sb=new StringBuilder();
        while(num>0){
            sb.append(num&1);
            num>>=1;
        }
        System.out.println(sb.reverse().toString());
    }
}
