package com.example.homework2_12.controller;


import com.example.homework2_12.service.CartService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/store/order")
public class StoreController {

    public final CartService service;

    public StoreController(CartService service) {
        this.service = service;
    }

    @GetMapping("/add")
    public void add(@RequestParam("ID") List<Integer> ids){
        service.add(ids);
    }

    @GetMapping("/get")
    public List<Integer> get(){
        return service.get();
    }
}
