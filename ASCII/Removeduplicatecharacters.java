// Remove duplicate characters (keep the first occurrence).
package ASCII;
public class Removeduplicatecharacters {
    public static void main(String[] args) {
        String str="Java Programming";
        StringBuilder sb = new StringBuilder();
        /* Method-1
        for(int i=0;i<str.length();i++){
            if(sb.indexOf(String.valueOf(str.charAt(i)))==-1){
                sb.append(str.charAt(i));
            }
        }
        System.out.println(sb.toString());
        */
        boolean[] visited=new boolean[256];
        for(char ch:str.toCharArray()){
            if(!visited[ch]){
                sb.append(ch);
                visited[ch]=true;
            }
        }
        System.out.println(sb.toString());
    }
}
