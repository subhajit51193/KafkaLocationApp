package com.deliveryboy.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

/**
 * 
 * @author SubhajitSaha
 * 
 * Configuration class for kafkaTopicBuilder
 */
@Configuration
public class KafkaConfig {

	/**
	 * 
	 * @return: org.apache.kafka.clients.admin.NewTopic -> NewTopic
	 */
	@Bean
	public NewTopic topic() {
		
		return TopicBuilder
				.name(AppConstants.LOCATION_TOPIC_NAME)
//				.partitions(0)
//				.replicas(0)
				.build();
		
	}
}
