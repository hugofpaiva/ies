import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.eclipse.jetty.server.Connector;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.ServerConnector;
import org.eclipse.jetty.servlet.ServletHandler;

public class EmbeddedJettyExample {

    
    /** 
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {

        Server server = new Server(8680);

        ServletHandler servletHandler = new ServletHandler();
        server.setHandler(servletHandler);

        servletHandler.addServletWithMapping(HelloServlet.class, "/hello/");

        server.start();
        server.join();

    }

    public static class HelloServlet extends HttpServlet {
        protected void doGet(HttpServletRequest request, HttpServletResponse response)
                throws ServletException, IOException {
            String username = request.getParameter("username");

            if (username == null) {
                throw new NullPointerException("Username parameter needed.");
            }

            response.setContentType("text/html;charset=UTF-8");
            response.setStatus(HttpServletResponse.SC_OK);
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

}