import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

@WebServlet(urlPatterns = {"/LoginServlet"})
public class LoginServlet extends HttpServlet {
    protected void doGet(
            HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter writer = response.getWriter();
        String username = request.getParameter("username");
        String pwd = request.getParameter("pwd");
        if(username.equals("Alexandra")
                && pwd.equals("1234")) {
            writer.println("Successful login");
        }else {
            writer.println("Login failed");
        }
    }
}
 
