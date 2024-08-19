package com.zonix.musicrankerapp.configuration;

import com.zonix.musicrankerapp.configuration.condition.JpaCondition;
import jakarta.annotation.PostConstruct;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Conditional(JpaCondition.class)
@Configuration
public class JpaConfiguration {

    @PostConstruct
    void init() {

    }
}
