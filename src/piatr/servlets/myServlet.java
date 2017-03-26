package piatr.servlets;

/**
 * Created by piatr on 24.03.17.
 */

 import com.sun.deploy.util.StringUtils;
 import piatr.User;

 import javax.servlet.ServletConfig;
 import javax.servlet.ServletException;
 import javax.servlet.http.HttpServlet;
 import javax.servlet.http.HttpServletRequest;
 import javax.servlet.http.HttpServletResponse;
 import java.io.IOException;
 import java.io.PrintWriter;
 import java.util.ArrayList;

public class myServlet extends HttpServlet {
    private final String ID = "id";
    private final String EMAIL = "email";
    private final String PASSWORD = "password";
    private String reg;
    @Override
    public void init (ServletConfig config)throws ServletException{
        super.init(config);
    }
   @Override
    protected void service(HttpServletRequest request, HttpServletResponse response)throws ServletException,IOException{
        request.setCharacterEncoding("UTF-8");
        String name = request.getParameter(ID);
        if(name.equals("") ){
            name = "WTF?";
            reg = "Smth wrong :(";
        } else {reg = "You are sign in.";}
        response.setContentType("text");
        response.setCharacterEncoding("UTF-8");
       PrintWriter out = response.getWriter();
       out.println("Hi, "+name+"!"+reg);
   }
   @Override
    public void destroy(){
        super.destroy();
   }
}
