package com.revature.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.revature.models.Item;
import com.revature.models.ItemDTO;
import com.revature.services.ItemService;

@RestController
@RequestMapping("/grocery-lists")
public class ItemController {
	
	private ItemService itemService;
	
	@Autowired 
	public ItemController(ItemService itemService) {
		this.itemService = itemService;
	}
	
	@PostMapping(value="/{id}/items", consumes=MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(HttpStatus.CREATED)
	public void saveItem(@RequestBody ItemDTO newItem, @PathVariable Integer id) {
		this.itemService.save(new Item(id, newItem.getName(), newItem.getCategory() ) );
	}
	
	@DeleteMapping("/{id}/items/{itemId}")
	public void deleteItem(@PathVariable Integer id, @PathVariable Integer itemId) {
		this.itemService.delete(id, itemId);
	}
	
	
	

}
