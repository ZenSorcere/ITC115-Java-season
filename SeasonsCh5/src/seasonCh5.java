//*******************************************************************
//	ITC 115 - Assignment 5 - seasonCh5 class/season method
//  Write a method named season that takes two integers as parameters
//	representing a month and day and that returns a String indicating the
//	season for that month and day. Assume that months are specified as an
//	integer between 1 and 12 (1 for January, 2 for February, and so on) and
//	that the day of the month is a number between 1 and 31.
//
//	If the date falls between 12/16 and 3/15, you should return "Winter". If
//	the date falls between 3/16 and 6/15, you should return "Spring". If the
//	date falls between 6/16 and 9/15, you should return "Summer". And if the
//	date falls between 9/16 and 12/15, you should return "Fall".
//
//	By: Mike Gilson
//	Date: 2/6/2020
//*******************************************************************



public class seasonCh5 {

	public static void main(String[] args) {
		
//	I borrowed the test values from the PracticeIt exercise as Test Cases
//	for verifying the if/else-if statements:
		
		season(12, 16);  // returns Winter
		season(1, 1);    // returns Winter
		season(3, 15);   // returns Winter
		season(3, 16);   // returns Spring
		season(5, 1);    // returns Spring
		season(6, 15);   // returns Spring
		season(6, 16);   // returns Summer
		season(8, 1);    // returns Summer
		season(9, 15);   // returns Summer
		season(9, 16);   // returns Fall
		season(11, 30);  // returns Fall
		season(12, 15);  // returns Fall
		
	}  // End main method

// 	Creates the season method, with two ints for month and day as
//	parameters, and returns a String.
	
	public static String season(int month, int day) {

//	Initialize return String as empty
		
	    String sea="";
	    
//	If/Else-if statement to analyze date and month ints. Due to the requirements
//	of the day being mid-month for the cut off between seasons, each IF has
//	3 conditions, separated with the OR operator:
//	  --One to check if the date is in the latter half of the specific overlapping month,
//	  --One to check if the month is completely in the season where all dates qualify,
//	  --One to check if the date is in the first half of the specific overlapping month.
//	Once one of the if statements conditions are met, the "sea" variable is set with the 
//	appropriate season.
	    
	    if ((month == 12 && day > 15) || (month < 3) || (month == 3 && day < 16)) {
	      sea = "Winter";    
	    }  // End if
	    else if ((month == 3 && day > 15) || (month > 3 && month < 6) || (month == 6 && day < 16)) {
	      sea = "Spring";   
	    }  // End else if
	    else if ((month == 6 && day > 15) || (month > 6 && month < 9) || (month == 9 && day < 16)) {
	      sea = "Summer";   
	    }  // End else if
	    else if ((month == 9 && day > 15) || (month > 9) || (month == 12 && day < 16)) {
	      sea = "Fall";   
	    }  // End else if
	    
//	Print out the result with the entered ints and the season String output
	    
	    System.out.println("(" + month + ", " + day + ") = " + sea);
	    
//	Returns the sea String, per the method
	    return sea;
	    
		}  // End season method

	}  // End seasonCh5 class
