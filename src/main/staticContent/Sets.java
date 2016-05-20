package main.staticContent;


import tag.CustomTag;

import java.util.*;
import java.math.*;

import static java.lang.Math.pow;

/**
 * Created by fdarmoch on 2016-04-17.
 */

public class Sets {

    private static Sets instance = null;
    static Map<String, ArrayList<Double>> myMap = new HashMap<>();
    protected Sets() {
    }

    ;

    public static Sets getInstance() {
        if (instance == null) {
            instance = new Sets();
     //       myMap.put("A", new ArrayList());
        }
        return instance;
    }


    public Map<String, ArrayList<Double>> getMyMap() {

        return myMap;
    }

    public void setMyMap(Map<String, ArrayList<Double>> myMap) {
        this.myMap = myMap;
    }

    public String addSet(String name) {
        if (name != null) {
            Sets.getInstance().getMyMap().put(name, new ArrayList());
            Logger.getInstance().info("Dodano zbior o nazwie: "+name);
            return "<div class=\"alert alert-success\" role=\"alert\"> Poprawnie dodano zbior o nazwie " + name + "</div>";
        } else
            return "<br>";
    }


    public String addValue(String set, String value) {
        if (value != null) {
    ArrayList list=Sets.getInstance().getMyMap().get(set);
            list.add(Double.valueOf(value));
            Sets.getInstance().getMyMap().put(set,list);
            Logger.getInstance().info("Do zbioru: "+set+"    dodano wartość: "+value);
            return "<div class=\"alert alert-success\" role=\"alert\"> Poprawnie dodano wartosc " + value + " do zbioru " + set + "</div>";
        }
        else return "<br>";
    }

    public String delSet(String set) {
        if (set != null) {
            Sets.getInstance().getMyMap().remove(set);
            Logger.getInstance().info("Usunieto zbior: "+set);
            return "<div class=\"alert alert-success\" role=\"alert\"> Poprawnie usunieto zbiór " + set + " </div>";
        }
        else
            return "<br>";
    }
    public Double calculateAverage(String set) {
        Double sum = Double.valueOf(0);
        int i;
        if (set != null) {
            ArrayList<Double> list = Sets.getInstance().getMyMap().get(set);
            for (i = 0; i < list.size(); i++) {
                sum += (Double) list.get(i);
            }
            return sum / list.size();
        }
        else return null;
    }
    public Double calculateMedian(String set) {

        if (set != null) {
            ArrayList<Double> list = Sets.getInstance().getMyMap().get(set);
            Collections.sort(list);
            int middle = list.size() / 2;
            if (list.size() % 2 == 1) {
                return (Double) list.get(middle);
            } else {
                return ((Double) list.get(middle - 1) + (Double) list.get(middle)) / 2.0;
            }
        }
        else return null;
    }
    public Double calculateCorelation(String set, String set2) {
        Double xsr = calculateAverage(set);
        Double ysr = calculateAverage(set2);
        Double xxx =Double.valueOf(0);
        Double xxx2 =Double.valueOf(0);
        Double yyy=Double.valueOf(0);;
        Double yyy2=Double.valueOf(0);
        Double Gora=Double.valueOf(0);
        Double Dol=Double.valueOf(0);

        int i;
        ArrayList<Double> list = Sets.getInstance().getMyMap().get(set);
        ArrayList<Double> list2 = Sets.getInstance().getMyMap().get(set2);
        for (i = 0; i < list.size(); i++) {
         Gora=Gora+(((Double)list.get(i)-xsr)*((Double)list2.get(i)-ysr));
         xxx2=xxx2+pow((Double)list.get(i)-xsr,2);
         yyy2=yyy2+pow((Double)list.get(i)-xsr,2);


//     Double sum = (Double) list.get(i);
        }
        Dol=pow(xxx2,0.5)*pow(yyy2,0.5);
        return Gora/Dol;
    }

    public SetStat getStats(String set, String set2){

        SetStat setStat = new SetStat();
        setStat.setAverage(calculateAverage(set));
        setStat.setMedian(calculateMedian(set));
        setStat.setCorrelation(calculateCorelation(set,set2));
        setStat.setName(set);
        return setStat;

    }
//public ArrayList getSets()
//{ ArrayList array = new ArrayList();
//    array = Sets.getInstance().getMyMap().;
//    return array;
//}
//    public String getStats(String set) {
//        if (set != null) {
//
//            calculateAverage(Sets.getInstance().getMyMap().get(set));
//
//            return "<div class=\"jumbotron\">   " + calculateAverage(Sets.getInstance().getMyMap().get(set)) + " <br>" +
//                    "mediana: "+calculateMedian(Sets.getInstance().getMyMap().get(set))+ "<br> wspolczynnik korelacji"+calculateCorelation(Sets.getInstance().getMyMap().get(set))+ "</div>";
//        }
//        else
//            return "<br>";
//    }
}
