package util;

import java.lang.reflect.Method;

/**
 * A utility class for benchmarking solutions.
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
public class Benchmark {

	/**
	 * JVM entry point.
	 * @param args The command-line arguments.
	 */
	public static void main(String[] args) {
		try {
			String className = args[0];
			Class<?> classObj = Class.forName(className);
			Method main = classObj.getMethod("main", String[].class);
			long startTime = System.currentTimeMillis();
			main.invoke(null, (Object) null);
			long elapsed = System.currentTimeMillis() - startTime;
			System.out.println("Took " + elapsed + "ms.");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
