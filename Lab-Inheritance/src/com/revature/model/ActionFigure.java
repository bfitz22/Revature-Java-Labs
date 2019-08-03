package com.revature.model;

public class ActionFigure extends Doll {
	private String skill;
	
	public ActionFigure() {
		this.name = "Batman";
		this.eyeColor = "blue";
		this.skill = "throw baterang";
	}
	
	public ActionFigure(String name, String eyeColor, String skill) {
		this.name = name;
		this.setEyeColor(eyeColor);
		this.setSkill(skill);
	}
	
	public void setSkill(String skill) {
		this.skill = skill;
	}
	
	public String getSkill() {
		return this.skill;
	}
	
	public void useSkill() {
		System.out.println("Ka Pow! I'm using my skill, " + this.skill);
	}
}
