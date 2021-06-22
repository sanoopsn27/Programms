import java.util.Scanner;

public class NthLarge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n,temp=0,num;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter Number of Elements");
		n=input.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter All Elements");
		for(int i=0;i< n;i++)
		{
			arr[i]=input.nextInt();
		}
		
		System.out.println("Enter smallest nummber to be printed");
		
		num=input.nextInt();
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n-1-i;j++)
			{
				if(arr[j]>arr[j+1])
				{
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		
		
		System.out.println(arr[num-1]);
		
		
		
		 
		
		
	}

}
