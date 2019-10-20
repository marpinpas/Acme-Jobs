<%--
- form.jsp
-
- Copyright (c) 2019 Rafael Corchuelo.
-
- In keeping with the traditional purpose of furthering education and research, it is
- the policy of the copyright owner to permit non-commercial use and redistribution of
- this software. It has been tested carefully, but it is not guaranteed for any particular
- purposes.  The copyright owner does not offer any warranties or representations, nor do
- they accept any liabilities with respect to them.
--%>

<%@page language="java"%>

<%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="acme" tagdir="/WEB-INF/tags"%>

<acme:list readonly="true">
	<acme:list-column code="anonymous.Blanco.list.label.name" path="name" width="204"/>
	<acme:list-column code="anonymous.Blanco.list.label.email" path="email" width="204"/>
	<acme:list-column code="anonymous.Blanco.list.label.profession" path="profession" width="204"/>
	<acme:list-column code="anonymous.Blanco.list.label.hobby" path="hobby" width="604"/>
	<acme:list-column code="anonymous.Blanco.list.label.startdate" path="startdate" width="204"/>




</acme:list>
