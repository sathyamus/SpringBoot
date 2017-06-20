<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<h1>Vehicles page</h1>

<h3>Vehicles details - ${vehicle}</h3>

<a href="newVehicle.html" > Add Vehicle  </a>

<ul>
	<c:forEach items="${vehicles}" var="vehicle">
	
		<li>${vehicle.id}</li>
		<li>${vehicle.name}</li>
		<li>${vehicle.odometer}</li>

		<br />
	</c:forEach>
</ul>


