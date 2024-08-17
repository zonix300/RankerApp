package com.zonix.musicrankerapp;

import com.zonix.musicrankerapp.database.pool.ConnectionPool;
import com.zonix.musicrankerapp.repository.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MusicRankerApplication {

    public static void main(String[] args) {
        var context = SpringApplication.run(MusicRankerApplication.class, args);
        System.out.println(context.getBean(ConnectionPool.class));

        var pool1 = context.getBean("pool1", ConnectionPool.class);
        System.out.println(pool1);

        var userRepository = context.getBean("userRepository", UserRepository.class);
        System.out.println(userRepository.findById(1L));
    }

}
