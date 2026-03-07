package com.targetclasses;

import com.dependentclasses.*;
import java.util.*;

public class Car extends Engine{
	public void drive() {
		int status = super.start();
		if(status==1) {
			System.out.println("Journey Started");
		} else {
			System.out.println("Problem in Engine");
		}
		System.out.println("IS-A Relation. Classes are tightly coupled");
	}
}
