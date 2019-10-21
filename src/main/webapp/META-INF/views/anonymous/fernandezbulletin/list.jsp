<%@page language="java"%>

<%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="acme" tagdir="/WEB-INF/tags"%>

<acme:list readonly="true">
	<acme:list-column code="anonymous.fernandezbulletin.list.label.name" path="name" width="20%"/>
	<acme:list-column code="anonymous.fernandezbulletin.list.label.country" path="country" width="10%"/>
	<acme:list-column code="anonymous.fernandezbulletin.list.label.email" path="email" width="20%"/>
	<acme:list-column code="anonymous.fernandezbulletin.list.label.birthday" path="birthday" width="20%"/>
	<acme:list-column code="anonymous.fernandezbulletin.list.label.address" path="address" width="30%"/>
</acme:list>