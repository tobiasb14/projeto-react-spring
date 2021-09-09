package com.devsuperior.dsvendas.dto;

import java.time.LocalDate;

import com.devsuperior.dsvendas.entities.Sale;

public class SaleDto {

	private long id;
	private int visited;
	private int deals;
	private LocalDate date;
	private SellerDto seller;
	
	public SaleDto(Sale sale) {
		id = sale.getId();
		visited = sale.getVisited();
		deals = sale.getDeals();
		date = sale.getDate();
		seller = new SellerDto(sale.getSeller());
	}

	public long getId() {
		return id;
	}

	public int getVisited() {
		return visited;
	}

	public int getDeals() {
		return deals;
	}

	public LocalDate getDate() {
		return date;
	}

	public SellerDto getSeller() {
		return seller;
	}
	
}
