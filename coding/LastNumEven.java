package coding;

public class LastNumEven {
	public static String check(int num) {
		if(num%10!=0 && num%2==0) {
			return "even";
		}
		else
			return "odd";
	}
	public static void main(String [] args) {
		System.out.println(check(1));
	}
}
