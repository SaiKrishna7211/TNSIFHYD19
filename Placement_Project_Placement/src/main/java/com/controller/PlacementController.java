package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.entity.Placement;
import com.service.PlacementService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PutMapping;




@RestController
public class PlacementController {
	@Autowired
	private PlacementService ps;
	
	@PostMapping("/placement")
	public Placement savePlacement(@RequestBody Placement placement) {
		//TODO: process POST request
		return ps.savePlacement(placement);
	}
	@GetMapping("/placement")
	public List<Placement> fetchPlamentList() {
		return ps.fetchPlacementList();
	}
	@GetMapping("/placement/{id}")
	public Placement fetchPlacementByid(@PathVariable("id") Long id) {
		return ps.fetchPlacementById(id);
	}
	@DeleteMapping("/placement/{id}")
	public String deletePlacementById(@PathVariable("id") Long id) {
		ps.deletePlacementById(id);
		return "Placement Deleted...!";
	}
	@PutMapping("placement/{}")
	public Placement updatePlacement(@PathVariable("id") Long id, @RequestBody Placement placement) {
		//TODO: process PUT request
		
		return ps.updatePlacement(id,placement);
	}
}
