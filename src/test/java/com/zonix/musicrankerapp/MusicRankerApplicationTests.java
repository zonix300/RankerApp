package com.zonix.musicrankerapp;

import com.zonix.musicrankerapp.database.pool.ConnectionPool;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.SpyBean;

@SpringBootTest
class MusicRankerApplicationTests {

    @SpyBean
    private ConnectionPool pool1;

}
