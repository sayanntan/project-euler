/* Find the difference between the sum of the squares of the first one hundred natural numbers
   and the square of the sum. */

public class Problem6 {

	public static void main(String[] args) {
		int n=100;
		int sumOfSq=n*(n+1)*(2*n+1)/6;
		int sum=n*(n+1)/2;
		int sqOfSum=sum*sum;
		System.out.print(sqOfSum-sumOfSq);
	}

}

// OUTPUT: 25164150