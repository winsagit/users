package controller;
import model.Model;
import model.User;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;


/**
 * Created by student on 27.10.2017.
 */
public class MainServlet extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        PrintWriter pw = resp.getWriter();
        Model model = new Model();
        ArrayList<User> users = model.getSelectUser("SELECT * FROM `users`");
        System.out.println(users.toString());
        //User model = new User((long) 1, "login1", "123456");
       // pw.print(users.toString());
        req.setAttribute("users", users);
        req.getRequestDispatcher("/WEB-INF/home.jsp").forward(req, resp);

    }
}
