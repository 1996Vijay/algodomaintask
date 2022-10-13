package com.algodomain.algodomaintask1.service;

import com.algodomain.algodomaintask1.dto.ProductChargesDetails;
import com.algodomain.algodomaintask1.dto.ProductDetailsDto;

public interface ProductService  {


	ProductChargesDetails getData(int id);

	ProductDetailsDto add(ProductDetailsDto dto);

	ProductDetailsDto update(ProductDetailsDto dto);

	void deleteData(int id);


	
}
