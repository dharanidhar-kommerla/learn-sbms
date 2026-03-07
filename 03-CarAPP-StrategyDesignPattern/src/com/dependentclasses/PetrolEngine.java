package com.dependentclasses;

public class PetrolEngine implements IEngine{
	public PetrolEngine(){
		System.out.println("Petrol Engine::constructor");
	}
	
	public boolean start() {
		System.out.println("Petrol Engine Starting...");
		return true;
	}
}
