package servlets;

import com.fasterxml.jackson.databind.ObjectMapper;
import main.EtykietyMap;
import main.staticContent.Etykiety;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;

/**
 *
 */
@WebServlet(name = "setLabels", urlPatterns = "/setlabels")
public class SetLabelsServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

       StringBuffer stringBuffer = new StringBuffer();
        BufferedReader reader = request.getReader();
        String line = null;
        while ((line = reader.readLine()) != null) {
            stringBuffer.append(line);
        }

      ObjectMapper objectMapper = new ObjectMapper();

        EtykietyMap etykietyMap = objectMapper.readValue(stringBuffer.toString(), EtykietyMap.class);
       Etykiety.getInstance().updateAll(etykietyMap);
        response.getWriter().write(objectMapper.writeValueAsString(Etykiety.getInstance().getLabels()));
      //  Sets.getInstance().addSet(stringBuffer.toString());
      //  response.getWriter().write(stringBuffer.toString());
    }
}