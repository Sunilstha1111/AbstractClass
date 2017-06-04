
public class VehicleApp {
	public static void main (String[] args){
		
		String car = "Lamborghini Veneno";
		String car1 = "Bugati Veyron";
		String Plane = "Boeing 787 Dreamliner";
		String color1 = "silver";
		String color2 = "red";
		String engine_1 = " 6.5 L V 12"; 
		String engine_2 = "EB 16.4";
		String engine_3 = "Rolls-Royce Trent 1000";
		
		

		Car a = new Car(color1, car,engine_1);
		Car b = new Car(color2, car1, engine_2);
		plane p = new plane(engine_3, Plane);
		Boat c = new Boat();
		
		print (a.accelerate());
		print (a.sound());
		print(a.brake());
		print (a.overtakes(car1));
		print(a.stop());
		
		print (b.accelerate());
		print (b.sound());
		print(b.brake());
		print (b.overtakes(car));
		print(b.stop());
		
		print(p.start());
		print(p.accelerate());
		print(p.altitude());
		print(p.descending());
		print(p.stop());
		
		print(c.sail());
	}
		public static void print(String s){
			System.out.println(s);
		}
		
	
		
		
		
		
	

}
