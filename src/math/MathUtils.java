package math;

/**
 * Various math-related utility methods.
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
public class MathUtils {
	
	/**
	 * Checks whether or not a number is prime.
	 * Prime numbers are only divisible evenly by 1 and itself.
	 * 
	 * @param i The number.
	 * @return <code>True</code> if the number is prime, <code>False</code> if not.
	 */
	public static boolean isPrime(int i) {
		if(i % 2 == 0) {
			return false;
		}
		for(int i2 = 3; i2 * i2 <= i; i2 += 2) {
			if(i % i2 == 0) {
				return false;
			}
		}
		return true;
	}
	
	/**
	 * Checks whether or not a number is a palindrome.
	 * A palindrome reads the same both forwards and backwards.
	 * 
	 * @param i The number.
	 * @return <code>True</code> if the number is a palindrome, <code>False</code> if not.
	 */
	public static boolean isPalindrome(int i) {
		String s = String.valueOf(i);
		StringBuffer buffer = new StringBuffer();
		for(int i2 = s.length() - 1; i2 >= 0; i2--) {
			buffer.append(s.charAt(i2));
		}
		String s2 = buffer.toString();
		return s2.equals(s);
	}

}
