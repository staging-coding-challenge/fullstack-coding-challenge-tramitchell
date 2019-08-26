package com.revature.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.revature.models.GroceryList;
import com.revature.services.GroceryListService;

@RestController
@RequestMapping("/grocery-lists")
public class GroceryListController {
	
	private GroceryListService groceryListService;
	
	@Autowired
	public GroceryListController(GroceryListService groceryListService) {
		this.groceryListService = groceryListService;
	}

	@GetMapping()
	public String test() {
		return "success";
	}
	
	@PostMapping(consumes=MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(HttpStatus.CREATED)
	public void addGroceryList(@RequestBody GroceryList newGroceryList) {
		this.groceryListService.save(newGroceryList);
	}
	
	@DeleteMapping("/{id}")
	public void deleteById(@RequestParam Integer id) {
		this.groceryListService.deleteById(id);
	}
	
	
}
