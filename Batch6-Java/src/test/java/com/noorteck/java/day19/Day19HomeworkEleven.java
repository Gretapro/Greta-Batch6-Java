package com.noorteck.java.day19;

public class Day19HomeworkEleven {
	
	public static void main(String[] args) {
		Day19HomeworkEleven obj = new Day19HomeworkEleven();
		obj.threeEqual("Java Pro", 'P', 'B');
		obj.threeEqual("Lazy mode", 'm', 'C');
		obj.threeEqual("Training", 'T', ' ');
		
	}
	protected String threeEqual(String str, char oldChar, char newChar) {
		String result="";
		
		str.replace(oldChar, newChar);
		System.out.println(str.replace(oldChar, newChar));
		
		return result;
		
	}

}



/**

11. Write a method that takes three parameters. One String parameter, 2 character
parameters. The method replaces old character (parameter 2) from String parameter
with new character (parameter 3) and returns the new string

Access Modifier: protected
Non-Access Modifier: non-static
Return Type: String
Method Name: threeEqual
Parameter1: String str
Parameter2: char oldChar
Parameter3: char newChar
Test Data:
threeEqual (“Java Pro”, ’P’, ‘B‘) ----- Java Bro
threeEqual (“Lazy mode”, ‘m‘, ‘C‘) ----- Lazy Cod
threeEqual (“Training”, ‘T’, ‘ ‘) ----- raining




*/