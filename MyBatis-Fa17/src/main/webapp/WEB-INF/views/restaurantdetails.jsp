
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@ page session="false" %>
<html>
<head>
	<title>Restaurant Details</title>
</head>

<t:layout>
    <jsp:attribute name="header">
      <h5>Restaurant Details</h5> 
      <hr/>
    </jsp:attribute>
    <jsp:attribute name="footer">
      <p id="copyright">Copyright MSC Class 2017 John, Hong and Dianne</p>
    </jsp:attribute>
<jsp:body>

<div class="row">
<div class="col-md-12">
<form:form modelAttribute="restaurantdata" class="myform">

<div class="form-group mytextboxes">
<form:label path="rname" class="control-label col-md-2"> Rest Name</form:label>
<div class="col-md-10">
<form:input path="rname" class="form-control"></form:input>
</div>
</div>

<div class="form-group mytextboxes">
<form:label path="diningtype" class="control-label col-md-2"> Dining Type</form:label>
<div class="col-md-10">
<form:input path="diningtype" class="form-control"></form:input>
</div>
</div>

<div class="form-group mytextboxes">
<form:label path="email" class="control-label col-md-2"> Email</form:label>
<div class="col-md-10">
<form:input path="email" class="form-control"></form:input>
</div>
</div>

<div class="form-group mytextboxes">
<form:label path="phone" class="control-label col-md-2"> Phone</form:label>
<div class="col-md-10">
<form:input path="phone" class="form-control"></form:input>
</div>
</div>

<div class="form-group mytextboxes">
<form:label path="streetno" class="control-label col-md-2"> Street No</form:label>
<div class="col-md-10">
<form:input path="streetno" class="form-control"></form:input>
</div>
</div>

<div class="form-group mytextboxes">
<form:label path="streetname" class="control-label col-md-2"> Street Name</form:label>
<div class="col-md-10">
<form:input path="streetname" class="form-control"></form:input>
</div>
</div>

<div class="form-group mytextboxes">
<form:label path="email" class="control-label col-md-2"> Email</form:label>
<div class="col-md-10">
<form:input path="email" class="form-control"></form:input>
</div>
</div>

<div class="form-group mytextboxes">
<form:label path="city" class="control-label col-md-2"> City</form:label>
<div class="col-md-10">
<form:input path="city" class="form-control"></form:input>
</div>
</div>

<div class="form-group mytextboxes">
<form:label path="state" class="control-label col-md-2"> State</form:label>
<div class="col-md-10">
<form:input path="State" class="form-control"></form:input>
</div>
</div>

<div class="form-group mytextboxes">
<form:label path="Zip" class="control-label col-md-2"> Zip</form:label>
<div class="col-md-10">
<form:input path="Zip" class="form-control"></form:input>
</div>
</div>

<div class="form-group mytextboxes">
<form:label path="pricerange" class="control-label col-md-2"> Price Range</form:label>
<div class="col-md-10">
<form:input path="pricerange" class="form-control"></form:input>
</div>
</div>

<div class="form-group mytextboxes">
<form:label path="deliveryflag" class="control-label col-md-2"> Do we deliver?</form:label>
<div class="col-md-10">
<form:input path="deliveryflag" class="form-control"></form:input>
</div>
</div>

<div class="form-group mytextboxes">
<form:label path="outdoorseatingflag" class="control-label col-md-2">Room for outdoor</form:label>
<div class="col-md-10">
<form:input path="outdoorseatingflag" class="form-control"></form:input>
</div>
</div>

</form:form>

</div>
</div>
<hr/>
</jsp:body>
</t:layout>
</html>
