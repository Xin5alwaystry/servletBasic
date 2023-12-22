<%@ page import="java.util.List" %>
<%@ page import="java.util.Iterator" %><%--
  Created by IntelliJ IDEA.
  User: xin5
  Date: 2023/12/3
  Time: 10:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1 align="center">Beer Recommendations JSP</h1>
<p>
<%
        List styles = (List) request.getAttribute("styles");
        Iterator iterator = styles.iterator();
        while (iterator.hasNext()) {
            out.print("<br>try: " + iterator.next());
        }
%>
</body>
</html>
