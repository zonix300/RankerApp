package com.zonix.musicrankerapp.integration.annotation;


import com.zonix.musicrankerapp.MusicRankerApplication;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@ActiveProfiles("test")
@SpringBootTest(classes = MusicRankerApplication.class)
public @interface IT {
}
