package com.example.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.entity.Deals;

public interface IDealController {
	
	public void createDeal(Deals deal);
	
	public ResponseEntity<String> updateDeal(Deals deal);
	
	public String claimDeal(String name);
}
