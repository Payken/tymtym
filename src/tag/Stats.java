package tag;

import main.staticContent.Sets;

import javax.servlet.jsp.JspContext;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.JspTag;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;
import java.io.StringWriter;

/**
 * Created by fdarmoch on 2016-04-17.
 */
public class Stats extends SimpleTagSupport {

    private String type;

    public void setType(String msg) {
        this.type = msg;
    }
    private String set;

    public void setSet(String set) {
        this.set = set;
    }
    StringWriter sw = new StringWriter();

    public void doTag() throws JspException, IOException {
        JspWriter out=getJspContext().getOut();
        if (type != null) {
          /* Use message from attribute */


            if (type=="Avg")
//            out.write(Sets.getInstance().getStats(set) );
            out.write(set);
        }
        else
            out.write("przypal");

        //  out.write("My awesome taG!");
//        out.write(Etykiety.getInstance().getEtykietaCustomTag());

    }



}
