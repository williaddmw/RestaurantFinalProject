<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@tag description="Overall Page template" pageEncoding="UTF-8"%>
<%@attribute name="header" fragment="true" %>
<%@attribute name="footer" fragment="true" %>
<html>
<head>
	<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css" rel="stylesheet">
	<link href="resources/css/site.css" rel="stylesheet">
	<link href="<c:url value="/resources/css/main.css" />" rel="stylesheet">
</head>
  <body>
    <div id="pageheader">
<div class="container-fluid">
<h2>Welcome to Dianne, Hong and John Restaurant Advisor </h2>
<nav class="navbar navbar-default" role="navigation">
    <div class="navbar-header">
        <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
        </button>
        <a class="navbar-brand" href="/mscproject/home">Home</a>
    </div>
    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
        <ul class="nav navbar-nav">
            <li class="active"><a href="/mscproject/restaurants">Restaurants</a></li>
            <li><a href="/mscproject/restaurants">Reviews</a></li>
            <li><a href="/mscproject/restaurants">Orders</a></li>
            <li><a href="/mscproject/logout">Logout</a></li>       
            <li class="dropdown">
                <a href="#" class="dropdown-toggle" data-toggle="dropdown">Others<b class="caret"></b></a>
                <ul class="dropdown-menu">
                    <li><a href="/mscproject/restaurants">Favorites</a></li>
                    <li><a href="/mscproject/trending">Trending</a></li>
                    <li><a href="/mscproject/login">Login</a></li>
                    <li><a href="/mscproject/testing">Testing</a></li>
                    <li class="divider"></li>                    
                </ul>
            </li>
        </ul>
        <div class="col-sm-3 col-md-3 pull-right">
            <form class="navbar-form" action="restaurantsbyname" role="search">
                <div class="input-group">
                    <input type="text" class="form-control" placeholder="Search" name="namesearch">
                    <div class="input-group-btn">
                        <button class="btn btn-default" type="submit" style="height:34px"><i class="glyphicon glyphicon-search"></i></button>
                    </div>
                </div>
            </form>
        </div>        
    </div>
</nav>

<!-- Search Navbar - END -->

</div>
    
      <jsp:invoke fragment="header"/>
    </div>
    <div id="body">
      <jsp:doBody/>
    </div>
    <div id="pagefooter">
      <jsp:invoke fragment="footer"/>
      <p><a href="/mscproject/home">Home</a></p>
    </div>

<script src="webjars/jquery/1.9.1/jquery.min.js"> </script>
<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"> </script>
    
  </body>
</html>