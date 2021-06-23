import java.util.Scanner;

public class astroid_collision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr_size=0;int i,j,result_top;
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter count");
		
		arr_size=input.nextInt();
		
		int astr[]=new int[arr_size];
		
		int result[]=new int[arr_size];
				
		System.out.println("Enter values");
		
		for(i=0;i<arr_size;i++)
		{
			astr[i]=input.nextInt();
			
		}
		
		for(i=0,j=-1;i<arr_size;i++)
		{
				
			//add astroid to result if positive or first value
			 if((j== -1) || astr[i]>0)
			 {		
				 j++;
				 result[j]=astr[i];
 			 }
			 else //if astroid is negative
			 {
				 while(true) 
				 {
					 
					 result_top=result[j];//get top of result array
					 
					 if(result_top < 0) 
					 {
						 j++;
						 result[j]=astr[i]; //if top is negative add to result array
 						 break;
					 }
					 else
					 { 
						 if (result_top == -astr[i])
						 {
							 j--; //if top is equal to -(astroid) both destroyed
 							 break;			 
						 }
						 else if(result_top > - astr[i])
						 {
 							 break; //if top is greater than -(astroid)
						 }
						 else
						 {
							 j--;//if  -(astroid) is greater destroy top
 
							 if(j== -1) //if all elements collided last element is largest
							 	{
								 	j++;
								 	result[j]=astr[i];
								 	break;
							 	}
						 }
					 }
				 
				 
			 }
			 				 
			 }
			
		}
		for(i=0;i<=j;i++)
		{
			
			System.out.print(result[i]+ " ");
		}
		

		

	}

}
