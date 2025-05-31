package com.mind.service;

import com.mind.dto.AttechamentDTO;

public interface AttechamentServiceInt {

	public long add(AttechamentDTO dto);

	public void update(AttechamentDTO dto);

	public void delete(long pk);

	public AttechamentDTO findbyid(long pk);
}
