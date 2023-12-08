package whileloop;

public class CountEvenDigits {
	
	public static int printEvenDigitCount(int num)
	{
		int count = 0;
		//int copy =num;
		while(num>0)
		{
			int reminder = num%10;
			if(reminder%2==0)
			{
				count++;
			}
			//System.out.println(num+"-->"+reminder+"-->"+num);
			num=num/10;
		}
		//System.out.println(num+"-->"+copy);
		return count;
	}

	public static void main(String[] args) {
		
		System.out.println(printEvenDigitCount(1234567890));
	}

}
