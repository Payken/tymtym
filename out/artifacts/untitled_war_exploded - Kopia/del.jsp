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

<%=  Sets.getInstance().delSet(request.getParameter("set")) %>


<%=  Sets.getInstance().getMyMap().toString() %>


<div class="container">
    <h2>Usuwanie zbiorów</h2>

    <div class="tab-content">
        <div id="home" class="tab-pane fade in active">
            <h3>Usuń zbiór</h3>
            <form role="form"  action="del.jsp" method="POST">
                <div class="form-group">
                    <select name="set" class="form-control">
                        <c:forEach items="${bean.sets.myMap.keySet()}" var="name">
                            <option class="form-control" value="${name}">${name}</option>
                        </c:forEach>
                    </select>
                    <button type="submit" class="btn btn-default">Submit</button>
                </div>
            </form>
        </div>

    </div>
</div>




<jsp:include page="footer.jsp" />