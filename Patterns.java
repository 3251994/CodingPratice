package Patterns;

import java.util.Scanner;

public class Patterns {
	
	/*
	    
	   * 
	   * * 
	   * * * 
	   * * * *                      

	
	public static void print(int row, int column)
	{
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println( );
		}
	}
	*/
// ----------------------------------------------------------------------------------------->
	
	
	public static void print(int row, int column)
	{	
		for(int i=1;i<=row;i++)
		{

			for(int j=1;j<=column;j++)
			{
				/*
				if(i==j)
					*    
					  *     
					    *    
					      *  
		         */
				
				/*
				 
				 if(i+j == row+1)
					 
					      * 
					    *   
					  *     
					*       

				 */
				
				/*
				if(i==row || j==1)
				if(j==1 || i==row)
					*       
					*       
					*       
					* * * * 
				*/
				
				/*
				if(i==1 || j==column)
				
					* * * * 
	      		    * 
			        * 
			        * 
		        */
			
				/*
				if(j==1 || i==row || i==1 || j== column)
					* * * * 
					*     * 
					*     * 
					* * * * 
					
			    */
				
				/*
				if(i==1 || j==column || i+j == row+1)
				    * * * * 
					    * * 
					  *   * 
					*     * 
					
				*/
				
				/*
				if(j==1 || i==row || i==j)
					*       
					* *     
					*   *   
					* * * * 
					
			    */
				
				/*
				if(j==1 || i==1|| i+j == row+1)
					* * * * 
					*   *   
					* *     
					*       
				
				*/
				
				/*
				if(j==1 || i+j <= row+1 || i==1 )
					* * * * 
					* * *   
					* *     
					*       
				*/
				
				/*
				if(i==j || i+j == row+1)
					*     * 
					  * *   
					  * *   
					*     * 
				
				*/
				
				/*
				if(i==j || i+j == row+1|| j==1 || i==1 )
				
					* * * * 
					* * *   
					* * *   
					*     * 
				
				*/
				
				
				/*	
				if(i==j || i+j == row+1|| j==1 || i==1 || i==1 || i==row || j==column)	
					* * * * 
					* * * * 
					* * * * 
					* * * * 
					
				*/
				
				/*
				if(i<=j)
					
					* * * * 
					  * * * 
					    * * 
					      * 
				*/
				
				/*
				if(i+j >= row+1)
				        * 
				      * * 
				    * * * 
				  * * * *
				
				*/
				
				/*
				if(row+1 >= i+j)
					* * * * 
					* * *   
					* *     
					*       
				*/
				
				
				if(j<=i)
				/*
					*       
					* *     
					* * *   
					* * * * 
				*/	
				
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
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
