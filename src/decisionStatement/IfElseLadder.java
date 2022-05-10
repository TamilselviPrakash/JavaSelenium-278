package decisionStatement;

import java.util.Scanner;

public class IfElseLadder 
{

	public static void main(String[] args)
	{
         Scanner sc = new Scanner (System.in);
         System.out.println("ENter the Marks");
         int Mark= sc.nextInt();
         if(Mark>=90)
         {
           System.out.println("A+");	 
         }
         else if(Mark>=80)
         {
        	 System.out.println("A");
         }else if(Mark>=60) {
        	 System.out.println("B");
         }else if(Mark>40) {
        	 System.out.println("c");
         }else {
        	 System.out.println("Fail");
         }
   


	}

}
