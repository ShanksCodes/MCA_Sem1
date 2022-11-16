import java.util.Scanner;

class ArrayConc
  {
		
	public static void main(String args[])
	 {
				
	    Scanner sc = new Scanner(System.in);
		 
	     int arr_size=0;
		 int arr[]= new int[10];
		 int sum=0;
		 int exp=1;
				 
		 System.out.println("\n*********************************************************************************************\n");
		 System.out.println("Enter number of elements in array: ");
		 arr_size= sc.nextInt();
		 System.out.println("\nEnter array: ");
		 
		 for(int i=0;i<arr_size;++i)
			 arr[i]=sc.nextInt();
		 
		
		 
		 
		 for(int i=arr_size-1;i>=0;--i)
		  {
			  sum+=(arr[i]*exp);
			  exp*=10;
			
		  }
		  sum+=1;
		  
		  System.out.println("Output: " + sum);
		 	 
		 
			 
		 	
			 
	 }
  }