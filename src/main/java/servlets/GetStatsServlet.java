package servlets;

import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import main.AddMap;
import main.staticContent.Sets;

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
@WebServlet(name = "getStats", urlPatterns = "/getstats")
public class GetStatsServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, JsonMappingException {

       StringBuffer stringBuffer = new StringBuffer();
        BufferedReader reader = request.getReader();
        String line = null;
        while ((line = reader.readLine()) != null) {
            stringBuffer.append(line);
        }

      ObjectMapper objectMapper = new ObjectMapper();

        AddMap addMap = objectMapper.readValue(stringBuffer.toString(), AddMap.class);
        response.getWriter().write(objectMapper.writeValueAsString(Sets.getInstance().getStats(addMap.getName(),addMap.getName2())));
      //  Sets.getInstance().addSet(stringBuffer.toString());
      //  response.getWriter().write(stringBuffer.toString());
    }
}