package com.practice.stats;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// -define .csv file in app
		
		// -File class needed to turn stringName to actual file
		File file = new File("nfldata15.csv");

		try {
			// -read from filePooped with Scanner class
			Scanner inputStream = new Scanner(file);
			// hashNext() loops line-by-line
			while (inputStream.hasNext()) {
				// read single line, put in string
				String data = inputStream.next();
				System.out.println(data + "***");

			}
			// after loop, close scanner
			inputStream.close();

		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}

	}
}
