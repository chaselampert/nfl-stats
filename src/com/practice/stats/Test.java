package com.practice.stats;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Test {
	
	public static void main(String[] args) {
		addDataToStructure();
	}

	public static void addDataToStructure() {
		// -define .csv file in app
		// -File class needed to turn stringName to actual file
		File file = new File("nflstats15.csv");
		try {
			// -read from filePooped with Scanner class
			Scanner inputStream = new Scanner(file);
			// hashNext() loops line-by-line
			int x = 2;
			while (inputStream.hasNext()) {
				// read single line, put in string
				if (x == 2 || x == 3 || x == 4||x==5) {
					String data = inputStream.nextLine();
					System.out.println(data + "***");
				}
				x++;
			}
			// after loop, close scanner
			inputStream.close();

		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}

	}
}
