/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Hibernate.Login;
import Hibernate.NewHibernateUtil;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

/**
 *
 * @author SGR
 */
public class Activate implements Controller{

    @Override
    public ModelAndView handleRequest(HttpServletRequest hsr, HttpServletResponse hsr1) throws Exception {
        ModelAndView mv = new ModelAndView();
        Session sn = NewHibernateUtil.getSessionFactory().openSession();
        Transaction tx= null;
        tx=sn.beginTransaction();
        int i=Integer.parseInt(hsr.getParameter("ref"));
        Login tb= (Login) sn.get(Login.class,i);
        
        tb.setActivate("Activate");
        sn.update(tb);
        tx.commit();
        sn.close();
        return mv;
    }
    
}
