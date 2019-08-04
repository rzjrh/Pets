package com.RezaAk.meritamerica.pets.web.models;

//this class is an abstract class
//we have constructor, getters and setters here
public abstract class Animal implements Pet {
	
	//member variables
	protected String name;
	protected String breed;
	protected double weight;
	
	
	//constructor
	public Animal(String name, String breed, double weight) {
		this.name = name;
		this.breed = breed;
		this.weight = weight;
	}

	
	//getters
	public String getName() {
		return name;
	}
	
	public String getBreed() {
		return breed;
	}
	
	public double getWeight() {
		return weight;
	}
	
	
	
	//setters
	public void setName(String name) {
		this.name = name;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	

	
}