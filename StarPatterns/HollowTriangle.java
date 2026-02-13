package StarPatterns;
public class HollowTriangle {
    public static void main(String[] args) {
		int n=6;
        System.out.println("Hollow Triangle Pattern:");
		for(int i=1;i<=n;i++){
		    for(int j=i;j<n;j++){
		        System.out.print(" ");
		    }
		    for(int k=1;k<=2*i-1;k++){
		        if(k==1 || k==2*i-1 || i==n){
		            System.out.print("*");
		        }
		        else{
		            System.out.print(" ");
		        }
		    }
		    System.out.println();
		}
	}
}
