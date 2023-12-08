package whileloop;

public class NumOfDigits {
	
	public static int countDigit(int num)
	{
		int count = 0;
		while(num>0)
		{
			count++;
			num=num/10;
		}
		return count;
	}

	public static void main(String[] args) {
		System.out.println(countDigit(1236484156));
	}

}
