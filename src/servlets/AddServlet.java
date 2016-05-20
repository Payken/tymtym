package servlets;

import com.fasterxml.jackson.databind.JsonMappingException;
import main.AddMap;
import main.staticContent.Logger;
import main.staticContent.Params;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Date;
import com.fasterxml.jackson.databind.ObjectMapper;
import main.staticContent.Sets;

/**
 *
 */
@WebServlet(name = "add", urlPatterns = "/add")
public class AddServlet extends HttpServlet {
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
        Sets.getInstance().addSet(addMap.getName());
        response.getWriter().write("ok");
      //  Sets.getInstance().addSet(stringBuffer.toString());
      //  response.getWriter().write(stringBuffer.toString());
    }
}