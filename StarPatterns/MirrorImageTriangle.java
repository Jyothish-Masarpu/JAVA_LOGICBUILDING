package StarPatterns;
public class MirrorImageTriangle {
    public static void main(String[] args) {
		int n=6;
        System.out.println("Mirror Image Triangle Pattern:");
		for(int i=1;i<=n;i++){
		    for(int j=1;j<i;j++){
		        System.out.print(" ");
		    }
		    for(int j=i;j<=n;j++){
		        System.out.print(j+" ");
		    }
		    System.out.println();
		}
		for(int i=n-1;i>0;i--){
		    for(int j=1;j<i;j++){
		        System.out.print(" ");
		    }
		    for(int j=i;j<=n;j++){
		        System.out.print(j+" ");
		    }
		    System.out.println();
		}
	}
}
