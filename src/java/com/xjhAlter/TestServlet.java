package com.xjhAlter;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.servlet.*;
import javax.servlet.http.*;

public class TestServlet extends HttpServlet{
    private String message;

    public void init() throws ServletException {
        // 执行必需的初始化
        message = "Hello World";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 设置响应内容类型
        response.setContentType("text/html;charset=UTF-8");
        // 设置刷新自动加载时间为 5 秒
        response.setIntHeader("Refresh", 5);

        // 实际的逻辑是在这里
        PrintWriter out = response.getWriter();
        String title = "使用 GET 方法读取表单数据";
        // 处理中文
//        String name =new String(request.getParameter("name").getBytes("ISO8859-1"),"UTF-8");

        //使用默认时区和语言环境获得一个日历
        Calendar cale = Calendar.getInstance();
        //将Calendar类型转换成Date类型
        Date tasktime=cale.getTime();
        //设置日期输出的格式
        SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //格式化输出
        String nowTime = df.format(tasktime);

        String docType = "<!DOCTYPE html> \n";
        out.println(docType +
                "<html>\n" +
                "<head><title>" + title + "</title></head>\n" +
                "<body>\n"+
                "<h2>你的下一句话是：</h2>"+
                "<p>当前时间是：" + nowTime + "</p>" +
                "<p>id是"+ request.getParameter("id") + "</p>\n" +
                "</body></html>");


//        PrintWriter out = response.getWriter();
//        out.println("<h1>" + message + "</h1>");
    }

    // 处理 POST 方法请求的方法
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    public void destroy() {
        // 什么也不做
    }

}
