package com.msita.controller;

import com.msita.form.LoginForm;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

@Controller
public class LoginpageController {
    @GetMapping("/login")
    public String loginPage(final Model model){
        model.addAttribute("loginForm" , new LoginForm());
        return "login";
    }
    @PostMapping("/login")
    public String doLoginPage(@Valid @ModelAttribute("loginForm") final LoginForm loginForm , final BindingResult errors, final Model model , final HttpSession httpSession){
        if (errors.hasErrors()){
            model.addAttribute("message" , "Vui long sua cac loi sau");
            return "login";
        }


        final String email = loginForm.getEmail();
        final String password = loginForm.getPassword();
        if ("boybet97@yahoo.com.vn".equals(email) && "12345".equals(password)){
            httpSession.setAttribute("email" , email);
            return "index";
        }
        model.addAttribute("message" , "Id or password is invalid");
        return "login";


    }

    /*public boolean checkLogin(String email , String password){
        String sql = String.format("SELECT email FROM Customers ")
    }*/

    /*public class ResultSetExample {
        private static String DB_URL = "jdbc:sqlserver://localhost\ADMIN:1433;databaseName=EcommerceShop";
        private static String USER_NAME = "sa";
        private static String PASSWORD = "123456";

        public static void main(String[] args) {
            try {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                Connection conn = DriverManager.getConnection(DB_URL,
                        USER_NAME, PASSWORD);
                // crate statement
                Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
                        ResultSet.CONCUR_UPDATABLE);
                // get data from table 'student'
                ResultSet rs = stmt.executeQuery("SELECT * FROM student");
                // getting the record of 3rd row
                rs.absolute(3);
                System.out.println(rs.getInt(1) + "  " + rs.getString(2)
                        + "  " + rs.getString(3));
            } catch (Exception ex) {
                System.out.println("connect failure!");
                ex.printStackTrace();
            }
        }
    }*/

}
