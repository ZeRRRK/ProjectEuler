/**
 * Project Euler: Special Pythagorean Triplet (Problem 9)
 * <http://projecteuler.net/problem=9>
 *
 * A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
 * 		a^2 + b^2 = c^2
 * For example, 3^2 + 4^2 = 9 + 16 = 25 = 5^2.
 *
 * There exists exactly one Pythagorean triplet for which a + b + c = 1000.
 * Find the product abc.
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
public class SpecialPythagoreanTriplet {

	/**
	 * JVM entry point.
	 * @param args The command-line arguments.
	 */
	public static void main(String[] args) {
		int m = 2;
		int n = 1;
		boolean solved = false;
		int result = 0;
		while(!solved) {
			/*
			 * Using Euclid's formula for generating Pythagorean triples:
			 * 		a = m^2 - n^2, b = 2mn, c = m^2 + n^2
			 * Where integer m > integer n
			 * 
			 * Source:
			 * 		<http://en.wikipedia.org/wiki/Pythagorean_triple#Generating_a_triple>
			 * 
			 */
			int a = m*m - n*n;
			int b = 2*m*n;
			int c = m*m + n*n;
			if(a + b + c == 1000) {
				result = a*b*c;
				solved = true;
				System.out.println("Special Pythagorean triplet found: [" + a + ", " + b + ", " + c + "]");
				break;
			}
			for(int i = n; i > 0; i--) {
				int a2 = m*m - i*i;
				int b2 = 2*m*i;
				int c2 = m*m + i*i;
				if(a2 + b2 + c2 == 1000) {
					result = a2*b2*c2;
					solved = true;
					System.out.println("Special Pythagorean triplet found: [" + a2 + ", " + b2 + ", " + c2 + "]");
					break;
				}
			}
			m += 1;
			n += 1;
		}
		System.out.println("Result: " + result);
	}

}
