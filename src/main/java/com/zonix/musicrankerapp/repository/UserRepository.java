package com.zonix.musicrankerapp.repository;

import com.zonix.musicrankerapp.database.pool.ConnectionPool;
import com.zonix.musicrankerapp.entity.User;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class UserRepository implements CrudRepository<Long, User> {


    private final ConnectionPool pool1;
    private final Integer poolSize;

    public UserRepository(ConnectionPool pool1,
                          @Value("${db.pool.size}") Integer poolSize) {
        this.pool1 = pool1;
        this.poolSize = poolSize;
    }
    @Override
    public Optional<User> findById(Long id) {
        //TODO
        return Optional.of(new User());
    }

    @Override
    public void delete(User entity) {
        //TODO
    }
}
