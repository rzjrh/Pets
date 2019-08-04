package com.RezaAk.meritamerica.pets.web.models;

//this class is an extenstion of the animal class
public class Dog extends Animal {

	public Dog(String name, String breed, double weight) {
		super(name, breed, weight);
	}
	
	
	public String showAffection() {
		if(this.weight<30) {
			return this.name+" hopped into your lap and cuddled you.";
		} else {
			return this.name+" curled up next to you";
		}
	}
}