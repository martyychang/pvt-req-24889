package io.pivotal.support.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoTemplate;

import com.mongodb.Mongo;

/**
 * This class is adapted from section 9.4.1, "Instantiating MongoTemplate".
 * 
 * @see http://docs.spring.io/spring-data/mongodb/docs/1.8.4.RELEASE/reference/html/#mongo-template.instantiating
 */
@Configuration
public class BadAppConfig {
	
	public @Bean Mongo mongo() throws Exception {
	    return new Mongo("localhost");
	}

	public @Bean MongoTemplate mongoTemplate() throws Exception {
	    return new MongoTemplate(mongo(), "mydatabase");
	}	
}
