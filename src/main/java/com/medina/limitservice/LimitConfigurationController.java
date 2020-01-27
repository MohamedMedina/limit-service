package com.medina.limitservice;

import org.omg.CORBA.PRIVATE_MEMBER;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.medina.limitservice.bean.LimitConfigurationService;

@RestController
public class LimitConfigurationController 
{
	@Autowired
   private Configuratiion configuratiion;
	


	@GetMapping("/limits")
public LimitConfigurationService  retrieveAllConfiguration() 

{
		
return new LimitConfigurationService(configuratiion.getMaximum(), configuratiion.getMinimum())	;
}
}
