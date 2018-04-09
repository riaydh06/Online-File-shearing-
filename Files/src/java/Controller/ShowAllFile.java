/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Hibernate.File;
import Hibernate.NewHibernateUtil;
import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

/**
 *
 * @author SGR
 */
public class ShowAllFile implements Controller{

    @Override
    public ModelAndView handleRequest(HttpServletRequest hsr, HttpServletResponse hsr1) throws Exception {
        ModelAndView mv = new ModelAndView("ShowAllFile");
        HttpSession ssn=hsr.getSession();
        Session ses = NewHibernateUtil.getSessionFactory().openSession();
        ArrayList<File> file =  new ArrayList();
        Transaction tn = ses.beginTransaction();
        file = (ArrayList<File>) ses.createQuery("from File").list();
        tn.commit();
        ses.close();
        ssn.setAttribute("file", file);
        return mv;
    }
    
}