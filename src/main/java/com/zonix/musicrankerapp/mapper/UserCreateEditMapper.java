package com.zonix.musicrankerapp.mapper;

import com.zonix.musicrankerapp.database.entity.User;
import com.zonix.musicrankerapp.dto.UserCreateEditDto;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import java.util.Optional;

@Component
@RequiredArgsConstructor
public class UserCreateEditMapper implements Mapper<UserCreateEditDto, User> {

    private final PasswordEncoder passwordEncoder;


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

        Optional.ofNullable(object.getPassword())
                .filter(StringUtils::hasText)
                .map(passwordEncoder::encode)
                .ifPresent(user::setPassword);

        user.setDateJoined(object.getDateJoined());
        user.setLastLogin(object.getLastLogin());
        user.setProfileInfo(object.getProfileInfo());
        user.setRole(object.getRole());

        Optional.ofNullable(object.getPassword())
                .filter(StringUtils::hasText)
                .map(passwordEncoder::encode)
                .ifPresent(user::setPassword);
    }
}
