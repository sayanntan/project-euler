/*
 * A Pythagorean triplet is a set of three natural numbers, a < b < c, 
   for which, a^2 + b^2 = c^2
 * For example, 3^2 + 4^2 = 9 + 16 = 25 = 5^2.
 * There exists exactly one Pythagorean triplet for which a + b + c = 1000.
 * Find the product abc.
 */

public class Problem9 {

	public static void main(String[] args) {
		int n=1000; 
		boolean f=false;
		for(int a=1;a<=n/3;a++) {
			for(int b=a+1;b<=n/2;b++) {
				int c=n-a-b;
				if(a*a+b*b == c*c) {
					System.out.println(a*b*c);
					f=true;
					break;
				}
			}
			if(f==true) break;
		}
	}

}

// OUTPUT: 31875000