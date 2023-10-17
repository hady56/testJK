package com.Jenkins.demo.dataservices;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Component;


@Component
public class DataService {
	private Logger log= LogManager.getLogger(DataService.class);
	
	public String dataCreator(String request) throws Exception {
		
		log.info(request);
		if (request.equalsIgnoreCase("Are you up"))
			return "Yes";
		else if (request.equalsIgnoreCase("Are you down"))
			return "No";
		else 
			throw new Exception("This is not a valid input");
		
	}
}
