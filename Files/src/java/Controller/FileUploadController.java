/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Hibernate.File;
import Hibernate.Login;
import Hibernate.NewHibernateUtil;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class FileUploadController implements Controller{

    @Override
    public ModelAndView handleRequest(HttpServletRequest hsr, HttpServletResponse hsr1) throws Exception {
       Transaction tx = null;
       ModelAndView mv = new ModelAndView("FileUpload");
       HttpSession registerSSn=hsr.getSession();
       if(hsr.getParameter("name").equals("FileUpload")){
          HttpSession sessionhttp = hsr.getSession();
          return new ModelAndView("FileUpload");
       }else{
       HttpSession ssn = hsr.getSession();
       String title = ssn.getAttribute("title").toString();
       String description =ssn.getAttribute("description").toString();
       String file1 =ssn.getAttribute("file").toString();   
       Date date=new SimpleDateFormat("yyyy-MM-dd").parse((String) ssn.getAttribute("date")); 
       Session session = NewHibernateUtil.getSessionFactory().openSession();
       session.beginTransaction();
       ArrayList<Login> username = (ArrayList<Login>) ssn.getAttribute("data");
       File file = new File("riad",title,description,file1, (float) 1.10,date);
       session.save(file);
       session.getTransaction().commit();
       ssn.setAttribute("msg", "Submitted");
       return new ModelAndView("FileUpload");
       }
       
    }
    
}

