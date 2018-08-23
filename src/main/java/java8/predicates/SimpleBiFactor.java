package java8.predicates;

import java.util.function.BiPredicate;

public class SimpleBiFactor {
	public static void main(String[] args) {
		BiPredicate<Integer, Integer> lesserThan = (a, b) -> (a < b);
		
		System.out.println(lesserThan.test(10, 20));
		System.out.println(lesserThan.test(20, 10));
	}

}
