package com.chetan.feign.api.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.chetan.feign.model.Bill;

@FeignClient(url  = "http://localhost:8080/bill/",name = "BillCient")
public interface BillClient {

//	private static final String BILL_SERVICE_URI = "http://localhost:8080/bill/";
	
	@GetMapping(value = "/read")
	public Bill readBill();
	
//	default void get()
//	{
//		
//	}
}
