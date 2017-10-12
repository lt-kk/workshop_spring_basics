package de.cdiag.ws.springbasics;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SpringBasicsApplication {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(SpringBasicsApplication.class, args);
    }

    @RequestMapping("/")
    public String hello() {
        return "Hello CDI!";
    }

}
