package com.devsuperior.dsvendas.dto;

import com.devsuperior.dsvendas.entities.Seller;

public class SaleSumDto {
	
	private String sellerName;
	private double sum;
	
	public SaleSumDto(Seller seller, double sum) {
		this.sellerName = seller.getName();
		this.sum = sum;
	}
	
	public String getSellerName() {
		return sellerName;
	}
	public double getSalesSum() {
		return sum;
	}

}
