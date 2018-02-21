
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

<form:form modelAttribute="customer" action="/mscproject/adduser" method="POST" class="myform" >
<div class="row">
<div class="col-md-12">

<div class="col-md-6">
<div class="form-group mytextboxes">
<form:label path="fname" class="control-label col-md-3">First Name</form:label>
<div class="col-md-9">
<form:input path="fname" class="form-control"  required="true"></form:input>
</div>
</div>

<div class="form-group mytextboxes">
<form:label path="minit" class="control-label col-md-3">Middle Name</form:label>
<div class="col-md-9">
<form:input path="minit" class="form-control"></form:input>
</div>
</div>

<div class="form-group mytextboxes">
<form:label path="lname" class="control-label col-md-3"> Last Name</form:label>
<div class="col-md-9">
<form:input path="lname" class="form-control"  required="true"></form:input>
</div>
</div>



<div class="form-group mytextboxes">
<form:label path="email" class="control-label col-md-3"> Email</form:label>
<div class="col-md-9">
<form:input path="email" class="form-control" required="true"></form:input>
</div>
</div>

<div class="form-group mytextboxes">
<form:label path="password" class="control-label col-md-3"> Password</form:label>
<div class="col-md-9">
<form:input path="password" type="password" class="form-control" required="true"></form:input>
</div>
</div>

<div class="form-group mytextboxes">
<form:label path="" class="control-label col-md-3"></form:label>
<div class="col-md-9">
<form:input type="submit" path="" value="Submit" class="btn col-md-2" />
</div>
</div>

</div>
<div class="col-md-6">
<div class="form-group mytextboxes">
<form:label path="phone" class="control-label col-md-3"> Phone</form:label>
<div class="col-md-9">
<form:input path="phone" class="form-control" ></form:input>
</div>
</div>

<div class="form-group mytextboxes">
<form:label path="Zip" class="control-label col-md-3"> Zip</form:label>
<div class="col-md-9">
<form:input path="Zip" class="form-control"></form:input>
</div>
</div>

<div class="form-group mytextboxes">
<form:label path="streetno" class="control-label col-md-3"> Street No</form:label>
<div class="col-md-9">
<form:input path="streetno" class="form-control"></form:input>
</div>
</div>

<div class="form-group mytextboxes">
<form:label path="streetname" class="control-label col-md-3"> Street Name</form:label>
<div class="col-md-9">
<form:input path="streetname" class="form-control"></form:input>
</div>
</div>

<div class="form-group mytextboxes">
<form:label path="city" class="control-label col-md-3"> City</form:label>
<div class="col-md-9">
<form:input path="city" class="form-control"></form:input>
</div>
</div>

<div class="form-group mytextboxes">
<form:label path="state" class="control-label col-md-3"> State</form:label>
<div class="col-md-9">
<form:input path="State" class="form-control"></form:input>
</div>
</div>
</div>
</div>
</div>
</form:form>
<hr/>
</html>
