package com.example.demo;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ms1")
public class MS1Controller {

    @GetMapping("/add")
    public String add(@RequestParam int a,
                      @RequestParam int b) {

        return "MS 1.1 - Additon = " + (a + b);
    }
}