import javax.servlet.*;
import java.io.IOException;
import java.io.PrintWriter;

public class PrimitiveServlet implements Servlet {

  public void init(ServletConfig config) throws ServletException {
    System.out.println("init");
  }

  public void service(ServletRequest request, ServletResponse response)
    throws ServletException, IOException {
    System.out.println("from service");

    String html = "http/1.1 200 ok\n" + "Content-type: text/html; Charset=utf-8\n" + "\n\n"
            + "<!DOCTYPE html>\n" + "<html><body>" + "Hello World!" + "</body></html>";
    PrintWriter out = new PrintWriter(response.getWriter());
    out.println(html);
    out.flush();
  }

  public void destroy() {
    System.out.println("destroy");
  }

  public String getServletInfo() {
    return null;
  }
  public ServletConfig getServletConfig() {
    return null;
  }

}
