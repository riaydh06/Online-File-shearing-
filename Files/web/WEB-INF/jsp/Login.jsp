<jsp:include page="Header.jsp"/>
<div class="row login">
    <div class="col-md-4 col-md-offset-4 page">
        <div id="page">
                       <%if (session.getAttribute("error")==null) {
                            } else {%>
                            <h4 id="msg" style="color: red"><%= session.getAttribute("error")%></h4> 
                        <% session.setAttribute("error", ""); %>
                        <%}%>
                        <%if (session.getAttribute("register")==null) {
                            } else {%>
                            <h4 id="msg" style="color: red"><%= session.getAttribute("register")%></h4> 
                        <% session.setAttribute("register", ""); %>
                        <%}%>
            <h1 class="page-header">Please Login</h1>
            <form action="login.htm?name=null" method="post">
                <div class="form-group" >
                    <label for="exampleInputEmail1">User Name</label>
                    <input type="name" class="form-control" name="user" id="exampleInputEmail1" placeholder="User Name">
                </div>
                <div class="form-group">
                    <label for="exampleInputPassword1">Password</label>
                    <input type="password" class="form-control" name="pass" id="exampleInputPassword1" placeholder="Password">
                </div>

                <button type="submit" class="btn btn-default btn-block">Submit</button>
            </form>
        </div>
    </div>
</div>
<jsp:include page="Body.jsp"/>
<jsp:include page="Footer.jsp"/> 
