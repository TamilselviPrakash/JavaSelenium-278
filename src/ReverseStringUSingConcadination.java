import java.util.Scanner;

public class ReverseStringUSingConcadination
{

	public static void main(String[] args)
	{
       Scanner sc= new Scanner(System.in);
       System.out.println("enter the string");
       String actS=sc.nextLine();
       
       int len= actS.length();
       String revS =" ";
       for (int i=len-1;i>=0;i--)
        {
        	revS=revS+actS.charAt(i);
        }
       System.out.println(revS);


	}

}
