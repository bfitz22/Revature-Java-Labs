package com.revature.model;

public class Doll extends Toy {
	String eyeColor;
	
	public Doll() {
		this.eyeColor = "brown";
		this.name = "Buddy";
	}
	
	public Doll(String name, String eyeColor) {
		super(name);
		this.eyeColor = eyeColor;
	}
	
	public String getEyeColor() {
		return this.eyeColor;
	}
	
	public void setEyeColor(String eyeColor) {
		this.eyeColor = eyeColor;
	}
	
	public void makeTalk() {
		System.out.println("Hi everyone! I AM-A doll");
	}
}
