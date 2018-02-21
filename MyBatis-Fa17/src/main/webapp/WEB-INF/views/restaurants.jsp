
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@ page session="false" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<html>
<head>
	<title>Home</title>
</head>

<t:layout>
    <jsp:attribute name="header">
      <h1>Restaurants</h1>
    </jsp:attribute>
    <jsp:attribute name="footer">
      <p id="copyright">Copyright MSC Class 2017 John, Hong and Dianne</p>
    </jsp:attribute>
<jsp:body>

<table class="table table-responsive table-bordered">
<tr>
	<th> Name </th>
	<th> Type </th>
	<th> City </th>
	<th> phone</th>
	<th></th>
	<th></th>
	<th></th>
	<th></th>
</tr>
<c:forEach items="${restaurantdata}" var="rest">
    <tr>
        <td>${rest.rname}</td>
        <td>${rest.diningtype}</td>  
        <td>${rest.city}</td>  
        <td>${rest.phone}</td>
       <td><a href="/mscproject/ordermenu?restid=${rest.restid}"><span class="glyphicon glyphicon-arrowleft"></span> Order</a></td> 
       <td><a href="/mscproject/restaurantdetails?restid=${rest.restid}">See Details</a></td> 
       <td><a href="/mscproject/reviewedbyme?restid=${rest.restid}">Reviews</a></td> 
       <td><a href="/mscproject/addreview?restid=${rest.restid}">Add Review</a></td> 
            
    </tr>
</c:forEach>
</table> 

<div>${email}</div>
</jsp:body>
</t:layout>
<body>
</html>
