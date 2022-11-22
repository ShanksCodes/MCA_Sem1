import java.util.Scanner;
class JavaTripletSum
  {
		
	public static void main(String args[])
	 {
				
	    Scanner sc = new Scanner(System.in);
		 
	     int arr_size=0;
		 int arr[]= new int[10];
		 int flag=0;
		 int pos1=0,pos2=0,pos3=0;
		 int target_val=0;
		 int l=0,r=0;
		 
		 System.out.println("\n*********************************************************************************************\n");
		 System.out.println("Enter number of elements in array: ");
		 arr_size= sc.nextInt();
		 System.out.println("\nEnter sorted array: ");
		 
		 for(int i=0;i<arr_size;++i)
			 arr[i]=sc.nextInt();
		 
		 System.out.println("\nEnter target value for triplet sum: ");
		 target_val = sc.nextInt();
		 
		 
		 for(int i=0;i<(arr_size-2);++i)
		  {
			  
              l=(i+1);
              r= (arr_size-1);
              while(l<r)
			   {
				   if(arr[i]+arr[l]+arr[r]==target_val)
				    {
						pos1=i;pos2=l;pos3=r;
						flag=1;
						break;
					}
					
					else if(arr[i]+arr[l]+arr[r]<target_val)
						l++;
					
					else
						r--;
					
				   
			   }		

             if(flag==1) break;			   
			  
		  }
		  
		  if(flag==1)
			  System.out.println("\nOutput: " + pos1 + ", " +pos2 + ", " +pos3);
		 
		 else
           System.out.println("\nNo possible triplet found with sum equal to " + target_val + "\n");		 
		 
			 
		 	
			 
	 }
  }