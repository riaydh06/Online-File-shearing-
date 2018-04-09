<jsp:include page="Headerlog.jsp"/>
<div class="row login  ">
    <div class="col-md-6 col-md-offset-3  ">
        <div id="page">
            <%if (session.getAttribute("error")==null) {
            } else {%>
                <h4 id="msg" style="color: red"><%= session.getAttribute("error")%></h4> 
            <% session.setAttribute("error", ""); %>
            <%}%>
            
            <%if (session.getAttribute("uploadMsg")==null) {
                } else {%>
                <h4 id="msg" style="color: red"><%= session.getAttribute("uploadMsg")%></h4> 
            <% session.setAttribute("uploadMsg", ""); %>
            <%}%>
            
            <%if (session.getAttribute("uploadFail")==null) {
                } else {%>
                <h4 id="msg" style="color: red"><%= session.getAttribute("uploadFail")%></h4> 
            <% session.setAttribute("uploadFail", ""); %>
            <%}%>
            <h1 class="page-header">Upload Your File</h1>
            <form class="" action="Uploadfiles" method="post" enctype="multipart/form-data">
                <div class="row">
                    <div class="form-group col-md-3 col-md-offset-1">
                        <label for="Username" class="">Title<font color="#FF0000">*</font></label>
                    </div>
                    <div class="form-group col-md-8">
                        <input required type="name"required="required" id="Username" name="title" class="form-control" placeholder="Title" >
                    </div>
                </div>
                <div class="row">
                    <div class="form-group col-md-3 col-md-offset-1">
                        <label for="Email" class="">Description<font color="#FF0000">*</font></label>
                    </div>
                    <div class="form-group col-md-8">
                        <input required type="text" id="Email" name="description" class="form-control" placeholder="Description" >
                    </div>
                </div>


                <div class="row">
                    <div class="form-group col-md-3 col-md-offset-1">
                        <label for="Password" class="">File<font color="#FF0000">*</font></label>
                    </div>
                    <div class="form-group col-md-8">
                        <input required type="file" id="Password" required="required" name="file" class="form-control" placeholder="File" >
                    </div>
                </div>
                <div class="row">
                    <div class="form-group col-md-3 col-md-offset-1">
                        <label for="RePassword" class="">Date<font color="#FF0000">*</font></label>
                    </div>
                    <div class="form-group col-md-8">
                        <input required type="date" id="RePassword" name="date" class="form-control"  >
                    </div>
                </div> 
                

                <button type="submit" class="btn btn-success btn-block">Register</button>				
            </form>
        </div>
    </div>
</div>
<jsp:include page="Footer.jsp"/> 
