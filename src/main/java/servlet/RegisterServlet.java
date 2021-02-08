package servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/register")
public class RegisterServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String surname = req.getParameter("surname");
        String email = req.getParameter("email");
        String password = req.getParameter("password");

        System.out.println(name);
        System.out.println(surname);
        System.out.println(email);
        System.out.println(password);

        req.getRequestDispatcher("/RegisterSuccess.jsp").forward(req,resp);

//       resp.setContentType("text/html; charset=UTF-8");
//       resp.setCharacterEncoding("UTF-8");
//        resp.getWriter().println(name);
//        resp.getWriter().close();
    }
}
