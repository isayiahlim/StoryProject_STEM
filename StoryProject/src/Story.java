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
		for(int i = start; i < sentence.length(); i+=2)
			newSentence += sentence.substring(i,i+1);
		return newSentence;
	}
	
	//reverses the input
}
