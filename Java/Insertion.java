import java.util.Scanner;

class Insertion
  {
		
	public static void main(String args[])
	 {
				
	    Scanner sc = new Scanner(System.in);
		 
	     int arr_size=0;
		 int arr[]= new int[10];
		 int flag=0;
		 int missing_val=0;
				 
		 System.out.println("\n*********************************************************************************************\n");
		 System.out.println("Enter number of elements in array: ");
		 arr_size= sc.nextInt();
		 System.out.println("\nEnter the sorted array: ");
		 
		 for(int i=0;i<arr_size-1;++i)
			 arr[i]=sc.nextInt();
		 
		
		 
		 
		 for(int i=0;i<arr_size;++i)
		  {
			  for(int j=0;j<arr_size;++j)
			   {
				   if(arr[j]==i)
				    {
						
						flag=1;
						break;
						
					}
				   		
				   
			   }
			 
			   if(flag==0)
				{ 
				 missing_val=i;
				 break;
				}  
					
                 flag=0;
           			
			  
		  }
		  
		  System.out.println("Missing number: " + missing_val);
		 	 
		 
			 
		 	
			 
	 }
  }