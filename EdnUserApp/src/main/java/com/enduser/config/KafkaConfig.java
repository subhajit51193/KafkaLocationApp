package com.enduser.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

/**
 * 
 * @author SubhajitSaha
 * 
 * Configuration class for kafkaTopicConsumer
 */
@Configuration
public class KafkaConfig {

	private Logger logger = LoggerFactory.getLogger(KafkaConfig.class);
	
	/**
	 * 
	 * @param: value -> String value which it should get via kafka listener for 
	 * the same topic specified below
	 */
	@KafkaListener(topics = AppConstansts.LOCATION_UPDATE_TOPIC,groupId = AppConstansts.GROUP_ID)
	public void updatedLocation(String value) {
		
		logger.info("Location Consumed Successfully!!!"+value);
	}
}
