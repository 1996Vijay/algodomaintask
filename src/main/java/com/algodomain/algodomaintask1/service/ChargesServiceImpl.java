package com.algodomain.algodomaintask1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.algodomain.algodomaintask1.dao.ChargesDao;
import com.algodomain.algodomaintask1.dto.ChargesDto;

@Service
public class ChargesServiceImpl implements ChargesService {
	@Autowired
	ChargesDao dao;

	@Override
	public ChargesDto store(ChargesDto dto) {
		return dao.save(dto);

	}

	@Override
	public ChargesDto update(ChargesDto dto) {
		return dao.save(dto);
	}
}
