
package Controller;

import Hibernate.Login;
import Hibernate.NewHibernateUtil;
import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class LoginController implements Controller{

    @Override
    public ModelAndView handleRequest(HttpServletRequest hsr, HttpServletResponse hsr1) throws Exception {
        Transaction tx = null;
        ModelAndView mv = new ModelAndView("Login");  
        HttpSession httpsession = hsr.getSession();
        if(hsr.getParameter("name").equals("Login")){
            httpsession.setAttribute("messege","");
            return new ModelAndView("Login");
        }else{
           String user = hsr.getParameter("user");
           String pass = hsr.getParameter("pass");
           Session se=NewHibernateUtil.getSessionFactory().openSession();
            ArrayList<Login> ls=new ArrayList();
            HttpSession ssn=hsr.getSession();
            Transaction tx1=se.beginTransaction();
            ls=(ArrayList<Login>) se.createQuery("from Login where username='"+user+"' and password='"+pass+"'").list();
            tx1.commit();
            se.close();
            if(ls.size()>0) {
                ssn.setAttribute("data", ls);
                return new ModelAndView("User");
                
            }else{
                ssn.setAttribute("error","Sorry, Wrong Username or Password");
                return new ModelAndView("Login");
            }
            
        }
        
    }
}
