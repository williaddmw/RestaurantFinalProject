
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
      <h1>Reviews</h1>
    </jsp:attribute>
    <jsp:attribute name="footer">
      <p id="copyright">Copyright MSC Class 2017 John, Hong and Dianne</p>
    </jsp:attribute>
<jsp:body>

<table class="table table-responsive table-bordered">
<tr>
	<th> Review Id </th>
	<th> Customer Email </th>
	<th> Rest Id </th>
	<th> Review Title</th>
	<th> Description</th>
	<th> Date</th>
	<th> Rating</th>
	<th></th>
	<th></th>
</tr>
<c:forEach items="${reviewList}" var="rev">
    <tr>
        <td>${rev.reviewid}</td>
        <td>${rev.custemail}</td>  
        <td>${rev.restid}</td>  
        <td>${rev.reviewtitle}</td>
        <td>${rev.reviewdescr}</td>
        <td>${rev.reviewdate}</td> 
        <td>${rev.rating}</td> 
       <td><a href="/mscproject/reviewdetail?reviewid=${rev.reviewid}">Edit</a></td> 
       <td><a href="/mscproject/restaurant?restid=${rev.restid}">Restaurant Details</a></td> 
            
    </tr>
</c:forEach>
</table> 

<div>${email}</div>
</jsp:body>
</t:layout>
<body>
</html>
