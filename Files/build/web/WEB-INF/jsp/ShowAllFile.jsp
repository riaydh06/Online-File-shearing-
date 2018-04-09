<%@page import="Hibernate.File"%>
<%@page import="java.util.ArrayList"%>
<jsp:include page="Headerlog.jsp"/>
<div class="row login  ">
    <div class="col-md-10 col-md-offset-1  ">
        <div id="page">
            <h1 class="page-header">All Files</h1>
            <div class="table-responsive">
                <table class="table table-hover table-striped">
                   <tr class="danger">
                       <th>Title</th>
                       <th>User Name</th>
                       <th>File</th>
                       <th>Description</th>
                       <th>Rating</th>
                       <th>Date</th>
                       <th>Download</th>
                   <tr>
                 <% ArrayList<File> fil = (ArrayList<File>)session.getAttribute("file"); %>
                   <tr>
                      <% for (int i = 0; i < fil.size(); i++) {%>
                       <td><%= fil.get(i).getTitle()%></td>
                       <td><%= fil.get(i).getUsername()%></td>
                       <td><%= fil.get(i).getFile()%></td>
                       <td><%= fil.get(i).getDescription()%></td>
                       <td><%= fil.get(i).getRating()%></td>
                       <td><%= fil.get(i).getDate()%></td>
                       <td><a href="download.htm">Download</a></td>
                   </tr>
                   <%}%>
                </table>
            </div>
        </div>
    </div>
</div>
<jsp:include page="Footer.jsp"/>
