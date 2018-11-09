package com.easy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.servlet.http.HttpServletRequest;

@SpringBootApplication
public class ShuduSpringbootApplication {

    private static final Logger logger = LoggerFactory.getLogger(ShuduSpringbootApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(ShuduSpringbootApplication.class, args);
        logger.info("ShuduSpringbootApplication is success");
    }
}
