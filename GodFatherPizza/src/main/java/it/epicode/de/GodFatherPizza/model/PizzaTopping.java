package it.epicode.de.GodFatherPizza.model;

public class PizzaTopping implements Pizza{

	private Pizza pizza;
	private String name;
	private Double price;
	private Double calories;	
	
	public PizzaTopping(Pizza pizza2, String string, double d, double e) {
		
	}

	@Override
	public String getName() {
		return this.pizza.getName() + " + " + this.name;
	}

	@Override
	public Double getPrice() {
		return this.pizza.getPrice() + this.price;
	}

	@Override
	public Double getCalories() {
		return this.pizza.getCalories() + this.calories;
	}
	
	public String getMenuItemLine() {
		return this.name + " - calories: " + calories + " - price: " + price;	
	}
	
}
