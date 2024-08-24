package com.zonix.musicrankerapp.mapper;

import com.zonix.musicrankerapp.database.entity.User;
import com.zonix.musicrankerapp.dto.UserReadDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class UserReadMapper implements Mapper<User, UserReadDto> {

    @Override
    public UserReadDto map(User source) {
        return new UserReadDto(
                source.getId(),
                source.getUsername(),
                source.getEmail(),
                source.getPassword(),
                source.getDateJoined(),
                source.getLastLogin(),
                source.getProfileInfo(),
                source.getRole()
        );
    }
}
