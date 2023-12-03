/**Student Name: First Last
*Date Completed: 05/03/2022

*Project No. and Page No. in the book: Chapter 7 PP

*Extra Credit: Yes: Extra Credit 1, 2, & 3

*Project Description: The program calculates the user's difference in monthly earnings from one year to the other, the average of the user's income within a year. 
*Using for loops to obtain the user's input to assign to the appropriate array for later display.
**/

package incomecalculator;

import java.text.DecimalFormat;
import java.util.Scanner;

public class AnnualIncomeCalculator {

	public static void main(String[] args) {
		// Declaring necessary array's and constant to use in program
		final int MONTH = 12;
		double avgTwentyOne = 0, avgTwentyTwo = 0;
		double [] twentyOne = new double [MONTH];
		double [] twentyTwo = new double [MONTH];
		double [] monthlyDif = new double [MONTH];
		String [] monthName = new String [MONTH];
		
		
		// assigning each string array value to corresponding month name
		monthName[0] = "Jan:\t";
		monthName[1] = "Feb:\t";
		monthName[2] = "Mar:\t";
		monthName[3] = "Apr:\t";
		monthName[4] = "May:\t";
		monthName[5] = "Jun:\t";
	    monthName[6] = "Jul:\t";
		monthName[7] = "Aug:\t";
		monthName[8] = "Sep:\t";
		monthName[9] = "Oct:\t";
		monthName[10] = "Nov:\t";
		monthName[11] = "Dec:\t";
																		
		//creating scanner object
		Scanner scan = new Scanner (System.in);
		
		//intro message displayed to user
		System.out.println("~~~~~Welcome to the Salary Calculation System~~~~~");
		System.out.println();
		System.out.println("Please enter your 2022 monthly wages: ");
		
		//for loop to obtain user's input for year 2022 while assigning array's value 
		//and also calculating average of the year based on user's input
		for (int i = 0; i < twentyTwo.length; i++)
		{	
			System.out.print(monthName[i]);
			twentyTwo[i] = scan.nextDouble();	
			avgTwentyTwo += twentyTwo[i]/MONTH;
		}
		
		
		
		System.out.println();
		
		//for loop to obtain user's input for year 2021 while assigning array's value 
		//and also calculating average of the year based on user's input
		System.out.println("Please enter your 2021 monthly wages: ");
		for (int k = 0; k < twentyOne.length; k++)
		{	
			System.out.print(monthName[k]);
			twentyOne[k] = scan.nextDouble();
			avgTwentyOne += twentyOne[k]/MONTH;
		}
		
		//for loop to obtain difference of user's monthly income from one year to another
		for (int j = 0; j < monthlyDif.length; j++)
		{	
			monthlyDif[j]= twentyTwo[j] - twentyOne[j];
				
		}
		
		
		System.out.println();
		System.out.println();
		// creating viewable categories for user
		System.out.println("Here is the information you entered and the difference");
		System.out.println();
		System.out.println("Month\t2022\t\t2021\t\tDifference");
		
		//creating format to display number's with 3 decimal places
		DecimalFormat fmt = new DecimalFormat("0.000");
		
		//using for loop to display all months, user's input at specific value index's, and the difference between the two years
		for (int k = 0; k < twentyOne.length; k++)
		{
			System.out.println(monthName[k] + fmt.format(twentyTwo[k]) + "\t\t" + fmt.format(twentyOne[k]) + "\t\t" + fmt.format(monthlyDif[k]));
			
		}
		//display of the user's average annual income for each year
		System.out.println();
		System.out.println("2022 Average: $" + fmt.format(avgTwentyTwo));
		System.out.println();
		System.out.println("2021 Average: $" + fmt.format(avgTwentyOne));
		System.out.println();
		//using if else statements to display particular message and difference of annual average from one year to another
		if (avgTwentyTwo>avgTwentyOne)
			System.out.println("You made on average $" + fmt.format((avgTwentyTwo - avgTwentyOne)) + " more dollars in 2022 than in 2021" );
		
		else if (avgTwentyTwo<avgTwentyOne)
			System.out.println("You made on average $" + fmt.format((avgTwentyOne - avgTwentyTwo)) + " fewer dollars in 2022 than in 2021");
		
		else 
			System.out.println("You made the same amount of money in both 2021 and 2022");
			
	}

}
