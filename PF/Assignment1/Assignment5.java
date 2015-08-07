import java.util.Scanner;
/*program for checking the type of sorting----accending,decending,or not sorted 
*/

public class Assignment5
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int noOfElements,i;
		
		int result;
	
		System.out.println("enterno.of elements");
		Scanner sc= new Scanner(System.in);

		noOfElements=sc.nextInt();
		int insertArray[]=new int[noOfElements];
		System.out.println("enter nos");
                                 for(i=0;i<noOfElements;i++)
                                {
                                   insertArray[i]=sc.nextInt();
                                }
                result=checkSort(insertArray);

                System.out.println(""+result);
	

         }
         /*Function process---checking from starting that where it is in accending or decending,if till end they are 
         in same order then returning there expected value otherwise reporting as unsorted array.  
         */
	public static int checkSort(int[] arr){
		int len=arr.length,count=0,count1=0;
		for(int i=0;i<len-1;i++)
		{
			if(arr[i]<arr[i+1])
			{
				count=count+1;
			}
			else
				break;
			
		}
		for(int i=0;i<len-1;i++)
		
		{
			if(arr[i]>arr[i+1])
			{
			    count1=count1+1;
			}
			else
				break;
			
		}
	
		if(count==len-1)
		{
			return 1;
		}
		if(count1==len-1)
		{
			return 2;
		}
		else
			return 0;
	}
}
