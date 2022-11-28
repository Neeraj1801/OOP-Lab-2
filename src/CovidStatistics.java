

/**
* File Name: CovidStatistics.java
* Course: CST8284-OOP
* Assignment: Lab 2
* Date:29th September 2022
* Professor: Sandra Iroakazi
* Purpose: To write nested for loops for printing name of provinces, calculating sum of the patients array and print it.
* @author Neeraj Katewa
* 
*/

public class CovidStatistics
{
	
public static void main(String[] args)
 {
   final int ROWS = 7;
   final int COLUMNS = 8;
   //2 dimensional array for storing recovered patients
   int[][] patients = 
      { 
         {  2200, 1100, 1200, 1000, 1015, 2000, 1092, 2204 },
         {  5020, 6105, 2009, 9047, 1016, 2014, 2708, 2308 }, 
         {  1720, 2406, 3054, 1018, 1023, 3100, 1406, 1502 }, 
         {  1490, 2002, 2016, 5008, 2044, 1055, 1607, 2201 },
         {  1520, 1007, 1092, 2065, 1023, 1010, 1046, 1502 },
         {  1670, 1201, 2008, 2001, 1086, 1009, 1041, 1706 },
	     {  1870, 2001, 2078, 1006, 1053, 1702, 1009, 1406 }
         
      };
   // an array of string to store the name of provinces
   String[] provinces = 
      { 
         "Ontario", 
         "Quebec", 
         "Nova Scotia",
         "New Brunswick", 
         "Manitoba", 
         "British Columbia",
	     "Prince Edward Island"         
      };
   
   System.out.println("               Month    Feb     March   April    May    June    July    Aug     Sept");//printing the months
   for(int i=0;i<ROWS;i++) //first for loop for the rows
	 {	 
		 System.out.printf("%n%20s",provinces[i]); //printing the name of provinces
		 for(int j=0;j<COLUMNS;j++) //nested for loop for the columns
		 {
			 System.out.printf("    %d",patients[i][j]); //printing the recovered patients
		 }
	 }

   System.out.println();
   System.out.print("  Recovered Patients");
   for(int i=0;i<COLUMNS;i++) //loop for calculating the total of recovered patients
   {
	   int sum=0; //initializing sum variable
	   for(int j=0;j<ROWS;j++) //nested loop
	   {	
	   		sum+=patients[j][i];  //calculating the sum of patients recovered every month and storing value in sum
		    
	   }
	   System.out.printf("  %6d", sum); //printing the calculated sum
   }
   System.out.println(); 
   System.out.println(); 
   System.out.println("               Vaccinate and maintain good health practices!" );
}
}




   
   
   
   
   





