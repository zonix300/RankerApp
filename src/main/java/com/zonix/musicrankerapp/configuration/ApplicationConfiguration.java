package com.zonix.musicrankerapp.configuration;

import com.zonix.musicrankerapp.database.pool.ConnectionPool;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:application.yaml")
@ComponentScan(basePackages = "com.zonix.musicrankerapp")
public class ApplicationConfiguration {

    @Bean
    public ConnectionPool pool1() {
        return new ConnectionPool("test-name", 12);
    }
}
