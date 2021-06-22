import java.util.Scanner;

public class LeastCommon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array_size,temp;
		int current_element_count;
		int least_element_count;
		int least_common_element;
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter No Of elements");
		
		array_size=input.nextInt();
		
		int my_array[]=new int[array_size];
	
		
		System.out.println("Enter elements");
		
		//Reading Array
		
		for(int i=0;i<array_size;i++)
		{
			my_array[i]=input.nextInt();
		}
		
		//Sorting the Array
		
		for(int i=0;i<array_size;i++)
		{
			for(int j=0;j<array_size-1-i;j++)
			{
				if(my_array[j]>my_array[j+1])
				{
					temp=my_array[j];
					my_array[j]=my_array[j+1];
					my_array[j+1]=temp;
							
				}
			}
		}
		
		
		current_element_count=1;//set initial count as 1
		
		least_element_count=array_size+1;//maximum possible count of an element
		
		least_common_element=my_array[0];//Assuming first element as least commmon number 
		
		for(int i=0;i<array_size-1;i++)
		{
			if(my_array[i]==my_array[i+1])
			{
				current_element_count++;	
			}
			else
			{
				if(current_element_count<least_element_count)
				{
					least_element_count=current_element_count;
					
					least_common_element=my_array[i];
				}
				
				current_element_count=1;
			}
		}
		
		
		//in case last number is the least occuring element
		
		if(current_element_count < least_element_count)
		{
			least_element_count = current_element_count;
			least_common_element = my_array[array_size-1];
		}	
		
		System.out.println("least Occuring element = " + least_common_element);
		

	}

}
