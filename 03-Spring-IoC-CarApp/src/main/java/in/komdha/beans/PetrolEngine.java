package in.komdha.beans;

public class PetrolEngine implements IEngine{

	public PetrolEngine() {
		System.out.println("Petrol Engine :: Constructor");
	}
	
	public boolean start() {
		System.out.println("Petrol Engine Starting...");
		return true;
	}

}
