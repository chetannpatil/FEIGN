package com.chetan.feign.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chetan.feign.FeignApplication;
import com.chetan.feign.api.client.BillClient;
import com.chetan.feign.model.Bill;

@RestController
@RequestMapping(value = "/feign")
public class FeignController {

//	private static final String BILL_SERVICE_URI = "http://localhost:8080/bill/";
	
	private static Logger LOGGER = LogManager.getLogger(FeignApplication.class);
	
	@Autowired
	private BillClient billclient;
	
	
	@GetMapping(value = "/getFeignBill")
	public Bill getBill()
	{
		LOGGER.info("\n\n FeignController - getBill with feign client - billclient = \n\n"+billclient);
		
		return billclient.readBill();
	}
}
