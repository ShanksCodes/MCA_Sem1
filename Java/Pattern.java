import java.util.Scanner;

public class Pattern
 {
   public static void main(String args[])
   {
	   
	   Scanner sc = new Scanner(System.in);
	   
	   int n= 5;
	   char exitchoice='y';
	 do{  
	   int i=0,j=0,k=0,q=1,l=0;
	   System.out.println("\n\n*******************************************************************\n\n");
	   System.out.println("1.Press 1 for pattern 1(half pyramid-a");
	   System.out.println("2.Press 2 for pattern 2(half pyramid-b)");
	   System.out.println("3.Press 3 for pattern 3(number pyramid)");
	   System.out.println("4.Press 4 for pattern 4(pyramid)");
	   System.out.println("5.Press 5 for pattern 5(diamond)");
	   System.out.println("6.Press 6 for pattern 6(number diamond)");
	   System.out.println("7.Press 7 for pattern 7(double dorrito)");
	   
	   int choice= sc.nextInt();
	   

	   System.out.println("\n");
	   
					 
	   
	   switch(choice)
	    {
	      case 1: 
		          
				  System.out.print("\nEnter the number of rows for the pattern: ");
	              n= sc.nextInt();
				  System.out.println("\n");
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
		          System.out.print("\nEnter the number of rows for the pattern: ");
	              n= sc.nextInt();
				  System.out.println("\n");
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
		          
				  System.out.print("\nEnter the number of rows for the pattern: ");
	              n= sc.nextInt();
				  System.out.println("\n");
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
				  System.out.print("\nEnter the number of rows for the pattern: ");
	              n= sc.nextInt();	
                  System.out.println("\n"); 				  
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
				  
				  				  		  
		  case 5: 
				  System.out.print("\nEnter the number of rows for the pattern: ");
	              n= sc.nextInt();	
                  System.out.println("\n");					  
				  n = (n+1)/2;
				  
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
				   
				   q= (2*n-1)-2;
				   
				  for(i=1;i<=(n-1);++i)
				   {
					   
					  for(j=1;j<=(2*n-1);++j)
					   {
						   
						  if(j==(i+1))
						   {
							   for(k=1;k<=q;++k)
							    {
									
									System.out.print("* ");
									++j;
								}
								q-=2;
						   }    		
                         System.out.print("  ");
 					   
					   }	

                     System.out.println();					   
				   }   
		          break;
		
		
		
   		  case 6: 
				 System.out.print("\nEnter the number of rows for the pattern: ");
	             n= sc.nextInt();	          
				 System.out.println("\n");	
				 n = (n+1)/2;
				 
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
		          
				  
				  q= (2*n-1)-2;
				  l=1;
				  for(i=1;i<=(n-1);++i)
				   {
					   
					  for(j=1;j<=(2*n-1);++j)
					   {
						   
						  if(j==(i+1))
						   {
							   for(k=1;k<=q;++k)
							    {
									
									System.out.print(l + " ");
									++j;
									
									if(j>=(n+1))
									  --l;
								    else
									  ++l;
								}
								q-=2;
								l=1;
						   }    		
                         System.out.print("  ");
 					   
					   }	

                     System.out.println();					   
				   }   
		
		   case 7:
				  System.out.print("\nEnter the number of rows for single dorrito: ");
	              n= sc.nextInt();   
                  System.out.println("\n");				  
				  
				  for(i=1;i<=n;++i)
				   {
					   
					  for(j=1;j<=(2*n-1);++j)
					   {
						   
						 if(j<=(n))
						  {
							 if(j>=i)
                               System.out.print("* ");
                             else
                               System.out.print("  ");								 
							  
						  }		

                        else
                         System.out.print("  ");							
					   }	
                     System.out.println();					   
				   }
				   
				   
				  for(i=1;i<=n;++i)
				   {
					   
					  for(j=1;j<=(2*n-1);++j)
					   {
						   
						 if(j>=(n))
						  {
							 if((i+j)<=2*n)
                               System.out.print("* ");
                             else
                               System.out.print("  ");								 
							  
						  }		

                        else
                         System.out.print("  ");							
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