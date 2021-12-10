package com.example.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.lang.Nullable;

@Entity
@Table(name="deals")
public class Deals {
	@Id
	Long id;
	
	@ManyToOne
	@JoinColumn(name = "itemid", referencedColumnName = "id")
	Item item;
	
	@Column
	@Nullable
	LocalDateTime expTime;
	
	@Column
	Long price;
	
	@Column
	Long numberOfItems;
}
