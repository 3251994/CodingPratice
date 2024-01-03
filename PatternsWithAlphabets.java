package Patterns;

import java.util.Scanner;

public class PatternsWithAlphabets {
	
	
	/*
	 
	A B C D 
	1 2 3 4 
	E F G H 
	5 6 7 8 
	 
	
	public static void print(int row, int column)
	{
		char x = 'A';
		int y=1;
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=column;j++)
			{
				if(i%2!=0)
				{
					System.out.print(x+" ");
					x++;
				}
				else
				{
					System.out.print(y+" ");
					y++;
				}
			}
			System.out.println();
		}
	}
	*/
	
	
	/*
	 
	1 1 1 1 
	A A A A 
	2 2 2 2 
	B B B B 
	
	*/
	public static void print(int row, int column)
	{
		char x = 'A';
		int y=1;
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=column;j++)
			{
				if(i%2==0)
				{
					System.out.print(x+" ");
				}
				else
				{
					System.out.print(y+" ");
				}
			}
			if(i%2==0)
			{
				x++;
			}
			else
			{
				y++;
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no.of rows: ");
		int row = sc.nextInt();
		System.out.println("Enter no.of columns: ");
		int column = sc.nextInt();
		print(row,column);

	}

}
