<%@page language="java"%>

<%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="acme" tagdir="/WEB-INF/tags"%>

<acme:form>
	<acme:form-textbox code="anonymous.arroyo.form.label.name" path="name"/>
	<acme:form-textarea code="anonymous.arroyo.form.label.description" path="description"/>
	<acme:form-textbox code="anonymous.arroyo.form.label.dateTimeBirth" path="dateTimeBirth"/>
	<acme:form-textbox code="anonymous.arroyo.form.label.phone" path="phone"/>
	
	<acme:form-submit code="anonymous.arroyo.form.button.create" action="/anonymous/arroyo/create"/>
	<acme:form-return code="anonymous.arroyo.form.button.return"/>
</acme:form>