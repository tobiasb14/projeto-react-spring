package com.devsuperior.dsvendas.dto;

import com.devsuperior.dsvendas.entities.Seller;

public class SellerDto {

	private Long id;
	private String name;
	
	public SellerDto(Seller seller) {
		id = seller.getId();
		name = seller.getName();
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	 
}
