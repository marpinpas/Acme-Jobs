<%@page language="java"%>

<%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="acme" tagdir="/WEB-INF/tags"%>

<acme:form>
<acme:form-textbox code = "anonymous.romero.form.label.name" path = "name"/>
<acme:form-textbox code = "anonymous.romero.form.label.surnames" path = "surnames"/>
<acme:form-textbox code = "anonymous.romero.form.label.place" path = "place"/>
<acme:form-select code="anonymous.romero.form.label.type" path="type">
<acme:form-option code="anonymous.romero.form.label.type.educative" value="Educativa"/>
<acme:form-option code="anonymous.romero.form.label.type.deportive" value="Deportiva"/>
<acme:form-option code="anonymous.romero.form.label.type.business" value="Empresarial"/>
</acme:form-select>
<acme:form-moment code="anonymous.romero.form.label.fecha" path="fecha"/>

<acme:form-select code="anonymous.romero.form.label.free" path="free">
<acme:form-option code="anonymous.romero.form.label.free.yes" value="true"/>
<acme:form-option code="anonymous.romero.form.label.free.no" value="false"/>
</acme:form-select>

<acme:form-submit code="anonymous.romero.button.create" action="/anonymous/romero-bulletin/create"/>
 <acme:form-return code="anonymous.romero.button.return"/>
</acme:form>