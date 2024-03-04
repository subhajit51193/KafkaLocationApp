package com.deliveryboy.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.deliveryboy.service.KafkaService;

/**
 * 
 * @author SubhajitSaha
 * 
 * Controller class for producing topics
 *
 */
@RestController
@RequestMapping("/location")
public class LocationController {

	@Autowired
	private KafkaService kafkaService;
	
	/**
	 * 
	 * @return: ResponseEntity<?> -> In this case string
	 * 
	 * randomly generates coordinates each time for testing purpose
	 * and calls update location method to produce location for
	 * consumer to consume. 
	 * 
	 * Loop till 20 is just for testing purpose
	 */
	@PostMapping("/update")
	public ResponseEntity<?> updateLocation(){
		
		for (int i=1;i<=20;i++) {
			kafkaService.updateLocation("("+Math.round(Math.random()*100)+" , "+ Math.round(Math.random()*100)+" "+")");
			
		}
		return new ResponseEntity<>(Map.of("messahe","locationUpdated"),HttpStatus.OK);
		
	}
}
