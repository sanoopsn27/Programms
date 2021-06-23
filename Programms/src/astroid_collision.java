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
		
			 if((result.length==0) || astr[i]>0)
			 {		
				 j++;
				 result[j]=astr[i];
			 }
			 else 
			 {
				 while(true)
				 {
					 result_top=result[j];
					 
					 if(result_top < 0)
					 {
						 j++;
						 result[j]=astr[i];
						 break;
					 }
					 else if (result_top==-astr[i])
					 {
						j--;
						break;
							 
					 }
					 else if(result_top> - astr[i])
					{
						break; 
					}
					 else
					 {
						 j--;
						 
						 if(j==0)
						 {
							 j++;
							 result[j]=astr[i];
							 break;
						 }
					 }
				 
				 
			 }
			 
				 
			 }
			
		}
		
		for(i=0;i<=j;i++)
		{
			System.out.println(result[i]);
		}
		

		

	}

}
