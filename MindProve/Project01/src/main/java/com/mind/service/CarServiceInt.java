package com.mind.service;

import java.util.List;

import com.mind.dto.CarDTO;

public interface CarServiceInt {

public long add(CarDTO dto);
	
	public void update(CarDTO dto);
	
	public void delete(long pk);
	
	public CarDTO findbyid(long pk);
	
	public List search(CarDTO dto, int pageNo,int pageSize);
}
