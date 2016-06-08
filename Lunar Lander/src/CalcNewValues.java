import java.io.*;

public class CalcNewValues {
	
	public static void main(String[] args){
		
		
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