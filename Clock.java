
public class Clock {

	private int Hours=0;
	private int Minutes=0;
	private int Seconds=0;
	private String name;
	public Clock(int x,int y,int z){
		this.Hours=x;
		this.Minutes=y;
		this.Seconds=z;
	}
	public Clock() {
		super();
		
	}
    public Clock(Clock a) {
    	Hours=a.getHours();
    	Minutes=a.getMinutes();
    	Seconds=a.getSeconds();
    	
	}
    
	public int getSeconds() {
		return Seconds;
	}
	public void setSeconds(int seconds) {
		Seconds+= seconds;
	}
	public int getMinutes() {
		if(Minutes>60){
			Hours+=(Minutes/60);
			return (Minutes%60);
		}
		else if(Minutes<0)
		{
			System.out.println("Please check your writing!");
			System.exit(0);
			return (0);
		}
		return Minutes;
	}
	public void setMinutes(int minutes) {
		Minutes += minutes;
	}
	public int getHours() {
		if(Hours<0){
			return(Hours+=24);
		}
		else if(Hours==24){
			return (Hours=0);
		}
		else
		return Hours;
	}
	public void setHours(int hours) {
		Hours+=hours;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
		
	}
	void displayTime(){
		System.out.print(getName());
		System.out.print(" "+getHours()+":");
		System.out.print(getMinutes()+":");
		System.out.print(getSeconds());
	}
	
	void incrementHours(int hours){
		Hours+=hours;
	}
	void incrementSeconds(int seconds){
		if((Seconds+seconds)>60){
			Minutes+=(seconds/60);
			Seconds+=(seconds%60);
		}
		else
		Seconds+=seconds;
		
	}
	void incrementMinutes(int minute){
		if((Minutes+minute)>60){
			Hours+=(minute/60);
			Minutes+=(minute%60);
		}
		else
		Minutes+=minute;
		
	}

}
