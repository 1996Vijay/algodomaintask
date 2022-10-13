package com.algodomain.algodomaintask1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.algodomain.algodomaintask1.dto.ChargesDto;
import com.algodomain.algodomaintask1.service.ChargesService;

@RestController
public class ChargesController {
	@Autowired
	ChargesService service;

	@PostMapping("/store")
	public ResponseEntity<?> add(@RequestBody ChargesDto dto) {
		try {
			service.store(dto);
			return new ResponseEntity<>("data inserted successfully", HttpStatus.ACCEPTED);
		} catch (Exception e) {
			return new ResponseEntity<>("data not inserted ", HttpStatus.BAD_REQUEST);
		}
	}

	@PutMapping("/updateCharges")
	public ResponseEntity<?> update(@RequestBody ChargesDto dto) {
		try {
			service.update(dto);
			return new ResponseEntity<>("data updated successfully", HttpStatus.ACCEPTED);
		} catch (Exception e) {
			return new ResponseEntity<>("data not updated", HttpStatus.BAD_GATEWAY);
		}
	}
	
}
