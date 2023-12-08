package fibanocci;

import java.util.Scanner;

public class FibNthNumber {
	
	public static int print(int n)
	{
		if(n==1)
		{
			return 0;
		}
		int n1=0;
		int n2=1;
		int n3=1;
		for(int i=1;i<=n-2;i++)
		{
			n3=n1+n2;
			n1=n2;
			n2=n3;
		}
		return n3;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter int number:");
		int n=sc.nextInt();
		System.out.println(print(n));
		sc.close();
		
	}

}
