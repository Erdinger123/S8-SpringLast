package it.epicode.de.GodFatherPizza.config;

import org.springframework.context.annotation.Bean;

import it.epicode.de.GodFatherPizza.model.Drink;
import it.epicode.de.GodFatherPizza.model.DrinkLemonade;
import it.epicode.de.GodFatherPizza.model.Franchise;
import it.epicode.de.GodFatherPizza.model.FranchiseMug;
import it.epicode.de.GodFatherPizza.model.Menu;
import it.epicode.de.GodFatherPizza.model.PizzaHawaiian;
import it.epicode.de.GodFatherPizza.model.PizzaMargherita;
import it.epicode.de.GodFatherPizza.model.PizzaSalami;
import it.epicode.de.GodFatherPizza.model.ToppingCheese;
import it.epicode.de.GodFatherPizza.model.ToppingHam;

public class MenuConfig {

	@Bean
	public Menu menu() {

		Menu menu = new Menu();

		menu.getMenuPizza().add(pizzaMargherita());
		menu.getMenuPizza().add(pizzaHawaiian());
		menu.getMenuPizza().add(pizzaSalami());

		menu.getMenuTopping().add(new ToppingCheese(null));
		menu.getMenuTopping().add(new ToppingHam(null));


		menu.getMenuDrink().add(drinkLemonade());
		
		

		return menu;

	}

	@Bean
	public PizzaMargherita pizzaMargherita() {
		return new PizzaMargherita();
	}

	@Bean
	public PizzaHawaiian pizzaHawaiian() {
		return new PizzaHawaiian();
	}

	@Bean
	public PizzaSalami pizzaSalami() {
		return new PizzaSalami();
	}

	@Bean
	public Drink drinkLemonade() {
		return new DrinkLemonade();
	}
	
	@Bean
	public Franchise franchiseMug() {
		return new FranchiseMug();
	}
	
	
}
