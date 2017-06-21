<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>


<h1>Vehicles page</h1>

<h3>Vehicles details - ${vehicle}</h3>

<a href="newVehicle.html" > Add Vehicle  </a> &nbsp; &nbsp; &nbsp; &nbsp;

<form action="/logout" method="post">
<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/> 
	<input type="submit" value="Sign Out"/> 
		&nbsp; &nbsp; &nbsp; &nbsp;
	
	
	<a href="/logout" > Logout </a>
	<!-- Will not work, as it can't pass the csrf token -->
	<!-- to make it work, disable the csrf token in spring config -->	
</form>
        
<ul>
	<c:forEach items="${vehicles}" var="vehicle">
	
		<li>${vehicle.id}</li>
		<li>${vehicle.name}</li>
		<li>${vehicle.odometer}</li>

		<br />
	</c:forEach>
</ul>


