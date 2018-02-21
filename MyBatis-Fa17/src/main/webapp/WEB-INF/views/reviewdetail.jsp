
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>

<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@ page session="false" %>
<html>
<head>
	<title>Restaurant Review</title>
</head>

<t:layout>
    <jsp:attribute name="header">
      <h5>Restaurant Review</h5> 
      <hr/>
    </jsp:attribute>
    <jsp:attribute name="footer">
      <p id="copyright">Copyright MSC Class 2017 John, Hong and Dianne</p>
    </jsp:attribute>
<jsp:body>

<div class="row">
<div class="col-md-12">
<form:form modelAttribute="review" action="postpeview" class="myform">


<div class="form-group mytextboxes">
<form:label path="restid" class="control-label col-md-2"> Restaurant Id</form:label>
<div class="col-md-10">
<form:input path="restid" class="form-control" readonly="true"></form:input>
</div>
</div>

<div class="form-group mytextboxes">
<form:label path="custemail" class="control-label col-md-2"> Customer Email</form:label>
<div class="col-md-10">
<form:input path="custemail" value="${email}" class="form-control" readonly="true"></form:input>
</div>
</div>

<div class="form-group mytextboxes">
<form:label path="reviewtitle" class="control-label col-md-2"> Title</form:label>
<div class="col-md-10">

<form:select path="reviewtitle" class="form-control">
   <form:option value="NONE" label="--- Select ---"/>
   <form:option value="Satisfactory Service" label="Satisfactory Service"/>
   <form:option value="Lacking in some erea" label="Lacking in some erea"/>
   <form:option value="Just met our expectations" label="Just met our expectations"/>
   <form:option value="Poor Service" label="Poor Service"/>   
</form:select>
</div>
</div>

<div class="form-group mytextboxes">
<form:label path="reviewdescr" class="control-label col-md-2"> Description</form:label>
<div class="col-md-10">
<form:input path="reviewdescr" class="form-control"></form:input>
</div>
</div>

<div class="form-group mytextboxes">
<form:label path="rating" class="control-label col-md-2"> Rating</form:label>
<div class="col-md-10">
<form:input type="textarea" path="rating" class="form-control"></form:input>
</div>
</div>

<div class="form-group mytextboxes">
<form:label path="rating" class="control-label col-md-2"> </form:label>
<div class="col-md-10">
<input type = "submit" value = "Submit" class="form-control btn" />
</div>
 
</div>

</form:form>
<div> ${serviceError}</div>
</div>
</div>
<hr/>
</jsp:body>
</t:layout>
</html>
