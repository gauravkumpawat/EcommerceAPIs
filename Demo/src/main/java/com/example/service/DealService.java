package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Deals;
import com.example.repo.DealsRepo;

@Service
public class DealService {
	
	@Autowired
	DealsRepo repo;
	
	public List<Deals> getAll() {
		return (List<Deals>) repo.findAll();
	}

}
