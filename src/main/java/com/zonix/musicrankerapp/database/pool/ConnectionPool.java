package com.zonix.musicrankerapp.database.pool;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("pool1")
public class ConnectionPool {

    private final String username;
    private final Integer poolSize;

    public ConnectionPool(@Value("${db.username}") String username,
                          @Value("${db.pool.size}") Integer poolSize) {
        this.username = username;
        this.poolSize = poolSize;
    }
    @PostConstruct
    private void init() {
    }

    @PreDestroy
    private void destroy() {
    }
}
