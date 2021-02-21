/* Find the sum of all the primes below two million. */

public class Problem10 {

	public static void main(String[] args) {
		long sum=0;
		for(int i=2;i<=2000000;i++) {
			int c=0;
			for(int j=2;j*j<=i;j++) {
				if(i%j==0) c++;
			}
			if(c==0) sum+=i;
		}
		System.out.print(sum);
	}

}

// OUTPUT: 142913828922