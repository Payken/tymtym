package main;

import main.staticContent.Params;

/**
 * Created by fdarmoch on 2016-05-01.
 */
public class ParamsMap {

    String fileformat;
    String background;
    String labels;
    boolean correlation;

    public String getFileformat() {
        return fileformat;
    }

    public void setFileformat(String fileformat) {
        if (fileformat==null)
            this.fileformat= Params.getInstance().getLogFileFormat();
        else
        this.fileformat = fileformat;
    }

    public String getBackground() {
        return background;
    }

    public void setBackground(String background) {

        if (background==null)
            this.background= Params.getInstance().getClassName();
        else
        this.background = background;
    }

    public String getLabels() {
        return labels;
    }

    public void setLabels(String labels) {

        if (labels==null)
        this.labels = Params.getInstance().getLabels();
        else
        this.labels = labels;
    }

    public boolean isCorrelation() {
        return correlation;
    }

    public void setCorrelation(boolean correlation) {

        if (correlation!=true&&correlation!=false)
            this.correlation=Params.getInstance().isCorrelationIsTurnOn();
        else
        this.correlation = correlation;
    }
}
