package com.mind.dao;

import com.mind.dto.AttechamentDTO;

public interface AttechamentDAOInt {

	public long add(AttechamentDTO dto);

	public void update(AttechamentDTO dto);

	public void delete(AttechamentDTO dto);

	public AttechamentDTO findbyPk(long pk);

}
