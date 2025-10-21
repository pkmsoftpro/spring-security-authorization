package com.spring.security.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.security.entity.User;

/**
 * Created by prashant.mod on 24-07-2024 Wednesday 4:12:47 pm
 *
 */
public interface UserRepository extends JpaRepository<User,Integer> {
  Optional<User> findByUserName(String username);
}
