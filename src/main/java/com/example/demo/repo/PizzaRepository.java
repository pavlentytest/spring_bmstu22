package com.example.demo.repo;

import com.example.demo.model.Pizza;
import org.springframework.data.repository.CrudRepository;

// CRUD
// Create Read Update Delete

public interface PizzaRepository extends CrudRepository<Pizza,Integer> {

}
