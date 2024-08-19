package com.zonix.musicrankerapp.integration.service;

import com.zonix.musicrankerapp.integration.annotation.IT;
import com.zonix.musicrankerapp.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;


@IT
public class UserServiceIT {

    @Autowired
    private UserService userService;

    @Test
    void findById() {


    }
}
