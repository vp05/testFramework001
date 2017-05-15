package com.platform.framework;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggerUtil {

    private static final Logger LOGGER = LoggerFactory.getLogger(LoggerUtil.class);
    private static LoggerUtil LOGGER_UTIL = new LoggerUtil();

    private LoggerUtil() {
    }

    public static LoggerUtil getInstance() {
        if (LOGGER_UTIL == null) {
            LOGGER_UTIL = new LoggerUtil();
        }
        return LOGGER_UTIL;
    }

    public void log(Class clazz, String logMessage, String logLevel) {
        if (logLevel.equals("info")) {
            LOGGER.info(clazz.getName() + " " + logLevel + " logMessage: " + logMessage);
        } else if (logLevel.equals("info")) {
            LOGGER.debug(clazz.getName() + " " + logLevel + " logMessage: " + logMessage);
        } else if (logLevel.equals("info")) {
            LOGGER.error(clazz.getName() + " " + logLevel + " logMessage: " + logMessage);
        } else {
            LOGGER.error(clazz.getName() + " " + logLevel + "Wrongly given logLevel.");
        }

    }
}
