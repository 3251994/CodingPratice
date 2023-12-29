package Arrays;

import java.util.*;

public class SelectionSort {
	public static int[] sort(int[] num)
	{
		for(int i=0;i<=num.length-1;i++)
		{
			for(int j=i+1;j<=num.length-1;j++)
			{
				if(num[i]>num[j])    //--> increment
				//if(num[i]<num[j])  // -->decrement
				{
					int temp = num[i];
					num[i]=num[j];
					num[j]=temp;
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
