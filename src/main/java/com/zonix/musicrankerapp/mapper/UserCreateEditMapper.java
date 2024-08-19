package com.zonix.musicrankerapp.mapper;

import com.zonix.musicrankerapp.database.entity.User;
import com.zonix.musicrankerapp.dto.UserCreateEditDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class UserCreateEditMapper implements Mapper<UserCreateEditDto, User>{


    @Override
    public User map(UserCreateEditDto source) {
        User target = new User();
        copy(source, target);
        return target;
    }

    @Override
    public User map(UserCreateEditDto source, User target) {
        copy(source, target);
        return target;
    }

    private void copy(UserCreateEditDto object, User user) {
        user.setUsername(object.getUsername());
        user.setEmail(object.getEmail());
        user.setPassword(object.getPassword());
        user.setDateJoined(object.getDateJoined());
        user.setLastLogin(object.getLastLogin());
        user.setProfileInfo(object.getProfileInfo());
        user.setRole(object.getRole());
    }
}
