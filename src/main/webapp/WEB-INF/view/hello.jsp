<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<h4> Virtual Machine </h4>
<body>
<%

    String hello = (String) request.getAttribute("hello");
    String info = (String) request.getAttribute("info");
    String time = (String) request.getAttribute("time");
    String forTest = (String) request.getAttribute("forTest");

    out.println("message: <h2>" + hello + "</h2><br><br>");
    out.println("OS info: <h2>" + info + "</h2><br><br>");
    out.println("now: <h2>" + time + "</h2><br><br>");

    out.println("testing auto update: <h2>" + forTest + "</h2>" );

%>
</body>
</html>
