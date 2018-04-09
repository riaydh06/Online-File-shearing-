<%@page import="java.util.ArrayList"%>
<%@page import="Hibernate.Login"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Online File Sharing System </title>
    <!-- Bootstrap -->
    <link href="css/bootstrap.min.css" rel="stylesheet"> 
     <link href="main.css" rel="stylesheet">
  </head>
  <body>
      <div class="container-fluid">
        <div class="row">
            <div class="logo">
                <div class="logo_body">
                    <h1><font color="white">Online File Sharing System </font></h1>
                </div>  
            </div>    
        </div>
          <div class="row">
              <nav class="navbar navbar-inverse" data-spy="affix" data-offset-top="197">
                  <div class="container-fluid">
                      <!-- Brand and toggle get grouped for better mobile display -->
                      <div class="navbar-header">
                          <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
                              <span class="sr-only">Toggle navigation</span>
                              <span class="icon-bar"></span>
                              <span class="icon-bar"></span>
                              <span class="icon-bar"></span>
                          </button>
                          <a class="navbar-brand" href="#">
                            <img alt="Brand" src="img/logo.png">
                        </a>
                      </div>

                      <!-- Collect the nav links, forms, and other content for toggling -->
                      <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                          <ul class="nav navbar-nav">
                              <li class="active"><a href="index2.htm">Home <span class="sr-only">(current)</span></a></li>
                              <li><a href="FileUploads.htm?name=FileUpload">File Upload</a></li>
                              <li><a href="show.htm">File Download</a></li>
                          </ul>
                          <% ArrayList<Login> info=(ArrayList<Login>)session.getAttribute("data"); %>
                          <ul class="nav navbar-nav navbar-right">  
                              <li class="dropdown">
                                  <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Hi <%=info.get(0).getUsername()  %> <span class="caret"></span></a>
                                  <ul class="dropdown-menu">
                                      <li><a href="logout.htm">Logout</a></li>
                                      
                                  </ul>
                              </li>
                          </ul>
                      </div><!-- /.navbar-collapse -->
                  </div><!-- /.container-fluid -->
              </nav> 
          </div>
