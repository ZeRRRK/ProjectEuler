
/**
 * Project Euler: Sum Square Difference (Problem 6)
 * <http://projecteuler.net/problem=6>
 * 
 * The sum of the squares of the first ten natural numbers is,
 * 
 * 		1^2 + 2^2 + ... + 10^2 = 385
 * 		
 * The square of the sum of the first ten natural numbers is,
 *
 * 		(1 + 2 + ... + 10)^2 = 55^2 = 3025
 * 
 * Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 - 385 = 2640.
 * 
 * Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
 * 
 * Copyright (C) 2013 Matt Yackel
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 * 
 * @author Matt
 *
 */
public class SumSquareDifference {

	/**
	 * JVM entry point.
	 * @param args The command-line arguments.
	 */
	public static void main(String[] args) {
		int sum = 0;
		int square = 0;
		for(int i = 1; i <= 100; i++) {
			sum += i * i;
			square += i;
		}
		square = square * square;
		System.out.println("Result: " + (square - sum));
	}

}
