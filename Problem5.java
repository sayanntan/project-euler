/* 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
   What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20? */
public class Problem5 {
	
	static long gcd(long a, long b) {
		return a%b==0 ? b : gcd(b,a%b);
	}
	
	public static void main(String[] args) {
		long res=1;
		for(int i=1;i<=20;i++)
			res=res*i/gcd(res,i);
		System.out.print(res);
	}

}

// OUTPUT: 232792560