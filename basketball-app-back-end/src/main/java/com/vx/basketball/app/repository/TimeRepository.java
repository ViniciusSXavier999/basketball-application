package com.vx.basketball.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vx.basketball.app.entities.Times;

public interface TimeRepository extends JpaRepository<Times, Long> {

}
