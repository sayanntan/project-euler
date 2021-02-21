/* The prime factors of 13195 are 5, 7, 13 and 29.
 * What is the largest prime factor of the number 600851475143? */

public class Problem3 {

	public static void main(String[] args) {
		long n=600851475143L;
		long max=0;
		while((n&1)!=1) {
			max=2;
			n>>=1;
		}
		for(int i=3;i*i<=n;i+=2) {
			while(n%i==0) {
				max=i;
				n/=i;
			}
		}
		if(n>2) max=n;
		System.out.print(max);
	}

}

// OUTPUT: 6857
