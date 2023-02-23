package com.SpringDataRest.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.SpringDataRest.demo.model.Alien;


//collectionResourceRel specifies base url we use //path is aliens
@RepositoryRestResource(collectionResourceRel="aliens",path="aliens")
public interface AlienRepo extends JpaRepository <Alien,Integer>{

}
