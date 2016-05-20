<jsp:include page="header.jsp" />
<jsp:useBean id="bean" class="main.staticContent.MyBean"/>
<%@ taglib prefix="customtag" uri="/tlds/customTag" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="main.staticContent.Sets"  %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%--<%--%>

    <%--if(request.getParameter("name")!=null) Sets.getInstance().addSet(request.getParameter("name"));--%>
    <%--System.out.println(request.getParameter("name"));--%>

<%--%>--%>
<%--<%= request.getParameter("name")%>--%>

<%=  Sets.getInstance().addSet(request.getParameter("name")) %>
<%=  Sets.getInstance().addValue(request.getParameter("set"),request.getParameter("value")) %>

<%=  Sets.getInstance().getMyMap().toString() %>


<div class="container">
    <h2>Operacje dodawania zbiorów i wartości</h2>
    <ul class="nav nav-tabs">
        <li class="active"><a data-toggle="tab" href="#home">Dodaj zbiór</a></li>
        <li><a data-toggle="tab" href="#menu1">Dodaj wartość</a></li>

    </ul>

    <div class="tab-content">
        <div id="home" class="tab-pane fade in active">
            <h3>Dodaj zbiór</h3>
            <form role="form" action="add.jsp" method="POST">
                <div class="form-group">
                <label for="name"><customtag:CustomTag var="nazwaZbioru"/></label>
                <input id="name" name="name" class="form-control"/>
            </div>

            <button onclick="submit" type="submit" class="btn btn-default">Submit</button>
            </form>
        </div>
        <div id="menu1" class="tab-pane fade">
            <h3>Dodaj wartość do zbioru</h3>
<form role="form"  action="add.jsp" method="POST">
    <div class="form-group">
<select name="set" class="form-control">
                <c:forEach items="${bean.sets.myMap.keySet()}" var="name">
                <option class="form-control" value="${name}">${name}</option>
                </c:forEach>
</select>
        <label for="value"><customtag:CustomTag var="wprowadzWartosc"/></label>
        <input id="value" name="value" class="form-control"/>
    <button type="submit" class="btn btn-default">Submit</button>
        </div>
    </form>
        </div>
    </div>
</div>




<jsp:include page="footer.jsp" />