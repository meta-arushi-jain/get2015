import java.awt.geom.Arc2D.Float;
import java.util.*;


/**
 * @author Arushi
 * 
 * prgram to print a pyramid type structure using modularity
 *
 */
public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] result;

		System.out.println("enter size of pyramid");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
	
		result=printWholePyramid(num);
		for(int i=0;i<result.length;i++)
		{System.out.println(result[i]);
	}}

	/** Function to return spaces
	 * @param row=row no in which we have to add spaces 
	 * @param n=total size of loop
	 * @return
	 */
	public static String spaces(int row, int n) {

		String sr = "";
		int temp = n - row - 1;
		for (int i = 0; i < temp; i++) {
			sr = sr + " ";

		}

		return sr;
	}
	
	
	/**Function to return string of numbers like"12321""
	 * @param row=row no in which we have to add spaces 
	 * @param n=total size of loop
	 * @return----the string containing integers
	 */
	
	
	  public static String numbers(int row,int n) {
		  
	  String num="";
	  
	  for(int i=0;i<=row;i++) 
	  {int t=i+1; num=num+t; 
	  } 
	  for(int i=row;i>0;i--) {
	  num=num+i;
	  }
	   return num;
	  }
	  
	  
	  /**
	 * Function calls functon "spaces" and "numbers" within it and then concat them
	 * @param n=total size of loop
	 * @return----array of string containing the pattern
	 */
	  
	  
	  public static String[] printWholePyramid(int n) 
	  { 
	       int t=n;
               String[] finalOutput=new String[2*n-1]; 
               
                  for(int i=0;i<n;i++) 
                  {
	            String str=spaces(i,n);
	            String str1=numbers(i,n);
	            finalOutput[i]=str+str1; 
	           }
	           
	           
                  for(int j=n-2;j>=0;j--) 
                  {
    	             String str=spaces(j,n);
    	             String str1=numbers(j,n);
    	             finalOutput[t]=str+str1; 
    	             t=t+1;
    	          }
    	          
               return finalOutput;
  }
	 

}
