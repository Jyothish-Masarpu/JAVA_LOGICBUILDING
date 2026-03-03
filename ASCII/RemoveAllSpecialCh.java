package ASCII;
public class RemoveAllSpecialCh {
    public static void main(String[] args) {
        String s="He__!llo@ Worl-d-";
        StringBuilder sb=new StringBuilder();
        for(char ch:s.toCharArray()){
            if((ch>='a' && ch<='z')||(ch>='A' && ch<='Z')||(ch>='0' && ch<='9')){
                //if you want to keep space then add (ch==' ') in above condition
                sb.append(ch);
            }
        }
        System.out.println("After removing special characters from \""+ s +"\" : \""+ sb.toString() +"\"");
    }
}
