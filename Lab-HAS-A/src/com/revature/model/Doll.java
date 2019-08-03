package com.revature.model;

public class Doll extends Toy {
	String eyeColor;
	
	Outfit outfit = new Outfit();
	
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
		this.outfit.wear();
		System.out.println("Hi everyone! I AM-A doll");
		this.play();
	}
}
