package main.staticContent;

import main.EtykietyMap;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by fdarmoch on 2016-04-16.
 */
public class Etykiety {
    private  static Etykiety instance =null;
    private static String wprowadzWartosc;
    private static String korelacjaz;
    private static String nazwaZbioru;
    private static String srednia;
    private static String mediana;
    private static String korelacja;
    private static HashMap<String,String> labels;
    protected Etykiety(){};
    public static Etykiety getInstance(){
        if(instance==null){
            instance=new Etykiety();
            wprowadzWartosc="Wprowadz Wartosc";
            nazwaZbioru="Nazwa Zbioru";
            srednia="Srednia";
            mediana="Mediana";
            korelacja="Korelacja";
            korelacjaz="Korelacja z";
            labels=new HashMap<>();
        }
        return instance;
    }

    public static String getKorelacjaz() {
        return korelacjaz;
    }

    public static void setKorelacjaz(String korelacjaz) {
        Etykiety.korelacjaz = korelacjaz;
    }

    public static String getWprowadzWartosc() {
        return wprowadzWartosc;
    }

    public static void setWprowadzWartosc(String wprowadzWartosc) {
        Etykiety.wprowadzWartosc = wprowadzWartosc;
    Logger.getInstance().info("zmieniono etykiete Wprowadz Wartosc na: "+wprowadzWartosc);
    }

    public static String getNazwaZbioru() {
        return nazwaZbioru;
    }

    public static void setNazwaZbioru(String nazwaZbioru) {
        Etykiety.nazwaZbioru = nazwaZbioru;
        Logger.getInstance().info("zmieniono etykiete Nazwa Zbioru na: "+nazwaZbioru);
    }

    public static String getSrednia() {
        return srednia;
    }

    public static void setSrednia(String srednia) {
        Etykiety.srednia = srednia;
        Logger.getInstance().info("zmieniono etykiete Srednia na: "+srednia);
    }

    public static String getMediana() {
        return mediana;

    }

    public static void setMediana(String mediana) {
        Etykiety.mediana = mediana;
        Logger.getInstance().info("zmieniono etykiete Mediana na: "+mediana);
    }

    public static String getKorelacja() {
        return korelacja;

    }


    public static void setKorelacja(String korelacja) {
        Etykiety.korelacja = korelacja;
        Logger.getInstance().info("zmieniono etykiete Korelacja na: "+korelacja);
    }
    public HashMap<String, String> getLabels()
    {   labels.clear();
        labels.put("correlation",Etykiety.getInstance().getKorelacja());
       labels.put("median",Etykiety.getInstance().getMediana());
       labels.put("average",Etykiety.getInstance().getSrednia());
       labels.put("name",Etykiety.getInstance().getNazwaZbioru());
       labels.put("insertvalue",Etykiety.getInstance().getWprowadzWartosc());
        labels.put("correlationWith",Etykiety.getInstance().getKorelacjaz());
        return labels;
    };

    public void updateAll(EtykietyMap etykietyMap) {
        if(etykietyMap.getSrednia()!=null)Etykiety.getInstance().setSrednia(etykietyMap.getSrednia());
        if(etykietyMap.getMediana()!=null)Etykiety.getInstance().setMediana(etykietyMap.getMediana());
        if(etykietyMap.getKorelacja()!=null)Etykiety.getInstance().setKorelacja(etykietyMap.getKorelacja());
        if(etykietyMap.getKorelacjaz()!=null)Etykiety.getInstance().setKorelacjaz(etykietyMap.getKorelacjaz());
        if(etykietyMap.getWprowadzWartosc()!=null)Etykiety.getInstance().setWprowadzWartosc(etykietyMap.getWprowadzWartosc());
        if(etykietyMap.getNazwaZbioru()!=null)Etykiety.getInstance().setNazwaZbioru(etykietyMap.getNazwaZbioru());
    }

}
