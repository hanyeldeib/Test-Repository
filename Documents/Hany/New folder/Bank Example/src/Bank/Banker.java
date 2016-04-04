package Bank;

public class Banker {
	public static void main(String [ ] args)
	{
		Client balance1 = new Client();
		Client balance2 = new Client();
		
		int current1 = balance1.initbalance() +1000;
		int current2 = balance2.initbalance() + 2000;
		
		System.out.println("Current 1   "+current1);
		System.out.println("Current 2   "+current2);
		
		
	}
	
	}
