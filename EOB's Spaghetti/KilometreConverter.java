import java.util.Scanner;

public class KilometreConverter{
 public static void main(String[] args){
 
 	  Scanner input = new Scanner(System.in);
 	  
 	  System.out.print("Enter miles to convert to Kilometre?: " );
 	  double miles = input.nextDouble();
 	  
 	  double kilometres = miles * 1.6;
 	  
 	  System.out.println("You've travelled " + kilometres + " kilometres");
 	  
 	  
 }
}
