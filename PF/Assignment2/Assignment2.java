import java.util.*;

/* 
program based on modularity in which we divide the whole process in modules and then calling them when required
------Program to print a pattern
*/


public class Assignment2 {

	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println("enter size");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		String[] result;
	 result=printWholePyramid(size);
		for(int i=0;i<size;i++)
		{
		System.out.println(result[i]);
		}

	}
	
/*

Spaces function return a string of spaces as per requirement

here row is perameter storing the row no in which we have to add space and n is the value of the max valued of row

*/	
	
	
	public static String spaces(int row, int n) 
	{

		String sr = "";
		int temp = n - row;
		for (int i = 0; i < temp; i++) 
		{
			sr = sr + " ";

		}

		return sr;
	}
/*      
         Function to return a no. string
	 * @param row---the row no in which we are adding the no string like"1234"
	 * @param n----total no of rows
	 * @return----returning the no string
*/
	public static String numbers(int row,int n) 
	{
		  
		  String num="";
		  for(int i=1;i<=row;i++) 
		  {
		  num=num+i;
		  }
		   return num;
         }
/*      
         Function to return the pattern
	 
	 * @param n----total no of rows
	 * @return----returning the string
	 
	 It calls the function "spaces " and "numbers" in it and ten concat them both and then returning the values
	 
*/

	 public static String[] printWholePyramid(int n) 
	 { 
	      String []finalOutput=new String[n+1]; 
	      int i=0;
	     
	      for(int j=n;j>=0;j--) 
	      {
	    	  
	    	  String str=spaces(j,n);
	    	  String str1=numbers(j,n);
	    	  finalOutput[i]=str+str1; 
	    	  i=i+1;
	      } 
	      return finalOutput;
	  }
}
