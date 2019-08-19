import java.util.Scanner;
 
public class lemonadeSale {
 
 
	static Scanner sr = new Scanner(System.in);
	public static void main(String args[])
	
	{
	    
		            System.out.print("How much lemonade");
	
	int lemon= sr.nextInt();
	int total = 20;
	
	if(lemon >= 1 ) 
	{
		total = lemon * total;
		System.out.println("That will be" + " " + "$" + total);
	}
	if(lemon < 1 )
	{
		System.out.print("GET OUT OF MY RESTURANT");
	}
		
	                
	                
	                
	}
	}