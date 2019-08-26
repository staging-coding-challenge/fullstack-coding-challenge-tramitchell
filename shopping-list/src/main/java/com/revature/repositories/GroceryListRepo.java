package com.revature.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.revature.models.GroceryList;

@Repository
public interface GroceryListRepo extends PagingAndSortingRepository<GroceryList, Integer> {

}
