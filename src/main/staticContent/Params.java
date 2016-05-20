package main.staticContent;

import main.ParamsMap;

import java.util.HashMap;

/**
 * Created by fdarmoch on 2016-04-19.
 */
public class Params {

    private static Params instance = null;
    private static String logFileFormat;
    private static boolean correlationIsTurnOn;
    private static String className;
    private static String labels;
    private static HashMap<String,String> params;
    protected Params() {
    }


    public static Params getInstance() {
        if (instance == null) {
            instance = new Params();
            logFileFormat = "csv";
            className="A";
            labels="C";
            params=new HashMap<>();
        }
        return instance;
    }



    public static String setBootstrapIsTurnOn(boolean bootstrapIsTurnOn) {

        if(bootstrapIsTurnOn)
        return "<div class=\"alert alert-success\" role=\"alert\"> Wlaczono Bootstrap </div>";
        else
        return "<div class=\"alert alert-success\" role=\"alert\"> Wylaczono Bootstrap</div>";
    }

    public static String getLogFileFormat() {
        return logFileFormat;
    }

    public static void setLogFileFormat(String logFileFormat) {
        Params.logFileFormat = logFileFormat;
        Logger.getInstance().info("Zmieniono format pliku na: "+logFileFormat);
    }



    public static boolean isCorrelationIsTurnOn() {
        return correlationIsTurnOn;
    }

    public static void setCorrelationIsTurnOn(boolean correlationIsTurnOn) {
        Params.correlationIsTurnOn = correlationIsTurnOn;
    }

    public static String getClassName() {
        return className;
    }

    public static void setClassName(String className) {
        Params.className = className;
    }

    public static String getLabels() {
        return labels;
    }

    public static void setLabels(String labels) {
        Params.labels = labels;
    }

    public static HashMap<String, String> getParams() {
        return params;
    }

    public static void setParams(HashMap<String, String> params) {
        Params.params = params;
    }
    public HashMap<String,String> getClasses(){
        params.clear();
        params.put("background",Params.getInstance().getClassName());
        params.put("labels",Params.getInstance().getLabels());
        return params;
    }

    public void updateAll(ParamsMap paramsMap) {

        Params.getInstance().setCorrelationIsTurnOn(paramsMap.isCorrelation());
        Params.getInstance().setLogFileFormat(paramsMap.getFileformat());
        Params.getInstance().setClassName(paramsMap.getBackground());
        Params.getInstance().setLabels(paramsMap.getLabels());
    }
}
