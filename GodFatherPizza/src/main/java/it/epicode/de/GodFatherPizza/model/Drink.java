package it.epicode.de.GodFatherPizza.model;


public class Drink implements FoodItem {

	private String name;
	private Double price;
	private Double calories;
	
	public Drink(String string, double d, double e) {
		
	}

	public String getMenuItemLine() {
		return this.name + " - calories: " + calories + " - price: " + price;	
	}

	@Override
	public String getName() {
		
		return null;
	}

	@Override
	public Double getPrice() {
		
		return null;
	}

	@Override
	public Double getCalories() {
		
		return null;
	}
	
}
