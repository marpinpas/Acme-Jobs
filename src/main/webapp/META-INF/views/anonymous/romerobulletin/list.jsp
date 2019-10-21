<%@page language="java"%>

<%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="acme" tagdir="/WEB-INF/tags"%>

<acme:list readonly="true">
<acme:list-column code="anonymous.romerobulletin.list.label.name" path="name" width="15%" />
<acme:list-column code="anonymous.romerobulletin.list.label.surnames" path="surnames" width="25%" />
<acme:list-column code="anonymous.romerobulletin.list.label.place" path="place" width="15%" />
<acme:list-column code="anonymous.romerobulletin.list.label.type" path="type" width="15%" />
<acme:list-column code="anonymous.romerobulletin.list.label.fecha" path="fecha" width="25%" />
<acme:list-column code="anonymous.romerobulletin.list.label.free" path="free" width="5%" />
</acme:list>