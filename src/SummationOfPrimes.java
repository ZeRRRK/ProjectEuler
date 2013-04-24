import math.Sieve;

/**
 * Project Euler: Summation of Primes (Problem 10)
 * <http://projecteuler.net/problem=10>
 * 
 * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
 *
 * Find the sum of all the primes below two million.
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
public class SummationOfPrimes {

	/**
	 * JVM entry point.
	 * @param args The command-line arguments.
	 */
	public static void main(String[] args) {
		Sieve sieve = new Sieve(2000000);
		sieve.evaluate();
		int[] primes = sieve.toArray();
		long sum = 0;
		for(int i = 0; i < primes.length; i++) {
			sum += primes[i];
		}
		System.out.println("Result: " + sum);
	}

}
