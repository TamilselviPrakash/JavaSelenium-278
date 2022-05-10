import java.util.Scanner;

public class ReverseStringUsinfStringBuffer
{

	public static void main(String[] args)
	{
	 Scanner sc= new Scanner (System.in);
	 System.out.println("Enter the String ");
	 String act =sc.next();
	 
	 
	  
	 StringBuffer sb = new StringBuffer(act);
	 StringBuffer rev=sb.reverse();
	 System.out.println(rev);
	 

	}

}
