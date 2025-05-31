package com.mind.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.mind.dto.AttechamentDTO;
import com.mind.dto.CarDTO;

@Repository
public class AttechamentDAOImpl implements AttechamentDAOInt {

	@PersistenceContext
	EntityManager entitymanager;

	@Override
	public long add(AttechamentDTO dto) {
		entitymanager.persist(dto);
		return dto.getId();
	}

	@Override
	public void update(AttechamentDTO dto) {
		entitymanager.merge(dto);

	}

	@Override
	public void delete(AttechamentDTO dto) {
		entitymanager.remove(dto);

	}

	@Override
	public AttechamentDTO findbyPk(long pk) {
		AttechamentDTO dto = entitymanager.find(AttechamentDTO.class, pk);
		return dto;
	}

}
