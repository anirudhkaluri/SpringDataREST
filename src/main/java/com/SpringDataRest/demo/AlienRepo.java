package com.SpringDataRest.demo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SpringDataRest.demo.model.Alien;

public interface AlienRepo extends JpaRepository <Alien,Integer>{

}
