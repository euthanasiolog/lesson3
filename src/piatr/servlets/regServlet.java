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
    private String username;
    private String email;
    private String firstname;
    private String lastname;
    private String password;
    private String cpassword;
    private String registration;
    @Override
    public void init (ServletConfig config)throws ServletException {
        super.init(config);
    }
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response)throws ServletException,IOException {
        request.setCharacterEncoding("UTF-8");
        String nickname = request.getParameter(username);
        if(username.equals("") ){
            nickname = "WTF?";
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