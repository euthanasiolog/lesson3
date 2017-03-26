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
        String mail = request.getParameter(EMAIL);//пока просто на null проверяю, потом БД подключу, можно сверять будет(и пароль тоже)
        if(mail.isEmpty()){
            mail = "WTF?";
            reg = "Email is bad :(";
        } else {reg = "You are sign in."; mail = "";}
        String pass = request.getParameter(PASSWORD);
        if(pass.isEmpty()|pass.equals(" ")){
            reg = "Password is to simple!";
        }
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
       PrintWriter out = response.getWriter();
       out.println("Hi, "+name+"!"+mail+reg);
   }
   @Override
    public void destroy(){
        super.destroy();
   }
}
