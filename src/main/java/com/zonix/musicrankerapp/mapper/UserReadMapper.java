package com.zonix.musicrankerapp.mapper;

import com.zonix.musicrankerapp.database.entity.User;
import com.zonix.musicrankerapp.dto.UserReadDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class UserReadMapper implements Mapper<User, UserReadDto> {

    @Override
    public UserReadDto map(User object) {
        return new UserReadDto(
                object.getId(),
                object.getUsername(),
                object.getEmail(),
                object.getPassword(),
                object.getDateJoined(),
                object.getLastLogin(),
                object.getProfileInfo(),
                object.getRole()
        );
    }
}
