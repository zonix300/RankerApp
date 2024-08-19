package com.zonix.musicrankerapp.service;

import com.zonix.musicrankerapp.database.repository.UserRepository;
import com.zonix.musicrankerapp.dto.UserCreateEditDto;
import com.zonix.musicrankerapp.dto.UserReadDto;
import com.zonix.musicrankerapp.mapper.UserCreateEditMapper;
import com.zonix.musicrankerapp.mapper.UserReadMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class UserService {


    private final UserRepository userRepository;
    private final UserReadMapper userReadMapper;
    private final UserCreateEditMapper userCreateEditMapper;

    public List<UserReadDto> findAll() {
        return userRepository.findAll().stream()
                .map(userReadMapper::map)
                .toList();
    }

    public Optional<UserReadDto> findByUsername(String username) {
        return userRepository.findByUsername(username)
                .map(userReadMapper::map);
    }

    @Transactional
    public UserReadDto create(UserCreateEditDto userCreateEditDto) {
        return Optional.of(userCreateEditDto)
                .map(userCreateEditMapper::map)
                .map(userRepository::save)
                .map(userReadMapper::map)
                .orElseThrow();
    }

    @Transactional
    public Optional<UserReadDto> update(String username, UserCreateEditDto userCreateEditDto) {
        return userRepository.findByUsername(username)
                .map(user -> userCreateEditMapper.map(userCreateEditDto, user))
                .map(userRepository::saveAndFlush)
                .map(userReadMapper::map);
    }

    @Transactional
    public boolean delete(String username) {
        return userRepository.findByUsername(username)
                .map(user -> {
                    userRepository.delete(user);
                    userRepository.flush();
                    return true;
                }).orElse(false);
    }


}
