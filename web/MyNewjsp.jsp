<%-- 
    Document   : MyNewjsp
    Created on : 12-Nov-2020, 14:37:21
    Author     : zZMerciZz
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Greenback</title>
    </head>
    <body>
        <h1>My first embedded java in a JSP web page!</h1>
        The time and date of now is <%=new java.util.Date() %> <br>
        The operating system is <%= System.getProperty("os.name") %> <br>
        <% out.print(System.getenv("USERNAME")); %> <br>
    </body>
</html>
