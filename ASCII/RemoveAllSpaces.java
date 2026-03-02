package ASCII;
public class RemoveAllSpaces {
    public static void main(String[] args) {
        /*Method 1: using replaceAll() method of String class
        String s="  HEllo WOrl  d  ";
        s=s.replaceAll("\\s", "");
        System.out.println(s);
        */
        //Method 2: using StringBuilder class
        String s="  HEllo WOrl  d  ";
        System.out.println("s = " + s);
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=' '){
                sb.append(s.charAt(i));
            }
        }
        System.out.println("Result = " + sb.toString());
    }
}
