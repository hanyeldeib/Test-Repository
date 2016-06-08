import java.io.*;

public class DisplayValues {

	public static void main(String[] args){
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
