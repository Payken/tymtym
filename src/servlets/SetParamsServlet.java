package servlets;

import com.fasterxml.jackson.databind.ObjectMapper;
import main.ParamsMap;
import main.staticContent.Params;

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
@WebServlet(name = "setParams", urlPatterns = "/setparams")
public class SetParamsServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

       StringBuffer stringBuffer = new StringBuffer();
        BufferedReader reader = request.getReader();
        String line = null;
        while ((line = reader.readLine()) != null) {
            stringBuffer.append(line);
        }

      ObjectMapper objectMapper = new ObjectMapper();

        ParamsMap paramsMap = objectMapper.readValue(stringBuffer.toString(), ParamsMap.class);
       Params.getInstance().updateAll(paramsMap);
        response.getWriter().write("ok");
      //  Sets.getInstance().addSet(stringBuffer.toString());
      //  response.getWriter().write(stringBuffer.toString());
    }
}