import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/calculator")
public class calculatorAction extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Integer num1 = Integer.parseInt(req.getParameter("num1"));
        Integer num2 = Integer.parseInt(req.getParameter("num2"));

        String operator = req.getParameter("operator");
        Integer result = 0;

        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        try {
            switch (operator) {
                case ("+"):
                    result = num1 + num2;
                    break;
                case ("-"):
                    result = num1 - num2;
                    break;
                case ("*"):
                    result = num1 * num2;
                    break;
                case ("/"):
                    result = num1 / num2;
                    break;
            }
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ServletCalculator</title>");
            out.println("</head>");
            out.println("<body>");
            out.print("<h1>Ket qua: </h1>");
            out.println("<h1>" + num1 + " " + operator + " " + num2 + " = " + result + "</h1>");
            out.println("</body>");
            out.println("</html>");
        } finally {
            out.close();
        }
        resp.sendRedirect("../add.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}

