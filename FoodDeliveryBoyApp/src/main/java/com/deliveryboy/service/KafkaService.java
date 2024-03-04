package com.deliveryboy.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.deliveryboy.config.AppConstants;

/**
 * 
 * @author SubhajitSaha
 * 
 * Service class for producing topic
 *
 */
@Service
public class KafkaService {

	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;
	
	private Logger logger = LoggerFactory.getLogger(KafkaService.class);
	
	/**
	 * 
	 * @param: location -> location string with values as cordinates
	 * @return: boolean
	 */
	public boolean updateLocation(String location) {
		
		kafkaTemplate.send(AppConstants.LOCATION_TOPIC_NAME,location);
		logger.info("Location Produced Successfully!!!");
		return true;
	}
}
