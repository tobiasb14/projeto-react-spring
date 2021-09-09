package com.devsuperior.dsvendas.dto;

import com.devsuperior.dsvendas.entities.Seller;

public class SaleSucessDto {
	
	private String sellerName;
	private long visited;
	private long deals;
	
	public SaleSucessDto(Seller seller, long visited, long deals) {
		this.sellerName = seller.getName();
		this.visited = visited;
		this.deals = deals;
	}
	
	public String getSellerName() {
		return sellerName;
	}
	public long getVisited() {
		return visited;
	}
	public long getDeals() {
		return deals;
	}

}
