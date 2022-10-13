package com.algodomain.algodomaintask1.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.algodomain.algodomaintask1.dto.ProductDetailsDto;

@Repository
public interface ProductDao extends JpaRepository<ProductDetailsDto, Integer> {




}
