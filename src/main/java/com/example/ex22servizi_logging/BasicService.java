package com.example.ex22servizi_logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class BasicService {

    private Logger logger = LoggerFactory.getLogger(BasicService.class);

    public String welcome() {
        String welcome = "welcome";
        logger.info("This is the welcome message");
        return welcome;
    }

    public int getExponent(int num1, int num2) {
        logger.info("Number used in exponent operation are: {}, {}", num1, num2);
        int result = 1;
        for (int i = 1; i <= num2; ++i) {
        result *= num1;
        }
        logger.debug("Result of operation is {}", result);
        return result;
    }

    public void throwException() {
        RuntimeException exception = new RuntimeException("No content");
        logger.warn("This exception is thrown: " + exception);
        throw exception;
    }
}
