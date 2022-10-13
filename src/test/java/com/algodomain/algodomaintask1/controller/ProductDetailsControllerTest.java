package com.algodomain.algodomaintask1.controller;

import static org.mockito.Mockito.when;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import com.algodomain.algodomaintask1.dto.ProductChargesDetails;
import com.algodomain.algodomaintask1.dto.ProductDetailsDto;
import com.algodomain.algodomaintask1.service.ProductService;

@ActiveProfiles("local")
@ExtendWith(SpringExtension.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class ProductDetailsControllerTest {
	@MockBean
	ProductService service;
	@Autowired
	ProductDetailsController controller;

	@Test
	void read() throws Exception {
		ProductChargesDetails chargesDetails = new ProductChargesDetails();
		chargesDetails.setProductId(1001);
		when(service.getData(1001)).thenReturn(chargesDetails);
		ResponseEntity<?> read = controller.read(1001);
		Assertions.assertEquals(read.getStatusCode(), HttpStatus.ACCEPTED);
	}

	@Test
	void add() throws Exception {
		ProductDetailsDto detailsDto = new ProductDetailsDto();

		detailsDto.setProductId(1001);
		ProductChargesDetails chargesDetails = new ProductChargesDetails();
		chargesDetails.setProductId(1001);
		when(service.getData(1001)).thenReturn(chargesDetails);
		ResponseEntity<?> add = controller.add(detailsDto);
		Assertions.assertEquals(add.getStatusCode(), HttpStatus.ACCEPTED);
	}

	@Test
	void update() throws Exception {
		ProductDetailsDto detailsDto = new ProductDetailsDto();

		detailsDto.setProductId(1001);
		ProductChargesDetails chargesDetails = new ProductChargesDetails();
		chargesDetails.setProductId(1001);
		when(service.getData(1001)).thenReturn(chargesDetails);
		ResponseEntity<?> update = controller.update(detailsDto);
		Assertions.assertEquals(update.getStatusCode(), HttpStatus.ACCEPTED);
	}

	@Test
	void delete() throws Exception {
		ResponseEntity<?> deleteData = controller.deleteData(1001);
		Assertions.assertEquals(deleteData.getStatusCode(), HttpStatus.ACCEPTED);
	}
}
