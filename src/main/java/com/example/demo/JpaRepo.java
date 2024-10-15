package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.models.userLogin;

public interface JpaRepo extends JpaRepository <userLogin , Integer>{

}
