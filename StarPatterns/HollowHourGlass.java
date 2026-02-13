package StarPatterns;
public class HollowHourGlass {
    public static void main(String[] args) {
		int n=6;
        System.out.println("Hollow Hour Glass Pattern:");
		for(int i=1;i<=n;i++){
		    for(int j=1;j<i;j++){
		        System.out.print(" ");
		    }
		    for(int j=i;j<=n;j++){
		        if(i==1 || j==i || j==n){
		            System.out.print("* ");
		        }
		        else{
		            System.out.print("  ");
		        }
		    }
		    System.out.println();
		}
		for(int i=n-1;i>=1;i--){
		    for(int j=1;j<i;j++){
		        System.out.print(" ");
		    }
		    for(int j=i;j<=n;j++){
		        if(i==1 || j==i || j==n){
		            System.out.print("* ");
		        }
		        else{
		            System.out.print("  ");
		        }
		    }
		    System.out.println();
		}
	}
}
