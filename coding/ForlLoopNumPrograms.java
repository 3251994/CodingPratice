package coding;

public class ForlLoopNumPrograms {
	
	public static int add(int n) //Sum  of n numbers
	{
		int sum =0;
		for(int i =1;i<=n;i++)
		{
			sum=sum+i;
		}
		return sum;
	}
	
	public static int printProduct(int n) //product of n numbers
	{
		int product =1;
		for (int i=1;i<=n;i++)
		{
			product =product*i;
		}
		return product;
	}
	
	public static int power(int b, int p) //power of n (2^n)
	{
		int power =1;
		for(int i=1;i<=p;i++)
		{
			power=power*b;
		}
		return power;
	}
	
	public static long factorial(int n)  //factorial of a number
	{
		long fact =1;;
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		return fact;
	}
	
	public static int countDigit(int n) // counting the number of digits
	{
		int count=0;
		while(n>0)
		{
			int rem = n%10;
			count++;
			n=n/10;
		}
		return count;
	}

	public static void main(String[] args) {
		
		System.out.println(add(5));
		System.out.println(printProduct(5));
		System.out.println(factorial(5));
		System.out.println(power(2,3));
		System.out.println(countDigit(123456789));

	}

}
