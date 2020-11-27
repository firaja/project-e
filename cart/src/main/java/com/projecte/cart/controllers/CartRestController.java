package com.projecte.cart.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CartRestController
{
    @GetMapping("/")
    public String get()
    {
        return "Ciao";
    }

}
