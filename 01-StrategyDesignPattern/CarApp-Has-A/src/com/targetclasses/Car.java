package com.targetclasses;

import com.dependentclasses.*;
import java.util.*;

public class Car {
	Engine en = new Engine();
	public void drive() {
		int status = en.start();
		if(status==1) {
			System.out.println("Journey Started");
		} else {
			System.out.println("Problem in Engine");
		}
	}
}
