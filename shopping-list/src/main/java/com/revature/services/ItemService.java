package com.revature.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.models.Item;
import com.revature.repositories.ItemRepo;

@Service
public class ItemService {

	private ItemRepo itemRepo;
	
	@Autowired
	public ItemService(ItemRepo itemRepo) {
		this.itemRepo = itemRepo;
	}
	
	public void save(Item newItem) {
		
		this.itemRepo.save(newItem);
	}
	
	public void delete(Integer id, Integer itemId) {
		this.itemRepo.deleteById(itemId);
	}
}
