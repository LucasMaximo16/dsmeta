package com.devsuperior.dsmeta.service;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.devsuperior.dsmeta.Entities.Sale;
import com.devsuperior.dsmeta.repository.SaleRepository;
@Service
public class SaleService {
	
	@Autowired
	private SaleRepository repository;
	
	public Page<Sale> findSales(String minDate, String maxDate,Pageable pageble) {
		
		LocalDate today = LocalDate.ofInstant(Instant.now(),ZoneId.systemDefault());
		
		LocalDate min = minDate.equals("") ? today.minusDays(365) : LocalDate.parse(minDate);
		LocalDate max = minDate.equals("") ? today : LocalDate.parse(minDate);;
		
		return repository.findSales(min, max,  pageble);
	}
}
