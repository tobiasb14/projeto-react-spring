package com.devsuperior.dsvendas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dsvendas.dto.SaleDto;
import com.devsuperior.dsvendas.dto.SaleSucessDto;
import com.devsuperior.dsvendas.dto.SaleSumDto;
import com.devsuperior.dsvendas.service.SaleService;
import com.devsuperior.dsvendas.service.SellerService;

@RestController
@RequestMapping("/sales")
public class SaleController {

	@Autowired
	private SaleService saleService;
	
	@Autowired
	private SellerService sellerService;
	
	@GetMapping
	public ResponseEntity<Page<SaleDto>> findAll(Pageable pageable) {
		sellerService.findAll();
		Page<SaleDto> page = saleService.findAll(pageable);
		return ResponseEntity.ok(page);	
	}
	
	@GetMapping("/sum-seller")
	public ResponseEntity<List<SaleSumDto>> amountGroupedBySeller() {
		List<SaleSumDto> list = saleService.amountGroupedBySeller();
		return ResponseEntity.ok(list);
	}
	
	@GetMapping("/sucess-seller")
	public ResponseEntity<List<SaleSucessDto>> sucessGroupedBySeller() {
		List<SaleSucessDto> list = saleService.sucessGroupedBySeller();
		return ResponseEntity.ok(list);
	}
}
