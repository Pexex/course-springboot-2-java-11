package com.rhvp.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rhvp.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
