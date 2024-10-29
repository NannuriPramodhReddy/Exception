package problem4;

import java.util.Scanner;

public class NestedException {

	public static void main(String[] args) throws NegativeNumberException  {
		int num = 0;
		
			Scanner sc = new Scanner(System.in);
			try {
			System.out.println("Enter integer: ");
			 num = sc.nextInt();
			     try {
			    	 if(num<0)
			    	 throw new NegativeNumberException("dont give negative number");
			    	 else
			    	 {
			    		 System.out.println(num);
			    	 }
			    		 }
			     catch ( Exception e)
			     {
			    	 System.err.println(e);
			     }
			}
			catch(Exception e)
			{
				System.err.println(e);
			}
		}
	
}

