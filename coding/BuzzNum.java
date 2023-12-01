package coding;

public class BuzzNum {
	public static boolean check(int num) 
	{
		if(num%7==0 || num%10==7) 
		{
			return true;
		}
		return false;
	}
	public static void main(String[] args) 
	{
		System.out.println(check(49));	
		}
	}
