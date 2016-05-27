package org.smart4j.charpter1;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author yangxuexi
 * @version $Id: HelloServlet.java, v 0.1 2016年05月27日 上午10:44 yang.xuexi Exp $
 */
@WebServlet(value = "/hello")
public class HelloServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:SS");
        req.setAttribute("currentTime", dateFormat.format(new Date()));
        req.getRequestDispatcher("WEB-INF/jsp/hello.jsp").forward(req, resp);
    }
}
