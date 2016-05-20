<%@ page import="main.staticContent.Params" %><%--
  Created by IntelliJ IDEA.
  User: fdarmoch
  Date: 2016-04-16
  Time: 14:22
  To change this template use File | Settings | File Templates.
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="CustomTag" uri="/WEB-INF/tlds/customTag.tld"%>

<html>
<head>
    <jsp:include page="import.jsp" />
    <title>Timy Projekt</title>
</head>

<body     class="<%=  Params.getInstance().getClassName()%> <%=  Params.getInstance().getLabels()%>">

<%--<%@ page import="main.staticContent.Etykiety" %>--%>
<%--<% if(request.getParameter("label")!=null) Etykiety.getInstance().setEtykietaCustomTag(request.getParameter("label"));%>--%>
<%--<form action="index.jsp" method="POST" >--%>
<%--<input type="text" name="label">--%>
<%--<input type="submit" value="Select Subject" />--%>
<%--</form>--%>
<%--<CustomTag:Godzina/>--%>
<%--<CustomTag:CustomTag/>--%>


<div class="header mynav">
    <div class="container"> <a href="index.jsp" class="tab">Strona Główna</a> </div>


</div>