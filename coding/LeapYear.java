package coding;

public class LeapYear {
	public static String check(int year)
	{
		//if(year%100==0 && year%400==0 || year%100!=0 && year%4==0)
	    if(year%400==0 || year%100!=0 && year%4==0)
		{
			return "leapYear";
		}
		return "notLeapYear";
	}
	public static void main(String [] args)
	{
		System.out.println(check(1233));
		System.out.println(check(2096));
		System.out.println(check(2097));
		System.out.println(check(1612));
		System.out.println(check(2099));
	}
}
