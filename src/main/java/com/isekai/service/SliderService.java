package com.isekai.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.isekai.models.Slider;
import com.isekai.repos.SliderRepository;

@Service
@Transactional
public class SliderService {
	@Autowired
	SliderRepository repo;
	
	public List<Slider> listAll(){
		return (List<Slider>) repo.findAll();
	}
	
	public Slider get(int id) {
		Optional<Slider> result = repo.findById(id);
		return result.get();
	}
	public void save(Slider slider) {
		repo.save(slider);
	}
	
	public void delete(int id) {
		repo.deleteById(id);
	}
}
