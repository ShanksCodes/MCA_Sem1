import java.util.Scanner;
class DoubletSum
  {
		
	public static void main(String args[])
	 {
				
	    Scanner sc = new Scanner(System.in);
		 
	     int arr_size=0;
		 int arr[]= new int[10];
		 int flag=0;
		 int pos1=0,pos2=0;
		 int target_val=0;
		 
		 System.out.println("\n*********************************************************************************************\n");
		 System.out.println("Enter number of elements in array: ");
		 arr_size= sc.nextInt();
		 System.out.println("\nEnter array: ");
		 
		 for(int i=0;i<arr_size;++i)
			 arr[i]=sc.nextInt();
		 
		 System.out.println("\nEnter target value for doublet sum: ");
		 target_val = sc.nextInt();
		 
		 
		 for(int i=0;i<(arr_size-1);++i)
		  {
			  for(int j=i+1;j<arr_size;++j)
			   {
				   if(arr[i]+arr[j]==target_val)
				    {
						pos1=i;
						pos2=j;
						flag=1;
						break;
						
					}
				   
			   }
            if(flag==1)
             break;				
			  
		  }
		  
		  if(flag==1)
			  System.out.println("\nOutput: " + pos1 + ", " +pos2);
		 
		 else
           System.out.println("\nNo possible doublet found with sum equal to " + target_val + "\n");		 
		 
			 
		 	
			 
	 }
  }