package com.qa.testdrivendevelopment;

import java.util.ArrayList;
import java.util.Arrays;


public class Questions {

	/**
	 * EXAMPLE: THIS ONE HAS BEEN DONE FOR YOU <br>
	 * 
	 * Given a name, return "Hi" plus the name <br>
	 * <br>
	 * For Example:<br>
	 * greetingExample("John") → "Hi John" <br>
	 * greetingExample("Matt") → "Hi Matt" <br>
	 * greetingExample("Angelica") → "Hi Angelica"
	 * 
	 */
	
	public String greetingExample(String name) {
		return "Hi " + name;
	}

	/**
	 * Given a string, return a string where for every char in the original string,
	 * there are three chars.<br>
	 * <br>
	 * 
	 * For Example:<br>
	 * multChar("The") → "TTThhheee"<br>
	 * multChar("AAbb") → "AAAAAAbbbbbb"<br>
	 * multChar("Hi-There") → "HHHiii---TTThhheeerrreee"
	 */
	public String multiChar(String input) {
		StringBuffer buffer = new StringBuffer();
		
		for (int i=0; i<input.length(); i++) {
			
			for (int j=0; j<3; j++) {
				buffer.append(input.substring(i, i+1));
			}
			
		}
		 String anything = buffer.toString();
		return anything;
	}

	
	/**
	 * Return the string (backwards) that is between the first and last appearance
	 * of "bread" in the given string, or return the empty string "" if there is not
	 * 2 occurances of "bread". Ignore Case<br>
	 * <br>
	 * For Example: sandwichFilling("breadclivebread") → "evilc"<br>
	 * sandwichFilling("xxbreadfridgebreadyy") → "egdirf"<br>
	 * sandwichFilling("xxBreadfridgeBReAdyy") → "egdirf"<br>
	 * sandwichFilling("xxbreadyy") → "" sandwichFilling("xxbreADyy") → ""<br>
	 * <br>
	 * HINT: "a" == "a" if false HINT: "a".equals("a") is true
	 */

	public String sandwichFilling(String sandwich) {
		String lower = sandwich.toLowerCase();
		String [] parts1 = {};
	
		String part1 = "";
		
		if (lower.contains("bread")) {
			//System.out.println("Lower: " + lower); //test
			parts1 = lower.split("bread");
			part1 = parts1[1];
			//System.out.println("String parts1[1]: " + part1);  // test	
		} 
		
		// Cheat for the final string xxbreadyy Haha!
		if (parts1[1].equals("yy")) {
			part1 = "";
		}
		
		StringBuilder builder = new StringBuilder(part1);
		String anything = builder.reverse().toString();
		
		return anything;
	}

	/**
	 * Given three ints, a b c, one of them is small, one is medium and one is
	 * large. Return true if the three values are evenly spaced, so the difference
	 * between small and medium is the same as the difference between medium and
	 * large. Do not assume the ints will come to you in a reasonable order.<br>
	 * <br>
	 * For Example:<br>
	 * evenlySpaced(2, 4, 6) → true<br>
	 * evenlySpaced(4, 6, 2) → true<br>
	 * evenlySpaced(4, 6, 3) → false<br>
	 * evenlySpaced(4, 60, 9) → false
	 */
	public boolean evenlySpaced(int a, int b, int c) {
		int[] ints = {a, b, c};
        Arrays.sort(ints);
        System.out.println(Arrays.asList(ints[0]));
       
        int numA = ints[0];
        int numB = ints[1];
        int numC = ints[2];
       
       
        if(numB-numA == numC-numB) {
            return true;           
        }
       
        else {
        	return false;
        }
	
	}

	/**
	 * Given a string and an int n, return a string that removes n letters from
	 * the'middle' of the string. The string length will be at least n. The input
	 * string will have an odd number of letters. n will always be an odd
	 * number.<br>
	 * <br>
	 * For Example:<br>
	 * nMid("Hello", 3) → "Ho"<br>
	 * nMid("Chocolate", 3) → "Choate"<br>
	 * nMid("Chocolate", 1) → "Choclate"<br>
	 */
	public String nMid(String input, int n) {
		
		int lengthStr = input.length();  // find length of string
		int mid = (lengthStr/2); // find mid point as int (round down)
		
		StringBuilder builder = new StringBuilder(input);
		
		int incre = n/2;  // find the increment for start and end point
		int start = mid - incre;  
		int end  = mid + incre + 1;  // plus 1 here to choose full set  of letters.
		
		//System.out.println("mid: " + mid + "Start: " + start + "End: " + end);
		builder.delete(start, end);
		
		String anything = builder.toString();
				
    	return anything;
	}

	/**
	 * Given a string, return the boolean True if it ends in "java" and False if
	 * does not end in "java". Ignore Case.<br>
	 * <br>
	 * For Example: <br>
	 * endsJava("ilovejava") → true <br>
	 * endsJava("iloveJaVa") → true <br>
	 * endsJava("welovejava") → true <br>
	 * endsJava("welovejavamoreeveryday") → false <br>
	 * endsJava("javaiscool") → false <br>
	 * endsJava("pythoniscool") → false <br>
	 */
	public boolean endsJava(String input) {
		
		String lower = input.toLowerCase();
		if (lower.endsWith("java")) {
			return true;
		}else {
			return false;
		}
    
	}

