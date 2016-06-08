import java.util.Scanner;

public class Scanning{
    public static void main(String args[]){

    Scanner scan= new Scanner(System.in);

   int count = 0;
   do
   {
	   System.out.println("Enter your input");
	   //For string
   
    String text= scan.nextLine();

    System.out.println(text);

    //for int

    int num= scan.nextInt();

    System.out.println(num);
   count = count++;
   } while (count < 10); 
}
}