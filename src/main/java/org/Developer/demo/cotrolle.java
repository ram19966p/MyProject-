package org.Developer.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;


 @RestController  

public class cotrolle {
    @GetMapping("/get")
    public String doGet() {
        return "Hellow i am new born now do get meth";
    }


    @PostMapping("/post")
    public String doPost() {
        return "Hellow i am new born now do Post  method in Spring ";
    }

    
     
   
}
