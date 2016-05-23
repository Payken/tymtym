package tag;

import main.staticContent.Etykiety;
import main.staticContent.Params;
import main.staticContent.Sets;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.JspTag;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;
import java.io.StringWriter;
import java.util.Date;


/**
 * Created by fdarmoch on 2016-04-16.
 */
public class CustomTag extends SimpleTagSupport {
    private String var;

    public void setVar(String msg) {
        this.var = msg;
    }

    StringWriter sw = new StringWriter();

    public void doTag() throws JspException, IOException {
        JspWriter out=getJspContext().getOut();
        String label="";
        if (var != null) {
          /* Use message from attribute */
            if (var=="wprowadzWartosc")
                label=Etykiety.getInstance().getWprowadzWartosc();
            if(var=="nazwaZbioru")
                label=Etykiety.getInstance().getNazwaZbioru();
            if(var=="srednia")
                label=Etykiety.getInstance().getSrednia();
            if(var=="mediana")
                label=Etykiety.getInstance().getMediana();
            if(var=="korelacja")
                label=Etykiety.getInstance().getKorelacja();

            out.write("<h3 class=\"labels\">"+label+"</h3>");
        }

      //  out.write("My awesome taG!");
//        out.write(Etykiety.getInstance().getEtykietaCustomTag());

    }
}
