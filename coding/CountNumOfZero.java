package whileloop;

public class CountNumOfZero {
	public static int countZeroDigit(int num)
		{
			int count = 0;
			while(num>0)
			{
				if(num%10==0)
				{
					count++;
				}
				num=num/10;
			}
			return count;
		}


	public static void main(String[] args) {
		System.out.println(countZeroDigit(1010101010));

	}

}
