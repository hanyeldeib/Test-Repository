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
			System.out.println("Enter burn rate or <0 to quit: ");
			
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
//This should match with the book.
// I changed these lines

class CalcNewValues {
	
	public static void main2(String[] args){
		
		
		final int GRAVITY = 2;
		int altitude = 1000;
		int fuel = 500;
		int velocity = 70;
		int time = 0;
		
		try{
			BufferedReader inputReader = new
					BufferedReader(new InputStreamReader(System.in));
			
			System.out.println("%a" + altitude);
			System.out.println("%f" + fuel);
			System.out.println("%v" + velocity);
			System.out.println("%" + time);
			
			String inputLine = null;
			do{
				inputLine =inputReader.readLine();
				if((inputLine != null) &&
						(inputLine.length() > 0)) {
					
					if(inputLine.startsWith("#")){
						System.out.println(inputLine);
						
					}
					else if(inputLine.startsWith("%")){
						try{
							int burnRate =
									Integer.parseInt(inputLine.substring(1));
							if(altitude <= 0){
								System.out.println("#The game is over.");
							}
							else if(burnRate > fuel){
								System.out.println("Sorry, you don't" +
							"have that much fuel.");
							}
							else {
								time = time + 1;
							altitude = altitude - velocity;
							velocity = ((velocity + GRAVITY)*10-burnRate*2)/10;
							fuel = fuel - burnRate;
							if(altitude <= 0){
								altitude = 0;
								if(velocity <= 5){
									System.out.println("#You have landed safely.");
								}
								else{
									System.out.println("#You have crashed.");
								}
							}
						}
						
						System.out.println("%a" + altitude);
						System.out.println("%f" + fuel);
						System.out.println("%v" + velocity);
						System.out.println("%t" + time);
					
					}
					catch(NumberFormatException nfe){
					}
				}
			}
		}while((inputLine != null) && (altitude > 0));
		inputReader.close();
	}
	catch(IOException ioe){
		ioe.printStackTrace();
								}
							}
						}

 class DisplayValues {

	public static void main3(String[] args){
		try{
			System.out.println("Displaying values");
			BufferedReader inputReader = new
					BufferedReader(new InputStreamReader(System.in));
			
			String inputLine = null;
			do{
				inputLine = inputReader.readLine();
				if((inputLine != null) &&
						(inputLine.length() > 0)){
					
					System.out.println(inputLine.substring(1));
				}
				else if(inputLine.startsWith("%")){
					if(inputLine.length() > 1){
						try{
							char valueType = inputLine.charAt(1);
							int value =
									Integer.parseInt(inputLine.substring(2));
							
							switch(valueType){
							case 'a':
								System.out.println("Altitude" + value);
								break;
							case 'f':
								System.out.println("Fuel remaining" + value);
								break;
							case 'v':
								System.out.println("Current velocity" + value);
								break;
							case 't':
								System.out.println("Time elapsed" + value);
							}
						}
						catch(NumberFormatException nfe){
					}
				}
			}
		}

		while(inputLine != null);
	inputReader.close();
}
	catch(IOException ioe){
	ioe.printStackTrace();
}
}
}
