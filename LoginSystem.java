public class LoginSystem{
public static void main(String[] args){

		String username = "Mayowa";
		int pin = 290100;

	Scanner input = new Scanner(System.in);
	
	System.out.print("ENter username: ");
	String name = input.nextLine();
	
	System.out.print("Enter your pin: ");
	int pinCode = input.nextInt();
	
	if(name.equals(username) && pinCode == pin){
		System.out.println("Login sucessful");
	}else{
	    System.out.print("Login failed")	
	}

}
}
