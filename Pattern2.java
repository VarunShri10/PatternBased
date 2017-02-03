/*
 * Objective : This program Prints Pattern2 .
 * Date :  19-01-2017
 */

import static org.junit.Assert.assertEquals;

import java.util.Scanner;

public class Pattern2 {
	
			// This Function Calculates Space in a row and assign it to String
			public static String spaceCalculate(int row,int length){
				String space="";
				for(int index=length;index>(length-row);index--){
					space=space.concat(" ");
				}
				return space;
			}
			
			// This Function Calculates Number in a row and Assign it to String
			public static String numberCalculate(int row,int length){
				String numberString="";
				Integer temperaryInteger;
				String temperaryString;
				for(int index=1;(index<=length-row);index++){
					temperaryInteger=index;
					temperaryString=temperaryInteger.toString();
					numberString=numberString.concat(temperaryString);
				}
				return numberString;
			}
			
			// This Function Merge The Space String and Number String
			public static String joinString(String spaceString,String numberString){
				String resultString=spaceString.concat(numberString);
				return resultString;
			}
			
			// This Function creates Pattern
			public  String[]  function(int number){
				if(number<=0){
					String result[]={"Invalid Input"};
					return result;
				}
				else{
					String resultantString[]=new String[number];
					String spaceString="";
					String numberString="";
					for(int index=0;index<number;index++){
						spaceString=Pattern2.spaceCalculate(index, number);
						numberString=Pattern2.numberCalculate(index, number);
						resultantString[index]=Pattern2.joinString(spaceString, numberString);
					}
					return resultantString;
				}
			}
			
			// To Display Pattern
			public void displayPattern(String arrayParameter[]){
				for(String string:arrayParameter){
					System.out.println(string);
				}
			}
			
			// Main function
			public static void main(String[] args) {
				Pattern2 object=new Pattern2();
				Scanner scannerObject=new Scanner(System.in);
				int number=scannerObject.nextInt();
				String result[]=object.function(number);
				object.displayPattern(result);		// To Display Result
				scannerObject.close();
			}
}
