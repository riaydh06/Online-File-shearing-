  <jsp:include page="Header.jsp"/>
  <div class="row login  ">
      <div class="col-md-6 col-md-offset-3  ">
          <div id="page">
                        <%if (session.getAttribute("error")==null) {
                            } else {%>
                            <h4 id="msg" style="color: red"><%= session.getAttribute("error")%></h4> 
                        <% session.setAttribute("error", ""); %>
                        <%}%>
                        <%if (session.getAttribute("error1")==null) {
                            } else {%>
                            <h4 id="msg" style="color: red"><%= session.getAttribute("error1")%></h4> 
                        <% session.setAttribute("error1", ""); %>
                        <%}%>
              <h1 class="page-header">Please Register</h1>                       
              <form class="" action="register.htm?name=null" method="post">
                  <div class="row">
                      <div class="form-group col-md-3 col-md-offset-1">
                          <label for="Username" class="">User name<font color="#FF0000">*</font></label>
                      </div>
                      <div class="form-group col-md-8">
                          <input required type="name"required="required" id="Username" name="username_box" class="form-control" placeholder="Username" >
                      </div>
                  </div>
                  <div class="row">
                      <div class="form-group col-md-3 col-md-offset-1">
                          <label for="Email" class="">Email<font color="#FF0000">*</font></label>
                      </div>
                      <div class="form-group col-md-8">
                          <input required type="Email" id="Email" name="email_box" class="form-control" placeholder="Email" >
                      </div>
                  </div>


                  <div class="row">
                      <div class="form-group col-md-3 col-md-offset-1">
                          <label for="Password" class="">Password<font color="#FF0000">*</font></label>
                      </div>
                      <div class="form-group col-md-8">
                          <input required type="password" id="Password" required="required" name="password_box" class="form-control" placeholder="Password" >
                      </div>
                  </div>
                  <div class="row">
                      <div class="form-group col-md-3 col-md-offset-1">
                          <label for="RePassword" class="">Re-Password<font color="#FF0000">*</font></label>
                      </div>
                      <div class="form-group col-md-8">
                          <input required type="password" id="RePassword" name="repassword_box" class="form-control" placeholder="Re-Password" >
                      </div>
                  </div> 
                  <div class="row">
                      <div class="form-group col-md-3 col-md-offset-1">
                          <label for="Cellphone_no" class="">Mobile<font color="#FF0000">*</font></label>
                      </div>
                      <div class="form-group col-md-8">
                          <input type="text" id="Cellphone_no" required="required" name="mobile_box" class="form-control" placeholder="Cellphone No." >
                      </div>
                  </div> 

                  <button type="submit" class="btn btn-success btn-block">Register</button>				
              </form>
          </div>
      </div>
  </div>
  <jsp:include page="Body.jsp"/>
  <jsp:include page="Footer.jsp"/> 