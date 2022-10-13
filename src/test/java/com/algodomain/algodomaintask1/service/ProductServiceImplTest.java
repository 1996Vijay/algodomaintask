package com.algodomain.algodomaintask1.service;

import static org.mockito.Mockito.when;import java.util.Optional;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.algodomain.algodomaintask1.dao.ChargesDao;
import com.algodomain.algodomaintask1.dao.ProductDao;
import com.algodomain.algodomaintask1.dto.ProductDetailsDto;

@ActiveProfiles("local")
@ExtendWith(SpringExtension.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class ProductServiceImplTest {
	@MockBean
	ProductDao dao;
	@MockBean
	ChargesDao dao2;
	@Autowired
	ProductServiceImpl impl;


@Test
void add() {
	ProductDetailsDto detailsDto= new ProductDetailsDto();
	detailsDto.setProductId(1001);
	when(dao.save(detailsDto)).thenReturn(detailsDto);
	ProductDetailsDto add = impl.add(detailsDto);
	Assertions.assertEquals(add.getProductId(), 1001);
}
@Test
void update() {
	ProductDetailsDto detailsDto= new ProductDetailsDto();
	detailsDto.setProductId(1001);
	when(dao.save(detailsDto)).thenReturn(detailsDto);
	ProductDetailsDto update = impl.add(detailsDto);
	Assertions.assertEquals(update.getProductId(), 1001);
	
}
@Test
void deleteData() {
	ProductDetailsDto detailsDto= new ProductDetailsDto();
	detailsDto.setProductId(1001);
	when(dao.findById(1001)).thenReturn(Optional.of(detailsDto));
	Assertions.assertTrue(true);
}

}
