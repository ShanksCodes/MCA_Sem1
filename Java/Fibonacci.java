import java.util.Scanner;
class Fibonacci
  {
		
	public static void main(String args[])
	 {
				
	    Scanner sc = new Scanner(System.in);
		 
		int a=1,b=1;
        int sum=0;
        System.out.println("\n\nFibonacci Series\n\nEnter the number of values in the sequence");
        int k = sc.nextInt();
        System.out.print(a+", "+b);
        for(int i=1;i<=(k-2);++i)
		 {
			sum=(a+b);
            System.out.print(", "+sum);
            b=a;
            a=sum;			
			 
		 }			
			 
		 	
			 
	 }
  }