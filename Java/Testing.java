import java.util.Scanner;


class AllFunctions
{
	
	 
  boolean isPal(String s)
   {
	   
	   int i=0,j=0;
	 //  s.toLowerCase();  does not work 
	   s=s.toLowerCase();
	   
	   String s1="";
	   
	   for(i=0;i<s.length();++i)
	    {
		  if(((s.charAt(i)<48) || s.charAt(i)>57) && ((s.charAt(i)<65) || s.charAt(i)>90) && ((s.charAt(i)<97) || s.charAt(i)>122))
			  continue;
		  else
			  s1+=s.charAt(i);
		  	
		}
		
		System.out.println("Input string: " + s);
		System.out.println("Raw string: " + s1);
		
		boolean flag=true;
		char ch;
		String nstr="";
		//printing reverse
		for (i=0; i<s1.length(); i++)
         {
        ch= s1.charAt(i); //extracts each character
        nstr= ch+nstr; //adds each character in front of the existing string
         }
		 
		 
      System.out.println("Reversed word: "+ nstr);
    
		
		for(i=0,j=s1.length()-1; i<j; ++i,--j)
		 {
			 if(s1.charAt(i)!=s1.charAt(j))
			  {
				  flag=false;
				  return flag;
			  }
			 
		 }
		 
		 return flag;
   }  
   
   
   
   
   
 }  //end of class


class Testing
  {
		
	public static void main(String args[])
	 {
				
	    Scanner sc = new Scanner(System.in);
		System.out.println("\n//////////////////////////////////////////////////////////////////////////////\n\n");
		
		AllFunctions obj = new AllFunctions();
		
		
		
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////		
		
		
		
		String str= "A man, a plan, a canal: Panama";
		System.out.println(obj.isPal(str));
		
		
		
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////		
		System.out.println("");
			 
		 	
			 
	 }
  }