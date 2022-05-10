package decisionStatement;

import java.util.Scanner;

public class IfElseIfScanner {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Time");
        double Time = sc.nextFloat();
        if(Time<=12.00) {
        	System.out.println("good morning");
        }else if (Time <=18) {
        	System.out.println("good noon");
        }else {
        	System.out.println("good evening");
        }
	}

}
