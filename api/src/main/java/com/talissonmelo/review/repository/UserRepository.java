package com.talissonmelo.review.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.talissonmelo.review.model.User;

public interface UserRepository extends JpaRepository<User, Long>{

	Optional<User> findByUsername(String username);
}
