package com.revature.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="Item")
@SequenceGenerator(name="ItemGen", sequenceName="ItemSeq", allocationSize=1)
public class Item {
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="ItemGen")
	private Integer id;
	
//	@JoinColumn(name="GroceryList", nullable=false)
//	@ManyToOne
//	private GroceryList groceryList;
	
	@Column
	private Integer groceryListId;
	
	@Column(name="name")
	private String name;
	
	@Enumerated(EnumType.STRING)
//	@OneToMany()
	private Category category;

	public Item(Integer groceryListId, String name, Category category) {
		super();
		this.groceryListId = groceryListId;
		this.name = name;
		this.category = category;
	}

	public Item() {
		super();
	}
	
	

}
