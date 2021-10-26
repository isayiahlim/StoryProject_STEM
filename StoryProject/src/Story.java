/**
 * Name: Isayiah Lim
 * Date Last Updated: 10/26/2021
 * APCSA Period: 2
 * Story Project
 * 
 * Program Description (in your own words):
 * 
 * 
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
		System.out.println("Write a sentence:");
		String sentence = input.nextLine();
		int length = sentence.length();
		String newSentence = sentence.substring(2,length) + sentence.substring(0,2);
		return newSentence; 
	}
}
