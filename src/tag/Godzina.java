package tag;

import main.staticContent.Etykiety;

import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.JspTag;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;

/**
 * Created by fdarmoch on 2016-04-16.
 */
public class Godzina extends SimpleTagSupport {
    public void doTag() throws IOException{
        JspWriter out=getJspContext().getOut();
        out.write(Etykiety.getInstance().getNazwaZbioru());
    }
}
