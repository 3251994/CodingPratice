package whileloop;

import java.util.Scanner;

public class PalindromeNumber {
	public static String palindromeCheck(int num)
	{
		int result = 0;
		int temp =num;
		while(num>0)
		{
			int reminder=num%10;
			result = result*10+reminder;
			num=num/10;
		}
		if(temp==result)
		{
			return "Palindrome";
		}
		 return "Not Palindrome";
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			System.out.println("Enter int number: ");
			int n = sc.nextInt();
			System.out.println(palindromeCheck(n));
			//sc.close();
		}
		
	}

}
