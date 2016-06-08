import java.util.Scanner;
public class EnterInput {

	public static void main(String[] args) {
		// 

		Scanner keyboard = new Scanner(System.in);
		System.out.println("enter an integer");
		int myint = keyboard.nextInt();
		System.out.println("your number is  "+myint);
	}

}
