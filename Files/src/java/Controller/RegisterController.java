/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Hibernate.Login;
import Hibernate.NewHibernateUtil;
import java.util.ArrayList;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
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
public class RegisterController implements Controller{

    @Override
    public ModelAndView handleRequest(HttpServletRequest hsr, HttpServletResponse hsr1) throws Exception {
        Transaction tx=null;
        ModelAndView mv = new ModelAndView("Register");
        HttpSession registerSSn=hsr.getSession();
        try{
        if(hsr.getParameter("name").equals("Register")){
            
            registerSSn.setAttribute("register", "");
            return new ModelAndView("Register");
        }else{
            
           HttpSession regsSession=hsr.getSession();
           String username = hsr.getParameter("username_box");
           String email = hsr.getParameter("email_box");
           String password = hsr.getParameter("password_box");
           String repassword = hsr.getParameter("repassword_box");
           String mobile = hsr.getParameter("mobile_box");

           if(!password.equals(repassword))
           {
               regsSession.setAttribute("error", "Password mismatch");
               return mv;
           }
           else{
           Session session = NewHibernateUtil.getSessionFactory().openSession();
           session.beginTransaction();
           Login reg = new Login(username,email,password,mobile,"Deactivate");
           session.save(reg);
           session.getTransaction().commit();
           registerSSn.setAttribute("register","Registration Successful");
           
          
            String email2 = hsr.getParameter("email_box");
        //Email coded Start
                final String username1 = "riaydh08@gmail.com";
		final String password1 = "riaydh2005";

		Properties props = new Properties();
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.port", "587");

		javax.mail.Session session1 = javax.mail.Session.getInstance(props,
		  new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(username1, password1);
			}
		  });

		try {

			Message message = new MimeMessage(session1);
			message.setFrom(new InternetAddress("riaydh08@gmail.com"));
			message.setRecipients(Message.RecipientType.TO,
                                
		        InternetAddress.parse(email2));
			message.setSubject("Testing Subject");
			message.setText("Click the bellow link and active your account,"
				+ "\n\n please!");
                        message.setContent("<a href='activate.htm'>Active</a>","text/html" );  

			Transport.send(message);

			System.out.println("Done");

		} catch (MessagingException e) {
			throw new RuntimeException(e);
		}
        //Email coded End
        
           mv= new ModelAndView("Login");
           return mv;
           }
    }
        }catch(Exception e){
        HttpSession ssn = hsr.getSession();
        ssn.setAttribute("error1", "Username or Email is allredy registered");
        return new ModelAndView("Register");
        }
    
}
}
