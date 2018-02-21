
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>

<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@ page session="false" %>
<html>
<head>
	<title>In class test page</title>
</head>

<t:layout>
    <jsp:attribute name="header">
      <h5>In class test page</h5> 
      <hr/>
    </jsp:attribute>
    <jsp:attribute name="footer">
      <p id="copyright">Copyright MSC Class 2017 John, Hong and Dianne</p>
    </jsp:attribute>
<jsp:body>

<div class="row">
<div class="col-md-12">
<form:form modelAttribute="testingdata" action="createtesting" class="myform">

<div class="form-group mytextboxes">
<form:label path="firstname" class="control-label col-md-2"> Customer Email</form:label>
<div class="col-md-10">
<form:input path="firstname" class="form-control" readonly="true"></form:input>
</div>
</div>

<hr/>
<div class="form-group mytextboxes">
 <input type = "submit" value = "Submit" class="form-control col-md-1" />
</div>
</form:form>
</div>
</div>
<hr/>
</jsp:body>
</t:layout>
</html>
