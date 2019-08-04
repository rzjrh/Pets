package com.RezaAk.meritamerica.pets.web.models;


//this class is an extension of the animal class
public class Cat extends Animal {

	public Cat(String name, String breed, double weight) {
		super(name, breed, weight);
	}
	
	
	public String showAffection() {
		return this.name+" Hey looked at you.";
	}
}