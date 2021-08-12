package com.springboot.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeResources {

    Logger logger = LoggerFactory.getLogger(HomeResources.class);

    @RequestMapping("/")
    public String home() {
        logger.info("Home method accessed!");
        logger.error("error thrown!");
        // logger.error("Error logged!");
        return "Hello from spring boot";
    }
}
