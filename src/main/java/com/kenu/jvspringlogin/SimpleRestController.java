package com.kenu.jvspringlogin;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleRestController {

    @GetMapping("/")
    public String home() {
        return "Rest controller";
    }
}
