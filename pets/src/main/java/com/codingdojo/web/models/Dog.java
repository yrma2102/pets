package com.codingdojo.web.models;

public class Dog extends Animal implements Pet{

	public Dog(String name, String breed, int weight) {
		super(name,breed,weight);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String showAffection() {
		String message;
		if(this.getWeight() >= 30) {
			message = getName() +" curled up next to you!";
		}else {
			message = getName() +" hopped into your lap and cuddled you!";
		}
		return message;
	}

}
