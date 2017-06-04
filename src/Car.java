
public class Car extends VehicleAbstract {
    private int speed;
	private String color;
    private String Carname;
    private String engine;
    
  
	public Car(){
    	System.out.print("A new super car has been bought.");
    }
	public Car(String color, String Carname, String engine){
		this.color = color;
		this.engine = engine;
		this.Carname = Carname;
		System.out.println("The "+ color+ " "+ Carname+ " which has "+ engine+ " engine is starting with a roar.");
	}
	public void setSpeed(int speed){
		this.speed = speed;
	}
	public int getspeed(){
		return speed;
	}
	public void setCarname(String name){
		this.Carname = name;	
	}
	public String getCarname(){
		return Carname;
	}
	public void setcolor(String color){
		this.color = color;
	}
	public String getcolor(){
		return color;
	}
	public void setengine( String engine){
		this.engine = engine;
	}
	public String getengine(){
		return engine;
	}
	@Override
	public String accelerate(){
		this.speed = 400;
		return("The "+ color+ " "+ Carname+ " which has a "+ engine+ " engine is accelerating at the speed of "+ speed+" kph.");
	}

	public String sound(){
    return "The "+ color+ " "+ Carname+ " is making a lot of sound.";
	}
	public String brake(){
	this.speed = 50;
	return ("The "+ color + " "+ Carname+" is slowing down and is travelling at the speed of+ speed" + speed +" kph." );
		
	}
	public String overtakes( String car){
	this.speed = 200;
	return "The "+ Carname +" overtakes "+ car+ ".";
		
	}
	@Override
	public String stop(){
	this.speed = 0;
	return "The "+ color + "  "+ Carname+" has stopped.";
}
	
}
   
 