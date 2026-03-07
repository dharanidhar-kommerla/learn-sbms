package com.dependentclasses;

public class DisealEngine implements IEngine {

	public DisealEngine() {
		System.out.println("Diseal Engine::constructor");
	}
	
	public boolean start() {
		System.out.println("Diseal Engine starting...");
		return true;
	}

}
