package Hibernate;
// Generated Apr 10, 2017 12:14:36 PM by Hibernate Tools 4.3.1



/**
 * Login generated by hbm2java
 */
public class Login  implements java.io.Serializable {


     private Integer id;
     private String username;
     private String email;
     private String password;
     private String mobile;
     private String activate;

    public Login() {
    }

    public Login(String username, String email, String password, String mobile, String activate) {
       this.username = username;
       this.email = email;
       this.password = password;
       this.mobile = mobile;
       this.activate = activate;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public String getUsername() {
        return this.username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    public String getMobile() {
        return this.mobile;
    }
    
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
    public String getActivate() {
        return this.activate;
    }
    
    public void setActivate(String activate) {
        this.activate = activate;
    }




}

