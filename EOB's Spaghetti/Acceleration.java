public class Acceleration{
public static void main(String[] args){

	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter v0: ");
	int v0 = input.nextInt();
	
	System.out.print("Enter v1: ");
	int v1 = input.nextInt();
	
	System.out.print("Enter t: ");
	int t = input.nextInt();
	
	double averageAccelation = v1 - v0 / t;
	
	System.out.println("The average acceleration is " +  averageAcceleration);

}
}
