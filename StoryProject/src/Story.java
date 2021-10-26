/**
 * Name: Isayiah Lim
 * Date Last Updated: 10/26/2021
 * APCSA Period: 2
 * Story Project
 * 
 * Program Description (in your own words):
 * This code writes a mad lib-style story with trees between each of the paragraphs. The user 
 * will input words to fill in the story, and then the story will print out.
 */
//imports scanners
import java.util.Scanner;
public class Story {
	public static void main(String[] args) 
	{
		
	}
	
	//asks for first name
	public static String nameGame(Scanner input)
	{
		System.out.println("What is your first name: ");
		String name = input.next();
		return name;
	}
	
	//rotates the letters right by two
	public static String rotateRight(Scanner input, String question)
	{
		System.out.println(question);
		String sentence = input.nextLine();
		int length = sentence.length();
		String newSentence = sentence.substring(length-2) + sentence.substring(0,length-2);
		return newSentence; 
	}
	
	//rotates the letters right by the number int num 
	public static String rotateRight(Scanner input, String question, int num)
	{
		System.out.println(question);
		String sentence = input.nextLine();
		int length = sentence.length();
		String newSentence = sentence.substring(length-num) + sentence.substring(0,length-num);
		return newSentence; 
	}
	
	//rotates the letters left by two
	public static String rotateLeft(Scanner input, String question)
	{
		System.out.println(question);
		String sentence = input.nextLine();
		String newSentence = sentence.substring(2) + sentence.substring(0,2);
		return newSentence; 
	}
	
	//rotates the letters left by number num
	public static String rotateLeft(Scanner input, String question, int num)
	{
		System.out.println(question);
		String sentence = input.nextLine();
		String newSentence = sentence.substring(num) + sentence.substring(0,num);
		return newSentence; 
	}
	
	//skips every other letter in an answer
	public static String skipLetters(Scanner input, String question)
	{
		System.out.println(question);
		String sentence = input.nextLine();
		String newSentence = "";
		
		//adds every other letter to the new string
		for(int i = 0; i < sentence.length(); i+=2)
			newSentence += sentence.substring(i,i+1);
		return newSentence;
	}
	
	//skips every other letter, beginning at the starting int
	public static String skipLetters(Scanner input, String question, int start)
	{
		System.out.println(question);
		String sentence = input.nextLine();
		String newSentence = "";
		
		//adds every other letter to the new string
		for(int i = start; i < sentence.length(); i+=2)
			newSentence += sentence.substring(i,i+1);
		return newSentence;
	}
	
	//reverses the input
	public static String reverse(Scanner input, String question)
	{
		System.out.println(question);
		String sentence = input.nextLine();
		String newString = "";
		int length = sentence.length();
		
		//for every letter in the string, it places it in a new one, starting from the end
		for (int i = length-1; i > 0; i--)
			newString += sentence.substring(i,i+1);
		return newString;
	}
	
	//mixes up three words according to the number input by the user
	public static String wordMix(Scanner input)
	{
		//stores the three words
		System.out.println("Input three words, separated by spaces. Then hit enter.");
		String first = input.next();
		String second = input.next();
		String third = input.next();
		System.out.println("Input a number between 1 and 10. Then hit enter.");
		int num = input.nextInt();
		
		//takes the middle of each word
		String firstMiddle = first.substring(first.length()/2-1,first.length()/2 +1);
		String secondMiddle = second.substring(second.length()/2-1,second.length()/2 +1);
		String thirdMiddle = third.substring(third.length()/2-1,third.length()/2 +1);
		String finalString = "";
		
		//repeats the middles number num times
		for (int i = 0; i < num; i++)
		{
			finalString += firstMiddle;
			finalString += secondMiddle;
			finalString += thirdMiddle;
		}
		return finalString;
	}
	
	/*
	 * finds the vowels n a string, returns the string starting from the last time a vowel 
	 * occurs for the first time.
	*/
	public static String fromVowel(Scanner input, String question)
	{
		System.out.println(question);
		String sentence = input.nextLine();
		
		//gets the index of each vowel
		int a = sentence.indexOf("a");
		int e = sentence.indexOf("e");
		int i = sentence.indexOf("i");
		int o = sentence.indexOf("o");
		int u = sentence.indexOf("u");
		int last = 0;
		
		//for loops determining the smallest index
		for (int b = a; b < e; b+=a)
			last += a;
		for (int b = e; b < a; b+=e)
			last += e;
		for (int b = last; b < i; b+=last)
		{
			last -= last;
			last += i;
		}
		for (int b = last; b < o; b+=last)
		{
			last -= last;
			last += o;
		}
		for (int b = last; b < u; b+=last)
		{
			last -= last;
			last += u;
		}
		
		//makes a new sentence starting at that index
		String newSentence = sentence.substring(last);
		return newSentence;
	}
}
