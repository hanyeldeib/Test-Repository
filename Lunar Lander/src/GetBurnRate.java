import java.io.*;

public class GetBurnRate {
	public static void main(String[] args){

	System.out.println("Start Lunar Lander");
	
	try{
		BufferedReader inputReader =
				new BufferedReader(new 
						BufferedReader(new 
						InputStreamReader(System.in)));
		
		int burnRate = 0;
		do {
			System.out.println("Enter burn rate 0r <0 to quit: ");
			
			try{
				String burnRateString = 
						inputReader.readLine();
				burnRate = 	Integer.parseInt(burnRateString);
				
				System.out.println("%"+burnRate);
			  }
				catch(NumberFormatException nfe)
				{
				System.out.println("#Invalid burn rate");
				}
		  }
		while(burnRate >=0);
				inputReader.close();
	
	            }
				catch(IOException ioe){
					ioe.printStackTrace();
		        }
		}
	}
