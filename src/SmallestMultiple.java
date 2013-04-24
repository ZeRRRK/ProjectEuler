/**
 * Project Euler: Smallest Multiple (Problem 5)
 * <http://projecteuler.net/problem=5>
 * 
 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
 *
 * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
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
public class SmallestMultiple {

	/**
	 * JVM entry point.
	 * @param args The command-line arguments.
	 */
	public static void main(String[] args) {
		boolean solved = false;
		int i = 0;
		while(!solved) {
			i += 2520;
			System.out.print("Value: " + i + ", divisible by: ");
			int flags = 0;
			for(int i2 = 1; i2 <= 20; i2++) {
				if(i % i2 == 0) {
					System.out.print(i2 + " ");
					flags++;
				}
			}
			System.out.println();
			if(flags == 20) {
				solved = true;
			}
		}
		System.out.println("Result: " + i);
	}

}
