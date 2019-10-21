

<%@page language="java"%>

<%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="acme" tagdir="/WEB-INF/tags"%>

<acme:form>
	<acme:form-textbox code="anonymous.blanco.form.label.name" path="name"/>
	<acme:form-textbox code="anonymous.blanco.form.label.email" path="email"/>
	<acme:form-textbox code="anonymous.blanco.form.label.profession" path="profession"/>
	<acme:form-textbox code="anonymous.blanco.form.label.hobby" path="hobby"/>
	<acme:form-moment code="anonymous.blanco.form.label.startdate" path="startdate"/>
	
	
	<acme:form-submit code="anonymous.blanco.button.create" action="/anonymous/blanco/create"/>
  	<acme:form-return code="anonymous.blanco.button.return"/>
  	
  	
</acme:form>
