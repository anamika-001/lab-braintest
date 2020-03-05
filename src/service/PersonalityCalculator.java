package service;
import java.util.Scanner;
public class PersonalityCalculator {
	 
	  public int[] findAnswers(String options) {
		  String c[]=options.split(",");
			 int n=c.length;
			int a[]=new int[n];
			int i=0;
			for(String s:c)
			{
				a[i]=Integer.parseInt(s);
				i++;
				
			}
			
			
			return a;
			 //split the options and store in an separate string variable
		  	 //Change the type as integers - and store it in an int array
		  	 //Return integer array
		 }
		  
		 public String findYourBrainType(String options) {
			
			 int a[]=findAnswers(options);
			 
			 int x=a[0]+a[1]+a[2]+a[4]+a[7]+a[9]+a[10]+a[11]+a[13]+a[17]+a[19];
				int y=a[3]+a[5]+a[6]+a[12]+a[14]+a[15]+a[16]+a[18];
			 int X=66-x+y;
			       
			 
			 if(20<=X&&X<=55) {
				 return "Left-Brained";
			 }
			 else if(56<=X&&X<=64) {
				 return "No clear preference ";
			 }
			 else if(X>=65&&X<=100)
			    return "Right-brained";
			 else 
				 return "smething wrong";
			
		 }
	 }
// Create a class called PersonalityCalculator
// PersonalityCalculator has two methods findAnswers and findYourBrainType
// integer[] findAnswers(String options) and String findYourBrainType(String options) is the method prototype
// findAnswer() accepts String as an argument and returns integer array as an output
// findYourBrainType accepts String as an argument and returns String as an output
// option is a string which contains all the options selected as a string
// Use the split method to segregate the options and store it in a string array.
// Convert the string array into an integer array.
// return the entire integer array to findyourBrainType
