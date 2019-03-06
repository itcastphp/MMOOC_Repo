package com.qfedu.action;

import com.google.gson.Gson;
import com.qfedu.dao.ClassIfyDao;
import com.qfedu.domain.Classify;
import com.qfedu.serviceimp.ClassIfyServiceImpl;
import com.qfedu.util.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
@Controller
@WebServlet("/showAllClassIfyAction")
public class ShowAllClassIfyAction extends HttpServlet {
    @Autowired
    private ClassIfyServiceImpl classIfyServiceimp;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("text/html;charSet=utf-8");
        List<Classify> allClassify = classIfyServiceimp.getAllClassify();
        Gson gson = new Gson();
        String json = gson.toJson(allClassify);
        resp.getWriter().print(json);
    }
}
