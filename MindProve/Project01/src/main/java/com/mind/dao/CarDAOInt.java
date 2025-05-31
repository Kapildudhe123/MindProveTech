package com.mind.dao;

import java.util.List;

import com.mind.dto.CarDTO;


public interface CarDAOInt {

	public long add(CarDTO dto);
	
	public void update(CarDTO dto);
	
	public void delete(CarDTO dto);
	
	public CarDTO findbyPk(long pk);
	
	public List search(CarDTO dto, int pageNo,int pageSize);
}
