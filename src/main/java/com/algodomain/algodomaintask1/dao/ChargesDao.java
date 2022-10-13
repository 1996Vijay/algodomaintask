package com.algodomain.algodomaintask1.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.algodomain.algodomaintask1.dto.ChargesDto;

@Repository
public interface ChargesDao extends JpaRepository<ChargesDto, String  >{


}
