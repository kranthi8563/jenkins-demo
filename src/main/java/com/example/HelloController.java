package com.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Value;


@RestController
public class HelloController {


   @Value("${app.message}")
   private String message;

   @GetMapping("/hello")
   public String hello() {
      return message;
    }
}
