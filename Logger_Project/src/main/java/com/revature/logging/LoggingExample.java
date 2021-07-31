package com.revature.logging;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoggingExample{
    private static final Logger LOGGER = LogManager.getLogger(LoggingExample.class);
    public static void main(String[] args) {
    LOGGER.info("This is an INFO level log message!");
    LOGGER.warn("This is an WARN level log message!");
    LOGGER.error("This is an ERROR level log message!");
}
}
