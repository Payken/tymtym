<jsp:include page="header.jsp" />
<%@ taglib prefix="customtag" uri="/tlds/customTag" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="main.staticContent.Etykiety" %>
<% if(request.getParameter("wprowadzWartosc")!=null) Etykiety.getInstance().setWprowadzWartosc(request.getParameter("wprowadzWartosc"));%>
<% if(request.getParameter("nazwaZbioru")!=null) Etykiety.getInstance().setNazwaZbioru(request.getParameter("nazwaZbioru"));%>
<% if(request.getParameter("srednia")!=null) Etykiety.getInstance().setSrednia(request.getParameter("srednia"));%>
<% if(request.getParameter("mediana")!=null) Etykiety.getInstance().setMediana(request.getParameter("mediana"));%>
<% if(request.getParameter("korelacja")!=null) Etykiety.getInstance().setKorelacja(request.getParameter("korelacja"));%>
<div class="container">
<form class="form-group" action="labels.jsp" method="POST" >
<customtag:CustomTag var="wprowadzWartosc"/>

    <input class="form-control" type="text" value="<%=Etykiety.getInstance().getWprowadzWartosc()%>" name="wprowadzWartosc">
<customtag:CustomTag var="nazwaZbioru"/>
    <input class="form-control" type="text" value="<%=Etykiety.getInstance().getNazwaZbioru()%>" name="nazwaZbioru">
<customtag:CustomTag var="srednia"/>
    <input class="form-control" type="text" value="<%=Etykiety.getInstance().getSrednia()%>" name="srednia">
<customtag:CustomTag var="mediana"/>
    <input class="form-control" type="text" value="<%=Etykiety.getInstance().getMediana()%>" name="mediana">
<customtag:CustomTag var="korelacja"/>
    <input class="form-control" type="text" value="<%=Etykiety.getInstance().getKorelacja()%>" name="korelacja">
    <input class="form-control" onclick="submit" type="submit" value="Select Subject" />
</form>
</div>
</body>
</html>
