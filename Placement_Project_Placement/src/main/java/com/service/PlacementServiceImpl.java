package com.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.Placement;
import com.repository.PlacementRepository;

@Service
public class PlacementServiceImpl implements PlacementService{
	@Autowired
	private PlacementRepository pr;
	@Override
	public Placement savePlacement(Placement placement) {
		// TODO Auto-generated method stub
		return pr.save(placement);
	}

	@Override
	public List<Placement> fetchPlacementList() {
		// TODO Auto-generated method stub
		return pr.findAll();
	}

	@Override
	public Placement fetchPlacementById(Long id) {
		// TODO Auto-generated method stub
		return pr.findById(id).get();
	}

	@Override
	public void deletePlacementById(Long id) {
		// TODO Auto-generated method stub
		pr.deleteById(id);
	}

	@Override
	public Placement updatePlacement(Long id, Placement placement) {
		// TODO Auto-generated method stub
		Placement p=pr.findById(id).get();
		if(Objects.nonNull(placement.getName())&&!"".equalsIgnoreCase(placement.getName())) {
			p.setName(placement.getName());
		}
		if(Objects.nonNull(placement.getQualification())&&!"".equalsIgnoreCase(placement.getQualification())) {
			p.setQualification(placement.getQualification());
		}
		if(Objects.nonNull(placement.getYear())&&placement.getYear()!=0) {
			p.setYear(placement.getYear());
		}
		return pr.save(p);
	}

}
