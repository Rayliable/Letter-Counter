package codes;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		 File infile = new File("Art Of War.txt");
		 Scanner input = new Scanner(infile);
		 String word = "";
		 int[] alphabet = new int[26];
		 char[] alphabetLetters = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','W','V','X','Y','Z'};
		 		
		 while(input.hasNext())
		 {
			 word = input.next();
			 
			 for(int x=0;x<word.length();x++){
				 
				 if(word.charAt(x)>=97&&word.charAt(x)<=122)
					 alphabet[word.charAt(x)-97]++;
				 
				 else if(word.charAt(x)>=65&&word.charAt(x)<=90)
					 alphabet[word.charAt(x)-65]++;
			 }
		 }
		 
		 for(int x=0;x<26;x++)
			 System.out.println(alphabetLetters[x] +": " +alphabet[x]);
		 
		 input.close();
	}
}
