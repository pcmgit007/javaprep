package rcn.algorithms.basics;

public class SumOfNumbers {
	public static void main(String[] args) {
		int n = 20, sum = 0;
		for(int i=1; i<= n; i++) {
			sum += i;
		}
		
		System.out.println("Sum of numbers is :: "+sum);
		System.out.println("Sum of numbers by formula is :: "+(n*(n+1))/2);
	}
}
