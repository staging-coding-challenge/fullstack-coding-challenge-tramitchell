package com.revature.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.revature.models.Item;

@Repository
public interface ItemRepo extends PagingAndSortingRepository<Item, Integer> {

}
