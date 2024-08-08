package com.flutter.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flutter.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
