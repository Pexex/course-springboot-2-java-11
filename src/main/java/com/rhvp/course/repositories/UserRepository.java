package com.rhvp.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rhvp.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
