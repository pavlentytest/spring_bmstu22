package com.example.demo.controller;

import com.example.demo.model.Pizza;
import com.example.demo.repo.PizzaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


/* test123 */
@Controller
public class MyController {

    @Autowired
    PizzaRepository repo;

    @GetMapping("/")
    public String index22312() {
        return "index";
    }

    @PostMapping("/add")
    public @ResponseBody String addPizza(@RequestParam String name,
                                         @RequestParam Integer size) {
        Pizza pizza = new Pizza(name,size);
        repo.save(pizza); // insert
        return "Ok!";
    }

    @GetMapping("/all")
    public @ResponseBody Iterable<Pizza> getAll() {
        return repo.findAll();
    }
}
