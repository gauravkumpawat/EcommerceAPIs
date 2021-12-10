package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Deals;
import com.example.service.DealService;

@Controller
@ResponseBody
public class DealController {

	@Autowired
	DealService service;
//	@GetMapping("/get")
//	public String get() {
//		return "TESTTT";
//	}
	
	@PostMapping(path="/create")
	public void createDeal(Deals deal) {
		// TODO Auto-generated method stub
		
	}

	@PostMapping(path="/update", consumes = "application/json", produces = "application/json")
	public ResponseEntity<String> updateDeal(@RequestBody Deals deal) {
		// TODO Auto-generated method stub
		return ResponseEntity.ok().body("DONE");
		
		
	}
	
	@PostMapping(path = "/claim")
	public String claimDeal(String name) {
		// TODO Auto-generated method stub
		return "";
	}
	
	@GetMapping(path="/getAll")
	public List<Deals> getAll() {
		return service.getAll();
	}

}
