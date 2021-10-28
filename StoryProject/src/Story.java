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
		Scanner input = new Scanner(System.in);
		String name = nameGame(input);
		String fixedRightRotate = rotateRight(input, "Write a sentence, then press enter.");
		
		drawTree('+', 3, 5);
	}
		
	//draws the tree based off of the symbol, segment, and height that the user chooses
	public static void drawTree(char symbol, int segment, int height)
	{
		//variable that adds more spaces to the top and decreases by one each new segment
		int spaces = segment-1;
		//variable that starts at zero and adds one more symbol for each new segment
		int symbolNum = 0;
		//repeats the triangles in the tree segment number of times
		for(int s = 0; s < segment; s++)
		{
			//makes the triangle based off height
			for(int h = 0; h < height; h++)
			{
				//prints the spaces before the shape
				for(int i = 0; i < height + spaces - h - 1; i++)
					System.out.print(" ");
				//prints the shape
				for(int j = 0; j < 2 * h + 1 + 2 * symbolNum; j++)
					System.out.print(symbol);
				System.out.println();
			}
			symbolNum++;
			spaces--;
		}
		//prints the tree trunk
		for(int k = 0; k < 2; k++)	
		{
			//spaces first
			for(int l = 0; l < (height - 2) + segment; l++)
				System.out.print(" ");
			//then trunk
			System.out.println(symbol);
		}
		//prints the base
		for(int l = 0; l < 2; l++)
		{
			//spaces
			for(int m = 0; m < (height - 4) + segment; m++)
				System.out.print(" ");
			//base part
			for(int n = 0; n < 5; n++)	
				System.out.print(symbol);
			System.out.println();
		}
	}
	
	//asks for first name and returns the name game
	public static String nameGame(Scanner input)
	{
		System.out.println("What is your first name: ");
		String name = input.next();
		String b= name.substring(1);
		String game = name + ", bo-B" + b + ", banana-fana fo-F" + b + ", fee-fi-mo-m" + b;
		return game;
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
		//gets the highest first occurrence 
		int aOrE = Math.max(a,e);
		int orI = Math.max(aOrE, i);
		int orO = Math.max(orI, o);
		int orU = Math.max(orO, u);
		//makes a new sentence starting at that index
		String newSentence = sentence.substring(orU);
		return newSentence;
	}
}
