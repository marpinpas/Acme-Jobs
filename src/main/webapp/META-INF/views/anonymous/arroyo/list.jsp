<%@page language="java"%>

<%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="acme" tagdir="/WEB-INF/tags"%>

<acme:list readonly="true">
	<acme:list-column code="anonymous.arroyo.list.label.dateTimeBirth" path="dateTimeBirth" width="20%"/>
	<acme:list-column code="anonymous.arroyo.list.label.name" path="name" width="20%"/>
	<acme:list-column code="anonymous.arroyo.list.label.description" path="description" width="50%"/>
	<acme:list-column code="anonymous.arroyo.list.label.phone" path="phone" width="10%"/>
</acme:list>