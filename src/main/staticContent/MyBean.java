package main.staticContent;
import main.staticContent.Sets;

import java.util.Set;

/**
 * Created by fdarmoch on 2016-04-17.
 */
public class MyBean {

    private Sets sets = Sets.getInstance();
  //  private Set setList = sets.getMyMap().keySet();
    private Logger logger=Logger.getInstance();

    public Logger getLogger() {
        return logger;
    }

    public void setLogger(Logger logger) {
        this.logger = logger;
    }

    public Sets getSets() {
        return sets;
    }

    public void setSets(Sets sets) {
        this.sets = sets;
    }


}
