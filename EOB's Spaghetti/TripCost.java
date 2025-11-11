import java.util.Scanner;

public class TripCost{
public static void main(String[] args){

	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter the distance driven: ");
	double distance = input.nextDouble();
	
	System.out.print("Enter miles per gallon: ");
	double mpg = input.nextDouble();
	
	System.out.print("Enter price per gallon: ");
	double price = input.nextDouble();
	
	double drivingCost = (distance /mpg)*price;
	
	System.out.println("The cost of the trip is $" + drivingCost);
}
}
