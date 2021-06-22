import java.util.Scanner;

public class Sortwomoving {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr_size=0;int i,j,height_array_size,temp;
		
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter Array Size b/w (5-15)");
		
		arr_size=input.nextInt();
		
		int inarray[]=new int [arr_size];
		int height_array[]=new int [arr_size];
		
		//Reading array

		for(i=0,j=0;i<arr_size;i++)
		{
			inarray[i]=input.nextInt();
			
			if(inarray[i]!=-1) //extract height only array
			{
				height_array[j]=inarray[i];
				j++;
			}

		}
		
	
		height_array_size=j;
		
		//Sorting Height only array
		
		for(i=0;i<height_array_size;i++)
		{
			for(j=0;j<height_array_size-1-i;j++)
			{
				if(height_array[j]>height_array[j+1])
				{
					temp=height_array[j];
					height_array[j]=height_array[j+1];
					height_array[j+1]=temp;
				}
			}
		}
		
		//combining height only sorted array with input array
		
		for(i=0,j=0;i<arr_size;i++)
		{
			
			if(inarray[i]==-1) //Skip if value is -1
			{
				
			}
			else
			{
				inarray[i]=height_array[j];
				j++;
			}
 		}
		
		for(i=0,j=0;i<arr_size;i++)
		{
			System.out.println(inarray[i]);
		}
	}
}

	



