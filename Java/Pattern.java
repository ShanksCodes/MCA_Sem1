import java.util.Scanner;

public class Pattern
 {
   public static void main(String args[])
   {
	   
	   Scanner sc = new Scanner(System.in);
	   
	   int n= 5;
	   char exitchoice='y';
	 do{  
	   int i=0,j=0,k=0,q=1;
	   System.out.println("\n\n*******************************************************************\n\n");
	   System.out.println("1.Press 1 for pattern 1");
	   System.out.println("1.Press 2 for pattern 2");
	   System.out.println("1.Press 3 for pattern 3");
	   System.out.println("1.Press 4 for pattern 4");
	   
	   int choice= sc.nextInt();
	   
	   System.out.print("\n\nEnter the number of rows for the pattern: ");
	   n= sc.nextInt();
	   
					 
	   
	   switch(choice)
	    {
	      case 1: 
		          k=1;
				  for (i=1;i<=n;i++)
				   {
					 for(j=1;j<=n;++j)
					  {
						if((i+j)>=(n+1))
                          System.out.print(k++ + " ");	
                        else 
						  System.out.print("  ");
					  }						 
					  System.out.println();
					  k=1;
				   }
		          break;
				  
	      case 2: 
		          k=n;
				  int m =n;
				  for (i=1;i<=n;i++)
				   {
					 for(j=1;j<=n;++j)
					  {
						if((i+j)>=(n+1))
                          System.out.print(k++ + " ");	
                        else 
						  System.out.print("  ");
					  }						 
					  System.out.println();
					  --m;
					  k=m;
				   }
		          break;
		  
		  case 3: 
		          
				  for(i=1;i<=n;++i)
				   {
					   for(j=1;j<=(2*n-1);++j)
					    {
							if((i+j)==(n+1))
							 {
								 for(k=1;k<=(2*i-1);++k)
								  {
									  System.out.print(q+" ");
									   if(k>=i)
										   --q;
									   else
										   ++q;
									   ++j;
								  }
								  q=1;
							 }
							else System.out.print("  "); 
						}
						
						System.out.println();
				   }
		          break;
				  
				  		  
		  case 4: 
		          
				  for(i=1;i<=n;++i)
				   {
					   for(j=1;j<=(2*n-1);++j)
					    {
							if((i+j)==(n+1))
							 {
								 for(k=1;k<=(2*i-1);++k)
								  {
									  System.out.print("* ");
									  
									   ++j;
								  }
								 
							 }
							else System.out.print("  "); 
						}
						
						System.out.println();
				   }
		          break;
		
		  default: System.out.println("\nInvalid entry!");
	    }
		
	System.out.println("\nDo you want to continue?(y/n)?: ");
	exitchoice= sc.next().charAt(0);
	
	   
	   
   }while(exitchoice=='y' || exitchoice=='Y');
 }
 }