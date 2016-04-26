package io.pivotal.support.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoClientFactoryBean;

/**
 * This class is copied and pasted directly from the 1.8.4.RELEASE docs
 * for Spring Data MongoDB.
 * 
 * @see http://docs.spring.io/spring-data/data-mongo/docs/1.8.4.RELEASE/reference/html/#mongo.mongo-java-config
 */
@Configuration
public class GoodAppConfig {

    /*
     * Factory bean that creates the com.mongodb.Mongo instance
     */
     public @Bean MongoClientFactoryBean mongo() {
          MongoClientFactoryBean mongo = new MongoClientFactoryBean();
          mongo.setHost("localhost");
          return mongo;
     }
}