package com.Jenkins.demo.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;



@Controller
@RequestMapping
public class JenkinsController {
 private Logger log= LogManager.getLogger(JenkinsController.class);
 
 
 @GetMapping(path="/getData")
 public @ResponseBody ResponseEntity<Object> getData(@RequestBody String body){
	 
	 try {
		 
		return new ResponseEntity<>("",HttpStatus.OK);
	} catch (Exception e) {
		return new ResponseEntity<>(e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
	}
	 
 }
}
