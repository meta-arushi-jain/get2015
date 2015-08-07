import java.util.Scanner;

public class Assignment4 {

int alength,jlength;
	public static void main(String[] args) {
		int Arrival_time[],Job_size[];
		System.out.println("Enter size of the array arrival time");
		Scanner sc=new Scanner(System.in);
		int alength=sc.nextInt();
		System.out.println("Enter size of the array job size");
		
		int jlength=sc.nextInt();
		Arrival_time=new int[alength];
		System.out.println("Enter Arrival time");
		for(int i=0;i<alength;i++)
		{
			Arrival_time[i]=sc.nextInt();
		}
		Job_size=new int[jlength];
		System.out.println("Enter job sizes");
		for(int i=0;i<alength;i++)
		{
			Job_size[i]=sc.nextInt();
		}
		 Assignment4 a1=new Assignment4();
		 System.out.println(" job   job arrival   Time Job Waiting   Time Job Start   Time Job Finish Time");
		 int array3[][]=new int[jlength][];
		 array3=a1.FCFS(Arrival_time,Job_size,jlength);
		 for(int i=0;i<jlength;i++)
			 {
			 for(int j=0;j<5;j++)
				 {
				 System.out.print(array3[i][j]+"   ");
				 }
			 System.out.println();
			 }
	}
	static int[][] FCFS( int arrival_time[], int job_size[] ,int  n){
		 int i;
		 int jStartTime[]=new int[n];
		 int jWaitTime[]=new int[n];
		 int jFinishTime[]=new int[n];
		 jStartTime[0]=1;
		 jWaitTime[0]=0;
		 jFinishTime[0]=job_size[0];
		 for(i=1;i<n;i++)
		 {
			 if(arrival_time[i]<jFinishTime[i-1])
			 {
				 jStartTime[i]=jFinishTime[i-1]+1;
			 jWaitTime[i]=jStartTime[i]-arrival_time[i];
			 jFinishTime[i]=jStartTime[i]+job_size[i]-1;
			 }
			 else
			 {
				 jWaitTime[i]=0;
				 jStartTime[i]=arrival_time[i];
				 jFinishTime[i]=jStartTime[i]+job_size[i]-1;
				 
			 }
			 
		 }
		 int finalResult[][]=new int[n][5];
		 for(i=0;i<n;i++)
		 {
			 
			
			 finalResult[i][0]=i+1;
			 finalResult[i][1]=arrival_time[i];
			 finalResult[i][2]=jWaitTime[i];
			 finalResult[i][3]=jStartTime[i];
			 finalResult[i][4]=jFinishTime[i];
			 
			 
		 }
		
		 return finalResult;
	}

}