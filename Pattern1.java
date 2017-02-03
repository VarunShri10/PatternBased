/*
 * Objective : This program Prints Pattern1 .
 * Date :  19-01-2017
 */

import static org.junit.Assert.assertEquals;

import java.util.Scanner;

public class Pattern1 {
	
		// This Function Calculates Space in a row and assign it to String
		public static String spaceCalculate(int row,int length){
			String space="";
			for(int index=1;index<=(length-row);index++){
				space=space.concat(" ");
			}
			return space;
		}
		
		// This Function Calculates Number in a row and Assign it to String
		public static String numberCalculate(int row,int length){
			String number="";
			String tempString;
			Integer tempNumber;
			int index;
			for(index=1;index<=row;index++){
				tempNumber=index;
				tempString=tempNumber.toString();
				number=number.concat(tempString);
				
			}
			index--;
			while(index>1){
				index--;
				tempNumber=index;
				tempString=tempNumber.toString();
				number=number.concat(tempString);
			}
			return number;
		}
		
		// This Function Merge The Space String and Number String
		public static String joinString(String spaceString,String numberString){
			String resultString=spaceString.concat(numberString);
			return resultString;
		}
	
		// This Function creates Pattern
		public  String[] function(int number) {
			if(number<=0){
				String result[]={"Invalid Input"};
				return result;
			}
			else
			{
				String spaceString="";
				String numberString="";
				String temperaryString="";
				int length=((2*number)-1);
				String[] resultantStringArray=new String[length];
				int index;
				int temperary=0;
				for(index=1;index<=number;index++){
					spaceString=Pattern1.spaceCalculate(index,number);
					numberString=Pattern1.numberCalculate(index,number);
					temperaryString=Pattern1.joinString(spaceString,numberString);
					resultantStringArray[temperary]=temperaryString;
					temperary++;
				}
				int secondTemperary=temperary-2;
				while(temperary<length){
					resultantStringArray[temperary]=resultantStringArray[secondTemperary];
					temperary++;
					secondTemperary--;
				}
				return resultantStringArray;
			}
		}
		
		
		// To Display Pattern
		public void displayPattern(String arrayParameter[]){
			for(String string:arrayParameter){
				System.out.println(string);
			}
		}
		
		// Main Function
		public static void main(String[] args) {
			Pattern1 object=new Pattern1();
			Scanner scannerObject=new Scanner(System.in);
			int number=scannerObject.nextInt();
			String result[]=object.function(number);
			object.displayPattern(result);		// To Display Result
			scannerObject.close();
		}
}
