package coding;

public class LeapYearRange {
	
		public static void print(int s, int e)
		{
			for(int i = s; i<=e; i++)
			{
				if(i%100==0 && i%400==0 || i%100!=0 && i%4==0)
				{
					System.out.println(i+ " ");
					
				}
			}
	}
	    
	public static void main(String [] args)
	{
		print(1000,2000);
	}
}
