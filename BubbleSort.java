package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
	public static int[] sort(int[] num)
	{
		for(int i=0;i<=num.length-1;i++)
		{
			for(int j=0;j<=num.length-1;j++)
			{
				if(j+1<=num.length-1 && num[j]>num[j+1])
				{
					int temp = num[j];
					num[j]=num[j+1];
					num[j+1]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(num));
		return num;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size: ");
		int size = sc.nextInt();
		int[] num = new int[size];
		System.out.println("Enter the int elements: ");
		for(int i=0; i<=size-1;i++)
		{
			num[i]=sc.nextInt();
		}
		sort(num);

	}

}
