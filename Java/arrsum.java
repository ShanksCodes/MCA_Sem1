

class Arrsum
 {
    public static void main(String args[])
      {

          int arr[] = {2,7,11,15};
          int target=9;
          int flag=0,ind1=0,ind2=0; 
 
          

        // System.out.println(arr.length);

         for(int i=0; i<arr.length-1; ++i)
           { System.out.println("ho\n");
             for(int j=i+1; i<arr.length;++j)
                {       System.out.println("yo\n");
                   if(arr[i]+arr[j]==target)
                     {
                       ind1 = i; ind2=j;
                       flag =1;
                       break;
                     }
                }

               if(flag==1)
                break;
           }

       if(flag==1)
    
           System.out.println("Target possible\nIndices are: " + ind1 + " and "+ ind2);
               
         
      else
          System.out.println("Target not possible from the given array");  

 


  }

}




