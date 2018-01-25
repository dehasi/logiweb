package dh.logiweb.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Ravil on 25/01/2018.
 */
@RestController
public class GreetController {
    @GetMapping("/h")
    public String greet() {
        return "Hello";
    }
}
