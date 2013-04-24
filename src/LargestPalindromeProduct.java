import math.MathUtils;

/**
 * Project Euler: Largest Palindrome Product (Problem 4)
 * <http://projecteuler.net/problem=4>
 * 
 * A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 * 99.
 *
 * Find the largest palindrome made from the product of two 3-digit numbers.
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
public class LargestPalindromeProduct {

	/**
	 * JVM entry point.
	 * @param args The command-line arguments.
	 */
	public static void main(String[] args) {
		int result = 0;
		for(int i = 100; i < 1000; i++) {
			for(int i2 = 100; i2 < 1000; i2++) {
				int val = i * i2;
				System.out.print("[" + i + " * " + i2 + "] = " + val);
				if(MathUtils.isPalindrome(val)) {
					System.out.println("\tPALINDROME FOUND");
					if(val > result) {
						result = val;
					}
				} else {
					System.out.println();
				}
			}
		}
		System.out.println("Result: " + result);
	}

}
