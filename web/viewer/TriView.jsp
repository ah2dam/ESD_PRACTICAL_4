<%-- 
    Document   : TriView
    Created on : 19-Nov-2020, 14:51:13
    Author     : zZMerciZz
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Tri-view Page</title>
    </head>
    <body>
        <h1>The result: </h1>
        
        <%=request.getAttribute("nums")%>
        
        <h2>
            <% String str = (String)request.getAttribute("msg");
                out.println(str);
            %>            
        </h2>
    </body>
</html>
