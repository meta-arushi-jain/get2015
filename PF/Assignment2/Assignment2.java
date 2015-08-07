import java.util.*;


public class Assignment2 {

	
	public static void main(String[] args) {
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
	public static String spaces(int row, int n) {

		String sr = "";
		int temp = n - row;
		for (int i = 0; i < temp; i++) {
			sr = sr + " ";

		}

		return sr;
	}
	 /**
	 * @param row
	 * @param n
	 * @return
	 */
	public static String numbers(int row,int n) {
		  
		  String num="";
		  for(int i=1;i<=row;i++) {
		  num=num+i;
		  }
		   return num;
		  }

	  public static String[] printWholePyramid(int n) { 
	      String []finalOutput=new String[n+1]; 
	      int i=0;
	     
	      for(int j=n;j>=0;j--) {
	    	  
	    	  String str=spaces(j,n);
	    	  String str1=numbers(j,n);
	    	  finalOutput[i]=str+str1; 
	    	  i=i+1;
	    	  } 
	      return finalOutput;
	  }
}
