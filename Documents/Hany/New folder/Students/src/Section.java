import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Section {
	
	int getNum() throws IOException
	{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println ("Enter Number of Students");
		int classSize = Integer.parseInt(br.readLine());
		return classSize;
	}
    
}
