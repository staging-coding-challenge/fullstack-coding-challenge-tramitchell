package com.revature.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
	
//	@Column(name="list", nullable=false)
////	@OneToMany()
//	private GroceryList list;
//	
//	@Column(name="name")
//	private String name;
//	
//	@Enumerated(EnumType.STRING)
////	@OneToMany()
//	private Category category;

}
