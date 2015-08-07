import java.awt.geom.Arc2D.Float;
import java.util.*;
public class Assignment1 {

	/**
	 * @Program to convert binary to octal
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int binaryNumber,octalNumber;
System.out.println("enter boolean no");
Scanner sc= new Scanner(System.in);

binaryNumber=sc.nextInt();
octalNumber=convertBinaryToOctal(binaryNumber);
System.out.println("octalno.is"+octalNumber);

	}
	static int convertBinaryToOctal(int n)
	{
		int count,temp,temp1,temp2,temp3,result=0,output=0;
		do{
			temp=n%1000;
			temp1=temp;
			count=0;
			do
			{
				count++;
				temp1=temp1/10;
			}while(temp1!=0);
			
				int octal=0;
			for(int i=0;i<count;i++)
			{
				temp2=temp%10;
				octal=octal+temp2*(int)Math.pow(2,i);
				temp=temp/10;
			}
		
			n=n/1000;
			output=output*10+octal;
		
		}while(n!=0);
		while(output!=0)
		{
			temp3=output%10;
			
			output=output/10;
			result=result*10+temp3;
		}
		return result;
		
		}
		
			
		
		
}	
	



