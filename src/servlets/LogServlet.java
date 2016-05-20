package servlets;

import main.staticContent.Logger;
import main.staticContent.Params;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;

/**

 */
public class LogServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Date date = new Date();
        String filename = "Logs_" + date.toString() + "." + Params.getInstance().getLogFileFormat();
        response.setContentType("APPLICATION/OCTET-STREAM");
        response.setHeader("Content-Disposition","attachment; filename=\"" + filename + "\"");
        Logger.getInstance().info("Pobrano plik z logami ");
        response.getWriter().write(Logger.getInstance().getLogs());
    }
}