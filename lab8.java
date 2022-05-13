package Labs;

public class lab8 {

	/* Xavier White
	 * 4/25/22
	 * CSCI 2
	 * Professor Smith
	 * This program is designed to compare the time it takes for a iterative and recursive method to perform a Fibonacci sequence with forty elements.
	 * The program also displays the sum value of the Fibonacci sequence at each position.
	 */

	//Recursive Method
	public static int recursive(int x) {

		if(x <= 1) 	

			return x;

		else 

			return recursive(x-2) + recursive(x-1);
	}

	//Iterative Method utilizing the swap algorithm
	public static int iterative(int x) {

		int fib1 = 1; 

		int fib2 = 1; 

		int fib = 0; 

		for(int i=3;i<=x;i++)

		{

			fib = fib1 + fib2; 

			fib1 = fib2;

			fib2 = fib;

		}

		return fib2;

	}

	public static void main(String[] args) {

		//Declare Variable
		int elements = 40;

		//Time the Recursive Method
		long start = System.currentTimeMillis();
		recursive(elements);
		long end = System.currentTimeMillis();

		System.out.println("The recursive method took " + (end - start) + " milliseconds.");
		System.out.println();

		//Time the Iterative Method
		long start1 = System.currentTimeMillis();
		iterative(elements);
		long end1 = System.currentTimeMillis();
		System.out.println("The iterative method took " + (end1 - start1) + " milliseconds.");
		System.out.println();

		////Print Position and Sum of the Fibonacci Sequence
		System.out.println("The sum of a Fibonacci sequence with 40 elements is " + iterative(elements) + ".");
		System.out.println();

		for(int i =1; i <= 40; i++) {

			System.out.println("Position:" + i + " Sum:" + recursive(i));
		}

	}









}



