package com.algodomain.algodomaintask1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.algodomain.algodomaintask1.dto.ProductChargesDetails;
import com.algodomain.algodomaintask1.dto.ProductDetailsDto;
import com.algodomain.algodomaintask1.service.ProductService;

@RestController
public class ProductDetailsController {
	@Autowired
	ProductService service;

	@GetMapping("/get")
	public ResponseEntity<?> read(@RequestParam int id) {

		try {
			ProductChargesDetails dto = service.getData(id);
			return new ResponseEntity<>(dto, HttpStatus.ACCEPTED);
		} catch (Exception e) {
			return new ResponseEntity<>("Data not fetched", HttpStatus.BAD_GATEWAY);
		}
	}

	@PostMapping("/add")
	public ResponseEntity<?> add(@RequestBody ProductDetailsDto dto) {
		try {
			service.add(dto);
			return new ResponseEntity<>("data inserted successfully", HttpStatus.ACCEPTED);
		} catch (Exception e) {
			return new ResponseEntity<>("data not inserted ", HttpStatus.BAD_REQUEST);
		}
	}

	@PutMapping("/update")
	public ResponseEntity<?> update(@RequestBody ProductDetailsDto dto) {
		try {
			service.update(dto);
			return new ResponseEntity<>("data updated successfully", HttpStatus.ACCEPTED);
		} catch (Exception e) {
			return new ResponseEntity<>("data not updated", HttpStatus.BAD_GATEWAY);
		}
	}

	@DeleteMapping("/delete")
	public ResponseEntity<?> deleteData(@RequestParam int id) {
		try {
			service.deleteData(id);
			return new ResponseEntity<>("data deleted", HttpStatus.ACCEPTED);
		} catch (Exception e) {
			return new ResponseEntity<>("data not deleted", HttpStatus.BAD_REQUEST);
		}

	}

}
