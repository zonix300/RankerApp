package com.zonix.musicrankerapp;

import com.zonix.musicrankerapp.database.pool.ConnectionPool;
import com.zonix.musicrankerapp.database.repository.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MusicRankerApplication {

    public static void main(String[] args) {
        var context = SpringApplication.run(MusicRankerApplication.class, args);
    }

}
