<%@ page import="main.staticContent.MyBean" %>
<%@ page import="main.staticContent.Logger" %>
<%@ taglib prefix="customtag" uri="/tlds/customTag" %>
<jsp:include page="header.jsp" />
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="main.staticContent.Logger" %>
<div class="container">

    <ul class="list-group ">

    <li class="list-group-item"><a href="add.jsp">dodawanie zbiorów</a></li>
    <li class="list-group-item"><a href="del.jsp">usuwaanie zbiorów</a> </li>
    <li class="list-group-item"><a href="stats.jsp">statystyki</a> </li>
    <li class="list-group-item"><a href="labels.jsp">etykiety</a> </li>
    <li class="list-group-item"><a href="parameters.jsp">parametry</a> </li>
    <li class="list-group-item"><a href="log">Historia</a> </li>

</ul></div>



</body>
</html>
