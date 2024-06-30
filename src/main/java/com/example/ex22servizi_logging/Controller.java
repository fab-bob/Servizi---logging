package com.example.ex22servizi_logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Controller {

    @Autowired
    Environment environment;
    @Autowired
    private BasicService basicService;

    Logger logger = LoggerFactory.getLogger(Controller.class);

    @GetMapping("/")
    public String welcome() {
        return basicService.welcome();
    }

    @GetMapping("/exp")
    public int getExponent(@RequestParam int base, @RequestParam int exponent) {
        return basicService.getExponent(base, exponent);
    }

    @GetMapping("/get-errors")
    public void throwException() {
      basicService.throwException();
    }
}
