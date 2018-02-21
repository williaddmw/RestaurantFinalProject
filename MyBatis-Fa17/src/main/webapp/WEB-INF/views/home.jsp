
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@ page session="false" %>
<html>
<head>
	<title>User Login</title>
	<head>
	<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css" rel="stylesheet">
	<link href="resources/css/site.css" rel="stylesheet">
	<link href="<c:url value="/resources/css/main.css" />" rel="stylesheet">
</head>
</head>

<div class="row">
<div class="col-md-12">
<form:form modelAttribute="userloggedon" action="/mscproject/login" method="POST" class="myform">

<div class="form-group mytextboxes">
<form:label path="email" class="control-label col-md-2"> Email</form:label>
<div class="col-md-10">
<form:input path="email" class="form-control" required="true"></form:input>
</div>
</div>

<div class="form-group mytextboxes">
<form:label path="password" class="control-label col-md-2"> Password</form:label>
<div class="col-md-10">
<form:input path="password" type="password" class="form-control" required="true"></form:input>
</div>
</div>
 <br/>
<div class="form-group mytextboxes">
<form:label path="" class="control-label col-md-2"></form:label>
<div class="col-md-10">
<form:input type="submit" path="" value="Login" class="btn col-md-2" />
<span>
<a href="/mscproject/registeruser" class="btn medium-btn">Register</a>
</span>
</div>

</div>
</form:form>

</div>
</div>
<hr/>
</html>
