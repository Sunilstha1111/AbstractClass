
public class plane extends VehicleAbstract {
    private String engine1;
    private String Planename;
	private int altitude; 
	private int speed;
	public plane(){
    	System.out.println("The Boeing 787 jetliner is bought.");
    }
	public plane (String engine1, String Planename){
		this.engine1 = engine1;
		this.Planename = Planename;
		System.out.println("The "+ Planename+ " which has a "+ engine1+ " engine is ready to soar into the sky.");
	}
    public void setengine1(String engine1){
    	this.engine1 = engine1;
    	
    }
    public String getengine1(){
    return engine1;
    }
    public void setPlanename(String Planename){
    this.Planename = Planename;
    }
    public String getPlanename(){
    	return Planename;
    }
    public void setaltitude(int altitude){
         this.altitude = altitude;	
    }
    
    @Override
    public String start(){
    	return "The "+ Planename+ " is starting.";
    }
    @Override
    public String accelerate(){
    	this.speed = 1200;
    	return "The "+ Planename+ " is accelerating at the speed of  "+ speed + " kph.";
    }
    public String altitude(){
    	this.altitude = 60000;
    	return "The "+ Planename+ " is cruising at an altitude of "+ altitude + " ft.";
    }
    public String descending(){
    	this.altitude = 30000;
    	this.speed = 600;
    	return "The "+ Planename+ " is descending at a speed of " + speed + " kph and is currently cruising at an altitude of "+ altitude+" ft.";
    	
    }
    public String stop(){
    	this.speed = 0;
    	return "The "+ Planename+ " has landed and is preparing for its next flight.";
    }
}
    
