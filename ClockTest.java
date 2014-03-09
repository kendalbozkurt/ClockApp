
import java.util.Scanner;


public class ClockTest {
    public static void main(String args[])
    {
    	boolean control=false;
    	int condition=0;
        Scanner input=new Scanner(System.in);//Instantiate Scanner class
        Clock c1=new Clock();//Create a new Clock object

        c1.setName("Local Time Zone");//Set name
        c1.displayTime();
        try{
        System.out.print("\n"+"Enter local hour: ");
        c1.setHours(input.nextInt());//Get hours from user
        System.out.print("Enter local minute: ");
        c1.setMinutes(input.nextInt());//Get minutes from user
        System.out.print("Enter local second: ");
        c1.setSeconds(input.nextInt());//Get seconds from user
        
        }
        catch(Exception e){
        	System.out.println("************************************************");
			System.err.println("Incorrect entry, Please login from the beginning");
			System.out.println("************************************************");
			main(args);
        }
        c1.displayTime();
      
       

			System.out.print("\n"+"Which city would you like to see the time?");
	        System.out.print("\n"+"1.Roma(Italy)");
	        System.out.print("\n"+"2.Baku(Azerbaijan)");
	        System.out.print("\n"+"3.London(England)");
	        System.out.print("\n"+"4.Paris(France)");
	        System.out.print("\n"+"Make your choice:");
	        try{
	        condition=input.nextInt();
	        
			}catch(Exception e){
				System.out.println("************************************************");
				System.err.println("Incorrect entry, Please login from the beginning");
				System.out.println("************************************************");
				main(args);
			}
		
		if(condition==1){
				Clock c2=new Clock(c1);//Instantiate a new Clock object using another constructor
        
       			 c2.incrementHours(-1);//Increment hours by 2
        		c2.setName("\n"+"Roma Time Zone");
        		c2.displayTime();
			}
		else if(condition==2){
				Clock c3=new Clock(c1);//Instantiate a new Clock object using another constructor
        
	        c3.incrementHours(2);//Increment hours by 2
	        c3.setName("\n"+"Baku Time Zone");
	        c3.displayTime();
			}
		else if(condition==3){
			Clock c4=new Clock(c1);//Instantiate a new Clock object using another constructor
	        c4.incrementHours(-2);//Increment hours by 2
	        c4.setName("\n"+"Paris Time Zone");
	        c4.displayTime();
			}
		else if(condition==4){
				Clock c5=new Clock(c1);//Instantiate a new Clock object using another constructor
		        
		        c5.incrementHours(-1);//Increment hours by 2
		        c5.setName("\n"+"Europe Time Zone");
		        c5.displayTime();
			}
		

	
		
        
    }    
}
