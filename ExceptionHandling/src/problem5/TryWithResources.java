package problem5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;




public class TryWithResources {
	
	public static void main(String[] args) throws IOException{
		
		try(BufferedReader br = new BufferedReader(new FileReader( "C:/Users/dac/Documents/vijay1.txt")))
		{
			String i;
			while((i=br.readLine())!=null)
			{
				System.out.println(i);
			}
		}
		catch(Exception e)
		{
			System.err.println(e);
		}
		
		System.out.println("rest of the code follows");
	}

}
