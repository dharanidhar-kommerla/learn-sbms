package in.komdha.beans;

public class Car {
	private IEngine eng;
	
	public Car() {
		System.out.println("Car :: default Constructor");
	}
	
	public Car(IEngine eng) {
		this.eng = eng;
	}
	
	public void setEng(IEngine eng) {
		this.eng = eng;
	}
	
	public void drive() {
		try {
			boolean status = eng.start();
			if(status) {
				System.out.println("Engine Started. Journey Begins");
			} else {
				System.out.println("No Fuel in the car");
			}
		}catch (NullPointerException n) {
			System.out.println("Problem in the Engine");
			System.out.println(n.getStackTrace());
		}
	}
	
}
