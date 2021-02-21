/* A palindromic number reads the same both ways.
 * The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
 * Find the largest palindrome made from the product of two 3-digit numbers. */

public class Problem4 {

	public static void main(String[] args) {
		boolean f=false;
		int max=0;
		for(int i=999;i>=100;i--) {
			for(int j=i;j>=100;j--) {
				int prod=i*j;
				if(prod<max) break;
				int x=prod;
				int rev=0;
				while(x>0) {
					int r=x%10;
					rev=rev*10+r;
					x/=10;
				}
				if(prod==rev && prod>max) {
					max=prod;
				}
			}
		}
		System.out.print(max);
	}

}

// OUTPUT: 906609
