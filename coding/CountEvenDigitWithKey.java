package whileloop;

public class CountEvenDigitWithKey {
		
		public static int printEvenDigitCountKey(int num, int key)
		{
			int count = 0;
			while(num>0)
			{
				int reminder = num%10;
				if(reminder==key)
				{
					count++;
				}
				//System.out.println(num+"-->"+reminder+"-->"+num);
				num=num/10;
			}
			//System.out.println(num+"-->"+copy);
			return count;
		}

	public static void main(String[] args) {
		System.out.println(printEvenDigitCountKey(1232654,2));

	}

}
