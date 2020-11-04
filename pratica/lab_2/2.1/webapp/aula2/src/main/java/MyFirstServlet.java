import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "MyFirstServlet", urlPatterns = { "/MyFirstServlet" })
public class MyFirstServlet extends HttpServlet {

    private static final long serialVersionUID = -1915463532411657451L;

    
    /** 
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     * Allows for a GET request, responding with the username passed or throwing a NullPointerException if not passed
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String username = request.getParameter("username");

        if(username==null)
      {
           throw new NullPointerException("Username parameter needed.");
      }

        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            // Write some content
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servelet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h2>Hello, " + username + "!</h2>");
            out.println("</body>");
            out.println("</html>");
        } finally {
            out.close();
        }
    }
}