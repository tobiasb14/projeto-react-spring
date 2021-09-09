package com.devsuperior.dsvendas.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.devsuperior.dsvendas.dto.SaleDto;
import com.devsuperior.dsvendas.repository.SaleRepository;

@Service
public class SaleService {

	@Autowired
	private SaleRepository saleRepository;
	
	public Page<SaleDto> findAll(Pageable pageable) {
		return saleRepository.findAll(pageable).map(SaleDto::new);
	}
}
