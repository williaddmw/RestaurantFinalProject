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
      <h1>Menu</h1>
    </jsp:attribute>
    <jsp:attribute name="footer">
      <p id="copyright">Copyright MSC Class 2017 John, Hong and Dianne</p>
    </jsp:attribute>
<jsp:body>
<table>
<c:forEach items="${menuList}" var="item">
    <tr> 
        <td>        
         <form action="placeorder" class="myform" method="POST">
	         <table  class="table table-responsive table-bordered">
	         <tr>
	         <th> Rest. Id </th>
	         <th> Item </th>
	         <th> Price </th>
	         <th> Qty </th>
	         <th> Dine In </th>
	         <th> Deliver </th>
	         <th> Pickup </th>
	         <th>Place Order</th>	         
             </tr>             
	         <tr>
	         <td><input type="text" name="restid" value="${item.restid}" class="form-control" readonly></td>
	         <td><input type="text" name="foodname" value="${item.foodname}" class="form-control long-text" readonly></td>
	         <td><input type="text" class="form-control small-text" value="${item.price}" readonly></td>
	         <td><input type="text" name="quantity" value="1" class="form-control small-text"/></td>
	         <td>
	         <select name="dinein" class="form-control">
	             <option value="N" label="No">
	             <option value="Y" label="Yes">          
	         </select>
	         </td>
	         <td>
	         <select name="delivery" class="form-control"> 
	             <option value="N" label="No">
	             <option value="Y" label="Yes">          
	         </select>
	         </td>
	         <td>
	         <select name="pickup" class="form-control">
	             <option value="Y" label="Yes">
	             <option value="N" label="No">
	         </select>
	         </td>
	         <td>
	         <input type="submit" value="Order Now" class="form-control">
	         </td>
	       </tr>
	      </table>
        </form>
       </td>
    </tr>
</c:forEach>
</table>
<div>${processMessage}</div>
</jsp:body>
</t:layout>
</html>