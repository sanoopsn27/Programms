import java.util.Scanner;

public class Obstacles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr_size=0;int i,j,height_array_size,large=0;
		
		Scanner input =new Scanner(System.in);
		
		System.out.println("Enter length of array");
		
		arr_size=input.nextInt();
		
		int inarr[]=new int[arr_size];
		
		System.out.println("Enter array Elements");

		for(i=0;i<arr_size;i++)
		{
			inarr[i]=input.nextInt();
			
			if(inarr[i]>large)
			{
				large=inarr[i]; //finding largest obstacle 
				
			}
		}
		
		//checking all possible length b/w 2 and largest  obstacle
		
		for(i=0,j=2;i<arr_size;i++)
		{
			//reset the loop if obstacle encountered
			if(inarr[i]%j==0)
			{
				j++;
				i=-1;
			}
		
		}
		
 		System.out.println(j);
 		
		
	}

}
