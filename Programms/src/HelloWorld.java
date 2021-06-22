

 
public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int[] arr= {10,20,2,5};
		 int temp=0;
		 
		 for(int i=0;i<=arr.length;i++)
		 {
			 for(int j=0;j<arr.length-i-1;j++)
			 {
				 if(arr[j]<arr[j+1])
				 {
					 temp=arr[j];
					 arr[j]=arr[j+1];
					 arr[j+1]=temp;
				 }
			 }
		 }
		 
		 

}
}
