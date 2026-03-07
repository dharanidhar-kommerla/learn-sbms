package com.main;

import com.dependentclasses.DisealEngine;
import com.dependentclasses.PetrolEngine;
import com.targetclasses.CarApp;

public class TestMain {

	public static void main(String[] args) {
		// create a object for target class
		// no default constructor present in the Car class. pass the object
		// constructor Injection
		CarApp c1 = new CarApp(new DisealEngine());
		c1.drive();
		
		// setter Injection
		CarApp c2 = new CarApp(new PetrolEngine());
		c2.setEng(new PetrolEngine());
		c2.drive();
		
	}

}
