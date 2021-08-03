package it.epicode.de.GodFatherPizza.model;

import java.util.ArrayList;
import java.util.List;

public class Menu {

	private final List<Pizza> menuPizza = new ArrayList<>();
	private final List<Drink> menuDrink = new ArrayList<>();
	private final List<Franchise> menuFranchise = new ArrayList<>();
	private final List<PizzaTopping> menuTopping = new ArrayList<>();
	
	public List<Pizza> getMenuPizza() {
		return menuPizza;
	}

	public List<Drink> getMenuDrink() {
		return menuDrink;
	}

	public List<Franchise> getMenuFranchise() {
		return menuFranchise;
	}

	public List<PizzaTopping> getMenuTopping() {
		return menuTopping;
	}
	
	
}

