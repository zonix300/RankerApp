package com.zonix.musicrankerapp.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:application.yaml")
@ComponentScan(basePackages = "com.zonix.musicrankerapp")
public class ApplicationConfiguration {

}
