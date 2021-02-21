/* What is the 10001st prime number? */

public class Problem7 {

	public static void main(String[] args) {
		int c=0,n=1;
		while(c!=10002) {
			int t=0;
			for(int i=2;i*i<=n;i++) {
				if(n%i==0) t++;
			}
			if(t==0) c++;
			n++;
		}
		System.out.print(n-1);
	}

}

// OUTPUT: 104743