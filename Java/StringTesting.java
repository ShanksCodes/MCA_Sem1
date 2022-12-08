import java.util.Scanner;
class StringTesting
  {
		
	public static void main(String args[])
	 {
				
	    Scanner sc = new Scanner(System.in);
		 
		int nums[]= {1,2,2};
		 String str="";
		 
		 
        for(int i=0;i<nums.length;++i)
          {
              str+= nums[i];

          }
		  int intval= Integer.parseInt(str);
		  intval++;
		  System.out.println(intval);
		  
		         System.out.println(123+ Integer.toString(Integer.parseInt(str)+1));      

		  
		  str= Integer.toString(intval);
		  
		  		  System.out.println(intval);

		  
		/*  int num2[]= new int[3];
		  System.out.println(str);
		
		
          for(int i=0;i<nums.length;++i)
		  {
			  num2[i]= str.charAt(i) - '0';
		  }
        
         for(int i=0;i<num2.length;++i)
			 System.out.println(num2[i]);*/
		 
         	  
			 
		 	
			 
	 }
  }