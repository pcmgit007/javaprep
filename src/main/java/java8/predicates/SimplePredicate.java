package java8.predicates;

import java.util.function.Predicate;

public class SimplePredicate {
	public static void main(String[] args) {
		Predicate<Integer> lesserThan = i -> (i < 18);
		
		System.out.println(lesserThan.test(10));
	}
}
