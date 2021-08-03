package it.epicode.de.GodFatherPizza.model;

public class PizzaBase implements Pizza{

	private  String name;
	private  Double price;
	private  Double calories;

	public PizzaBase(String string, double d, double e) {
		
	}

	public String getMenuItemLine() {
		return this.name + " - calories: " + calories + " - price: " + price;	
	}

	@Override
	public Double getCalories() {
		
		return null;
	}

	@Override
	public String getName() {
		
		return null;
	}

	@Override
	public Double getPrice() {
		
		return null;
	}
	
}
