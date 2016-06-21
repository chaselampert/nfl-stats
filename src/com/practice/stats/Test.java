package com.practice.stats;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import javax.print.DocFlavor.STRING;

public class Test {
	public static Map<Integer, Play> games = new HashMap<Integer, Play>();

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
				String data = inputStream.nextLine();
				String gameID = data.substring(0, data.indexOf(","));
				if (!gameID.equals("GameId")) {
					Integer id = Integer.parseInt(gameID);
					Play current = new Play(splitString(data));
					System.out.println(current);
					games.put(id, current);
				}

				if (x >= 2 && x <= 10) {
					// String[] sub = data.split(",");
					List<String> list = splitString(data);
					// System.out.println(sub.length + ": " +
					// Arrays.toString(sub));
					// System.out.println(list);
				} else {
					System.exit(0);
				}

				x++;

			}
			// after loop, close scanner
			inputStream.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static List splitString(String data) {
		List list = new ArrayList<String>();
		while (data.length() > 0) {
			String column = "";
			int commaIndex = data.indexOf(",");
			int quoteIndex = data.indexOf("\"");
			if (commaIndex == -1 && quoteIndex == -1) {
				list.add(data);
				return list;
			}
			if (commaIndex == 0) {
				data = data.substring(1);
				list.add(null);
			} else {
				if (commaIndex < quoteIndex || quoteIndex == -1) {
					column = data.substring(0, commaIndex);
					data = data.substring(commaIndex + 1);
				} else {
					column = data.substring(0, data.indexOf("\"", 1));
					data = data.substring(data.indexOf("\"", 1) + 1);
				}
				list.add(column);
			}
		}
		return list;
	}
}
