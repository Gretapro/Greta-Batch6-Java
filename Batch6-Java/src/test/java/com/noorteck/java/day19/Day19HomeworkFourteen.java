package com.noorteck.java.day19;

public class Day19HomeworkFourteen {
	public static void main(String[] args) {

		String resultOne = getSubStr("java training", 2, 6);
		String resultTwo = getSubStr("Software Development Engineer in Test", 11, 23);
		String resultThree = getSubStr("Software Development Engineer in Test", 21, 29);
		System.out.println(resultOne);
		System.out.println(resultTwo);
		System.out.println(resultThree);

	}

	public static String getSubStr(String str, int startingIndex, int endingIndex) {
		String result = " ";

		result = str.substring(startingIndex, endingIndex);

		return result;

	}

}

/**
 * 
 * 14. Write a method to get a substring of a given string between two specified
 * positions.
 * 
 * Access Modifier: public Non-Access Modifier: static Return Type: String
 * Method Name: getSubStr Parameter1: String str Parameter2: Int startingIndex
 * Parameter2: Int endingIndex Test Data: getSubStr (“java training”, 2 ,6)
 * ----- v at getSubStr (“Software Development Engineer in TEST”, 11, 23) -----
 * velopment En getSubStr (“Software Development Engineer in TEST”, 21, 29)
 * ----- Engineer
 * 
 */