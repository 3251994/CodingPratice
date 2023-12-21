package Arrays;

import java.util.Scanner;

public class LeftRotateNTimes {
	public static int[] rotateN(int[] num, int n)
	{
		for(int x=1;x<=n;x++)
		{
			int first = num[0];
			for(int i=0; i<=num.length-1; i++)
			{
				if(i+1<=num.length-1)
				{
					num[i]= num[i+1];
				}
			}
			num[num.length-1] = first;
		}
		print(num);
		return num;
	}
	public static void print(int[] num)
	{
		for(int i=0;i<=num.length-1;i++)
		{
			System.out.println(num[i]+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size: ");
		int size = sc.nextInt();
		int [] num = new int[size];
		System.out.println("Enter integer numbers: ");
		for(int i=0; i<=size-1; i++)
		{
			num[i] = sc.nextInt();
		}
		System.out.println("enter no.of rotation: ");
		int n = sc.nextInt();
		rotateN(num,n);
		sc.close();
	}

}
