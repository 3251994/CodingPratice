package coding;

public class PrimeSumNNums {
	
	public static int check(int n)
	{
		int i,sum=0;
	    for(i=0;i<=n;i++)
	    {
	        if(n%i==0)
	        {
	            sum=sum+i;
	        }
	    }
	    return sum;
	}

	public static void main(String[] args) {
		System.out.println(check(10));
	}

}