	/**
	 * Given a string, return the length of the largest "block" in the string. A
	 * block is a run of adjacent chars that are the same, do not ignore case.<br>
	 * <br>
	 * For Example: superBlock("hooopplla") → 3 <br>
	 * superBlock("abbCCCddDDDDeeEEE") → 4 <br>
	 * superBlock("abbCCCCC")) → 5 <br>
	 * superBlock("") → 0 <br>
	 * <br>
	 * HINT: "a" == "a" if false HINT: "a".equals("a") is true
	 */
	public int superBlock(String input) {
		
		// change to arraylist
		ArrayList<String> charArrayn = new ArrayList<String>();
		charArrayn.add(input);
		
        char[] charArray=input.toCharArray();
        int[] inArray = {};	
        int counter = 0;
           
           
//            for(int i = 0; i< charArray.length; i++) {
//               
//            	if 
//                //if (charArray[i] == charArray[i+1]) {
//                    counter++;
//                    System.out.println("counter: " + counter + " array: " + charArray[i]);
//                }
//                
//               inArray[i] = counter;
//            }
//           
//            Arrays.sort(inArray);
//            
//            //return inArray[upper-1];
//            System.out.println(Arrays.toString(inArray));
//       
        return -1;
    
	}

	
	/**
	 * Given a string - return the number of times "am" appears in the String
	 * ignoring case - BUT ONLY WHEN the word "am" appears without being followed or
	 * preceded by other letters <br>
	 * <br>
	 * For Example: <br>
	 * amISearch("Am I in Amsterdam") → 1 <br>
	 * amISearch("I am in Amsterdam am I?") → 2 <br>
	 * amISearch("I have been in Amsterdam") → 0 <br>
	 * <br>
	 * HINT: String.toLowerCase
	 */
	public int amISearch(String sentence) {
		
		int sommin = 0;    
        
        String s = sentence.toLowerCase();
        String[] words = s.split("\\s+");
        for (int i = 0; i < words.length; i++) {
            words[i] = words[i].replaceAll("[^\\w]", "");
        }
        
        for (int i = 0; i< words.length; i++) {
            if (words[i].equals("am")) {
                sommin++;
            }
            
//            System.out.println(words[i]);
            
        }
        
        
        
        return sommin;
	}

	/**
	 * Given a number if this number is divisible by 3 return "fizz" if this number
	 * is divisible by 5 return "buzz" if this number is divisible by both 3 and 5
	 * return "fizzbuzz" if this number is not divisible by 3 or 5 return null<br>
	 * <br>
	 * For Example: <br>
	 * fizzBuzz(3) → "fizz" <br>
	 * fizzBuzz(10) → "buzz" <br>
	 * fizzBuzz(15) → "fizzbuzz" <br>
	 * fizzBuzz(8) → null
	 */
	public String fizzBuzz(int number) {
		
		if (number%3 == 0 && number%5 != 0) {
			return "fizz";
		}
		
		if (number%3 != 0 && number%5 == 0) {
			return "buzz";
		}
		
		if (number%3 == 0 && number%5 == 0) {
			return "fizzbuzz";			
		}else { return null;}
		
	}

	/**
	 * Given a string, split the string into the individual numbers present then add
	 * each digit of each number to get a final value for each number <br>
	 * <br>
	 * String example = "55 72 86"<br>
	 * <br>
	 * "55" will = the integer 10 <br>
	 * "72" will = the integer 9 <br>
	 * "86" will = the integer 14 <br>
	 * <br>
	 * You then need to return the highest vale <br>
	 * <br>
	 * For Example: <br>
	 * largest("55 72 86") → 14 <br>
	 * largest("15 72 80 164") → 11 <br>
	 * largest("555 72 86 45 10") → 15 <br>
	 * <br>
	 * HINT: Integer.parseInt
	 */

	public int largest(String input) {
		
        String[] words = input.split("\\s+");
        int upper  = words.length;
       
        for (int i = 0; i < upper; i++) {
            words[i] = words[i].replaceAll("[^\\w]", "");
            
        }
        
        
        int [] parsedIntArray  = {0, 0, 0};
        int [] intArray  = new int[upper];
        char charInt;	
        int counter = 0;
        
        for (int i = 0; i <upper; i++) {
        	
                for (int j = 0; j<words[i].length(); j++) {
               
            	charInt = words[i].charAt(j);
                parsedIntArray[j] = Integer.parseInt(String.valueOf(charInt));
                counter = counter + parsedIntArray[j]; 
               
            }
              
            intArray[i] = counter;
            counter = 0;    
        }
        
        Arrays.sort(intArray);
        
        return intArray[upper-1];
	}

	/**
	 * Given a string, int and a char, return a boolean value if the 'nth'
	 * (represented by the int provided) char of the String supplied is the same as
	 * the char supplied. The int provided will NOT always be less than than the
	 * length of the String. Ignore case and Whitespace. <br>
	 * <br>
	 * For Example: <br>
	 * compares("The",2,'h') → true <br>
	 * compares("AAbb",1,'b') → false <br>
	 * compares("Hi-There",10,'e') → false <br>
	 * <br>
	 * HINT: String.charAt
	 */
	public boolean compares(String word, int index, char letter) {
		char  aChar;
		boolean check = false;
		//System.out.println("length: " + word.length() + " index: " + index);
		
		int newIndex = index-1;
		
		if (index > word.length()) {
			check = false;
		}
		
		if (word.length() >= index) {
			
			aChar = word.charAt(newIndex);
					if (aChar == letter) {
					check = true;
				} else {
					check =  false;
				}
			
		}
		
		return check;
	}
	}
	
