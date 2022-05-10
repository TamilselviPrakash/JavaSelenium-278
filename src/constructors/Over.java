package constructors;

public class Over 
{

	
		
		
	Over(int a, int b){
	System.out.println(a-b);
}

		Over(double c,double d){
System.out.println(c+d);	
}

		Over(int e,double f){
System.out.println(e-f);
}
		Over(int i,int j,int k){
System.out.println(i*j*k);	
}
		public static void main(String[] args) 
		{
		
	Over c= new Over(10,20);
	Over c1= new Over(10.5,20.7);
	Over c2=new Over(10,20.6);
	Over c3=new Over(1,4,6);
}
	}


