<jsp:include page="header.jsp" />
<%@ taglib prefix="customtag" uri="/tlds/customTag" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="main.staticContent.Params" %>

<div class="container">
    <h2>Ustawienia</h2>

    <%   if(request.getParameter("fileformat")!=null)Params.getInstance().setLogFileFormat(request.getParameter("fileformat"));%>
    <%   if(request.getParameter("background")!=null)Params.getInstance().setClassName(request.getParameter("background"));%>
    <%   if(request.getParameter("labels")!=null)Params.getInstance().setLabels(request.getParameter("labels"));%>
    <%   if(request.getParameter("correlation")!=null)Params.getInstance().setCorrelationIsTurnOn(Boolean.parseBoolean(request.getParameter("correlation")));%>
    <div class="tab-content">
        <div id="home" class="tab-pane fade in active">

            <form role="form"  action="parameters.jsp" method="POST">

                <div class="form-group">
                    <label for="fileformat"><customtag:CustomTag var="rozszerzenie"/></label>
                    <select id="fileformat" name="fileformat" class="form-control">

                        <option class="form-control" value="csv">CSV</option>
                        <option class="form-control" value="txt">TXT</option>

                    </select>

                </div>
                <div class="form-group">
                    <label for="correlation"><customtag:CustomTag var="correlation"/></label>
                    <select id="correlation" name="fileformat" class="form-control">

                        <option class="form-control" value="true">włączona</option>
                        <option class="form-control" value="false">wyłączona</option>

                    </select>

                </div>
                <div class="form-group">
                    <label for="background"><customtag:CustomTag var="background"/></label>
                    <select id="background" name="background" class="form-control">

                        <option class="form-control" value="A">białe</option>
                        <option class="form-control" value="B">nie białe</option>

                    </select>

                </div>
                <div class="form-group">
                    <label for="labels"><customtag:CustomTag var="labels"/></label>
                    <select id="labels" name="labels" class="form-control">

                        <option class="form-control" value="C">zwykle</option>
                        <option class="form-control" value="D">czerwone</option>

                    </select>

                </div>
                <button type="submit" class="btn btn-default">Submit</button>
            </form>
        </div>

    </div>
</div>


<jsp:include page="footer.jsp" />