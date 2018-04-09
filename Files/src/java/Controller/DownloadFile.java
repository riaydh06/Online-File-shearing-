/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.io.FileInputStream;
import static java.lang.System.out;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

/**
 *
 * @author SGR
 */
public class DownloadFile implements Controller{
     
     
    @Override
    public ModelAndView handleRequest(HttpServletRequest hsr, HttpServletResponse response) throws Exception {
        ModelAndView mv = new ModelAndView("ShowAllFile");
        String filename = "Heap Sort _ GeeksforGeeks.mp4";   
        String filepath = "upload/";   
        response.setContentType("APPLICATION/OCTET-STREAM");   
        response.setHeader("Content-Disposition","attachment; filename=\"" + filename + "\"");   

        FileInputStream fileInputStream = new FileInputStream(filepath + filename);  

        int i;   
        while ((i=fileInputStream.read()) != -1) {  
        out.write(i);   
        }   
        fileInputStream.close();  
        return mv;
    }
    
}
