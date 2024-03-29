/* Each new term in the Fibonacci sequence is generated by adding the previous two terms.
 * By starting with 1 and 2, the first 10 terms will be: 1, 2, 3, 5, 8, 13, 21, 34, 55, 89...
 * By considering the terms in the Fibonacci sequence whose values do not exceed four million,
   find the sum of the even-valued terms. */

public class Problem2 {

	public static void main(String[] args) {
		int sum=0;
		for(int i=1,j=2;i<=4000000;) {
			int k=j;
			j=i+j;
			i=k;
			if((i&1)!=1) sum+=i;
		}
		System.out.println(sum);
	}

}

// OUTPUT: 4613732