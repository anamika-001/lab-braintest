package service;
import java.util.Scanner;
public class PersonalityCalculator {
	 
	  public int[] findAnswers(String options) {
		  String [] ar=new String[100];
		    ar=options.split("");
		    int [] array=new int[100];
		    array=(int)ar;
		    return array;
			 //split the options and store in an separate string variable
		  	 //Change the type as integers - and store it in an int array
		  	 //Return int array
		 }
		  
		 public String findYourBrainType(String options) {
			 String[] a= new String[100];
			 a=options.split(" ");
			 int [] arr=findAnswers(options);
			 int A = 0,B=0;
			 for(int i=0;i<20;i++) {
				 A=A+arr[i];
				 B=B+arr[i];
				 
			 }
			 int X=66-A+B;
			       
			 
			 if(20<=X&&X<=55) {
				 return "Left-Brained";
			 }
			 else if(56<=X&&X<=64) {
				 return "No clear preference ";
			 }
			 else
			 return "Right-brained";

			
		 }
	 }
// Create a class called PersonalityCalculator
// PersonalityCalculator has two methods findAnswers and findYourBrainType
// int[] findAnswers(String options) and String findYourBrainType(String options) is the method prototype
// findAnswer() accepts String as an argument and returns integer array as an output
// findYourBrainType accepts String as an argument and returns String as an output
// option is a string which contains all the options selected as a string
// Use the split method to segregate the options and store it in a string array.
// Convert the string array into an integer array.
// return the entire integer array to findyourBrainType
