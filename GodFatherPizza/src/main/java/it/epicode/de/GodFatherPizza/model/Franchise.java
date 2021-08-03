package it.epicode.de.GodFatherPizza.model;


public class Franchise implements MenuItem {

	private String name;
	private Double price;
	
	public Franchise(String string, double d) {
		
	}

	public String getMenuItemLine() {
		return this.name + " - price: " + price;	
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
