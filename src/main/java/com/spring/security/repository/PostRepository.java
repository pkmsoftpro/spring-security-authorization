package com.spring.security.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.security.entity.Post;

/**
 * Created by prashant.mod on 24-07-2024 Wednesday 4:12:18 pm
 *
 */
public interface PostRepository extends JpaRepository<Post,Integer> {
}
