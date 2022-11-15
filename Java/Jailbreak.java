import java.util.Scanner;
class Jailbreak
  {
		
	public static void main(String args[])
	 {
				
	    Scanner sc = new Scanner(System.in);
		 
		int wall_height=0, jump_height=0, slip_height=0;
        int jump_counter=0;
		int height_covered=0;
		
        System.out.print("\n\nJailbreak problem\n\nEnter the height of the big wall: ");
        wall_height = sc.nextInt();
		System.out.print("\nEnter the jump height: ");
        jump_height = sc.nextInt();
		System.out.print("\nEnter the slipping height: ");
        slip_height = sc.nextInt();
		System.out.println("\n");
		
       
        while(true)
		 {
			height_covered+=jump_height;
            jump_counter++;
          
		    if(height_covered>=wall_height)
              break;
		  
		    height_covered-=slip_height;
		  	 
		 }			
			 
		System.out.println("\n\n Wall height: " + wall_height + "\nJump height: "+ jump_height + "\nSlipping height: " + slip_height + 
	    " \nNumber of jumps required: " + jump_counter);	 
		 	
			 
	 }
  }