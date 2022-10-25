package ru.netology;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Logger {
    private int num = 1;
    private static Logger logger;

    private Logger() {
    }

    public void log(String msg) {
        Date dateNow = new Date();
        SimpleDateFormat formatForDateNow = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
        System.out.println("[" + formatForDateNow.format(dateNow) + " " + num++ + "] " + msg);
    }

    public static Logger getInstance() {
        if (logger == null) {
            logger = new Logger();
            return logger;
        } else {
            return logger;
        }
    }
}
