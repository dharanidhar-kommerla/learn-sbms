package com.targetclasses;

import com.dependentclasses.IEngine;

public class CarApp {
	private IEngine eng;
	
	// constructor Injection -- executed only once
	public CarApp(IEngine eng){
		this.eng = eng;
	}
	
	// setter Injection -- executed whenever it is called.
	public void setEng(IEngine eng) {
		this.eng = eng;
	}
	
	public void drive() {
		try {
			boolean status = eng.start();
			if(status) {
				System.out.println("Journey Started");
			} else {
				System.out.println("Unable to start the Engine");
			}
		} catch(NullPointerException e) {
			System.out.println("Variables are not initialized properly");
		}
	}
}
