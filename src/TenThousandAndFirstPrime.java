import math.MathUtils;

/**
 * Project Euler: 10001st Prime (Problem 7)
 * <http://projecteuler.net/problem=7>
 * 
 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
 * 
 * What is the 10,001st prime number?
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
public class TenThousandAndFirstPrime {

	/**
	 * JVM entry point.
	 * @param args The command-line arguments.
	 */
	public static void main(String[] args) {
		int count = 0;
		int value = 0;
		while(count < 10001) {
			value++;
			if(MathUtils.isPrime(value)) {
				count++;
				System.out.println(value + " is the " + count + " prime.");
			}
		}
		System.out.println("Result: " + value);
	}

}
