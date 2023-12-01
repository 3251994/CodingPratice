package coding;

public class LagrestOf3 {
	
	public static void check(int a, int b, int c)
	{
		if(a>=b && a>=c)
		{
			System.out.println(a);
		}
		else if(b>=a && b<=c)
		{
			System.out.println(b);
		}
		else
		{
			System.out.println(c);
		}
	}

	public static void main(String[] args) {
		check(5,3,6);
		
		
		
		

	}

}
