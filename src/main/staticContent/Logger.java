package main.staticContent;

import java.util.Date;

/**
 * Created by fdarmoch on 2016-04-19.
 */
public class Logger {

    private static Logger instance = null;
    private static String logs;


    protected Logger() {
    }


    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
            logs="";
        }
        return instance;
    }

    public  String info(String message){
        String temp;
Date date = new Date();
        temp= Logger.getInstance().getLogs()+" \n "+date.toString()+"   :    "+message;
        Logger.getInstance().setLogs(temp);
        return Logger.logs;
    }
    public static String getLogs() {
        return logs;
    }

    public static void setLogs(String logs) {
        Logger.logs = logs;
    }
}
