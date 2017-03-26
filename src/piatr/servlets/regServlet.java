package piatr.servlets;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by piatr on 26.03.17.
 */
public class regServlet extends HttpServlet {
    private final String USERNAME = "username";
    private final String EMAIL = "email";   //вот когда БД с юзерами будет,
    private final String FIRSTNAME = "firstname";//тогда и использую эти параметры,
    private final String LASTNAME = "lastname";//а пока смысла нет с ними
    private final String PASSWORD = "password";//работать, но они
    private final String CPASSWORD = "cpassword";//пригодятся еще))
    private String registration;
    @Override
    public void init (ServletConfig config)throws ServletException {
        super.init(config);
    }
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response)throws ServletException,IOException {
        request.setCharacterEncoding("UTF-8");
        String username = request.getParameter(USERNAME);
        if(username.equals("") ){
            username = "WTF?";
            registration = "Smth wrong :(";
        } else {registration = "You registration is OK.";}
        response.setContentType("text");
        response.setCharacterEncoding("UTF-8");
        PrintWriter out = response.getWriter();
        out.println("Hi, "+username+"!"+registration);
    }
    @Override
    public void destroy(){
        super.destroy();
    }
}