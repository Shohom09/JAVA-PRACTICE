
import java.util.Scanner;

public class Factorial{  
 
 public static void main(String args[])
{
	fact();
 	}
 	
 public static void fact()
 	{  
  int i,fact=1;  
  int number;    
  System.out.println("Please enter a number: ");
  Scanner s = new Scanner(System.in);
	number = s.nextInt();
  
  for(i=1; i<=number ;i++){    
      fact=fact*i;    
	 }    
  System.out.println("Factorial of "+number+" is: "+fact);    
	 }  
}	