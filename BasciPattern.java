package Patterns;

public class BasciPattern {
	
	/*
	    * * * 
        * * * 
        * * * 
	 * public static void print(int row, int column) { for(int i=1;i<=row;i++) {
	 * for(int j=1;j<=column;j++) {
	 * //System.out.println("i="+i+" "+i+"<="+row+"-->true");
	 * System.out.print("* "); }
	 * //System.out.println("j="+j+" "+j+"<="+column+"-->true"); System.out.println(
	 * ); } }
	 */
  // -------------------------------------------------------------------------------------------------------->	
	
		/* 			1 1 1 
					2 2 2 
					3 3 3 
	
	 * public static void print(int row, int column) { for(int i=1;i<=row;i++) {
	 * for(int j=1;j<=column;j++) {
	 * 
	 * System.out.print(i+" "); }
	 * 
	 * System.out.println( ); } }
	 */
  // ---------------------------------------------------------------------------------------------------->
	
	/*			1 2 3 4 
				1 2 3 4 
				1 2 3 4
	public static void print(int row, int column)
	{
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=column;j++)
			{
				
				System.out.print(j+" ");
			}
			
			System.out.println( );
		}
	}
	
	*/
	
// --------------------------------------------------------------------------------------------------------->
	
	/*     1 2 3 4 
		   5 6 7 8 
           9 10 11 12 
           13 14 15 16 
	*/
	public static void print(int row, int column)
	{
		int x = 1;
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=column;j++)
			{
				
				System.out.print(x+" ");
				x++;
			}
			
			System.out.println( );
		}
	}
	public static void main(String[] args) {
		print(4,4);

	}

}
