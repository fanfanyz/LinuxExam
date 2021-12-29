package com.atguigu.jdbc.controller;

import com.atguigu.jdbc.util.jdbcUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@WebServlet("/update/text")
public class UpdateServletText extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String sql="update text_ set text_event=? ,text_method=? where text_Id=?";
        PreparedStatement preparedStatement=null;
        ResultSet resultSet=null;
        Connection jdbcConnection = jdbcUtil.getJdbcConnection();
        String event = req.getParameter("event");
        String method = req.getParameter("method");
        Integer id = Integer.parseInt(req.getParameter("id"));
        PrintWriter writer = resp.getWriter();
        try {
            preparedStatement = jdbcConnection.prepareStatement(sql);
            preparedStatement.setString(1,event);
            preparedStatement.setString(2,method);
            preparedStatement.setInt(3,id);
            boolean execute = preparedStatement.execute();
            if (execute){
                writer.println("This is Update Text NotSuccessfully");
            }else {
                writer.println("This is Update Text Successfully");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            jdbcUtil.release(jdbcConnection,preparedStatement,resultSet);
        }
    }
}