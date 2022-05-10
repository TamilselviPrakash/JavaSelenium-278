package constructors;

public class ConstructorsOne 
{
	ConstructorsOne()
	{
		int a=10;
		int b=20;
		System.out.println(a+b);
	}
	ConstructorsOne(int a, int b){
		System.out.println(a+b);
	}
	public static void main(String[] args) 
	{
		ConstructorsOne C= new ConstructorsOne();
		ConstructorsOne C1=new ConstructorsOne(2,20);

	}

}
