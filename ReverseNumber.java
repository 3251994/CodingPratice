package whileloop;

import java.util.Scanner;

public class ReverseNumber {
	public static int reverse(int num)
	{
		int result = 0;
		while(num>0)
		{
			int reminder=num%10;
			result = result*10+reminder;
			num=num/10;
		}
		return result;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			System.out.println("Enter int number: ");
			int n = sc.nextInt();
			System.out.println(reverse(n));
			//sc.close();
		}
	}

}
