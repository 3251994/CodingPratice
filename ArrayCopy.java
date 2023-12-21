package Arrays;

public class ArrayCopy {
	public static int[] copy(int[] num)
	{
		int[] res = new int[num.length];
		for(int i=0; i<=num.length-1;i++)
		{
			res[i] = num[i];
		}
		print(res);
		return res;
	}
	public static void print(int[] num)
	{
		for(int i=0;i<=num.length-1;i++)
		{
			System.out.println(num[i]+" ");
		}
		System.out.println();
	}
	public static void main(String [] args)
	{
		int[] num = {1,2,3,4,5};
		copy(num);
	}
	

}
