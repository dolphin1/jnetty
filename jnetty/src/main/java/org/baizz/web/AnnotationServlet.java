package org.baizz.web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by baizz on 2014-10-21.
 */

/**
 * 注解WebServlet用来描述一个Servlet
 * 属性name描述Servlet的名字, 可选
 * 属性urlPatterns定义访问的URL, 或者使用属性value定义访问的URL.(定义访问的URL是必选属性)
 */
@WebServlet(name = "annotationServlet", urlPatterns = "/annotationServlet")
public class AnnotationServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }
}
