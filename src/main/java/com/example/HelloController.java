package com.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
<<<<<<< HEAD
=======
import org.springframework.beans.factory.annotation.Value;

>>>>>>> faeed8f (updated files)

@RestController
public class HelloController {

<<<<<<< HEAD
    @GetMapping("/hello")
    public String hello() {
        return "Hello from Spring Boot + Docker + Jenkins!";
    }
=======
   @Value("${app.message}")
   private String message;

   @GetMapping("/hello")
   public String hello() {
      return message;
    }

>>>>>>> faeed8f (updated files)
}
