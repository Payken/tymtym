package main.staticContent;

/**
 * Created by fdarmoch on 2016-04-26.
 */
public class SetStat {

    private String name;
    private Double average;
    private Double median;
    private String correlationWith;
    private Double correlation;

    public String getCorrelationWith() {
        return correlationWith;
    }

    public void setCorrelationWith(String correlationWith) {
        this.correlationWith = correlationWith;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getAverage() {
        return average;
    }

    public void setAverage(Double average) {
        this.average = average;
    }

    public Double getMedian() {
        return median;
    }

    public void setMedian(Double median) {
        this.median = median;
    }

    public Double getCorrelation() {
        return correlation;
    }

    public void setCorrelation(Double correlation) {
        this.correlation = correlation;
    }
}
