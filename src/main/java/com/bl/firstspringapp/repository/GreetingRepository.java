package com.bl.firstspringapp.repository;

import com.bl.firstspringapp.model.Greeting;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

public interface GreetingRepository extends CrudRepository<Greeting,Long> {
}
