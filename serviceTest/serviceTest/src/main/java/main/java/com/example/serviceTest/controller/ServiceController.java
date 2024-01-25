package main.java.com.example.serviceTest.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/* this is the main service running on the port, to be accessed through the gateway api  */
@RestController
@RequestMapping("/demo")
public class ServiceController {

    @GetMapping("/gfg")
    public ResponseEntity<String> getAnonymous() {
        return ResponseEntity.ok("Welcome to GeeksforGeeks");
    }

}