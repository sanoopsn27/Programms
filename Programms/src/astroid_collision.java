import java.util.Scanner;

public class astroid_collision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr_size=0;int i,j,height_array_size,large=0;
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter count");
		
		arr_size=input.nextInt();
		
		int inarr[]=new int[arr_size];
		int outarr[]=new int[arr_size];
		
		System.out.println("Enter values");
		
		for(i=0;i<arr_size;i++)
		{
			inarr[i]=input.nextInt();
			
		}
		
		for(i=0;i<arr_size;i++)
		{
			System.out.println(inarr[i]);
		}
		
		for(i=0,j=arr_size;i<arr_size;i++)
		{
		
			if( inarr[i] < inarr[j]  )
			{
				outarr[i]=Math.abs(inarr[j]);
			}
			
		}

		

	}

}
