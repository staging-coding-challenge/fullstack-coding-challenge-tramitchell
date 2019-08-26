package com.revature.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.models.GroceryList;
import com.revature.repositories.GroceryListRepo;

@Service
public class GroceryListService {

	private GroceryListRepo groceryListRepo;
	
	@Autowired
	public GroceryListService(GroceryListRepo groceryListRepo) {
		this.groceryListRepo = groceryListRepo;
	}
	
	public void save(GroceryList newGroceryList) {
		this.groceryListRepo.save(newGroceryList);
	}
	
	public void deleteById(Integer id) {
		this.groceryListRepo.deleteById(id);
	}
	
}
