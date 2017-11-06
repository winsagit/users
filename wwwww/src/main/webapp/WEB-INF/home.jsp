<%@ page import="java.util.ArrayList" %>
<%@ page import="model.User" %><%--
  Created by IntelliJ IDEA.
  User: student
  Date: 30.10.2017
  Time: 13:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <title>Title</title>

</head>
<body>
<h1>Таблица пользователей</h1>
<table border="1">
    <thead>
        <tr>
            <th WIDTH="10%">id</th>
            <th WIDTH="40%">login</th>
            <th width="40%">pass</th>
        </tr>
    </thead>
    <tbody>
    <%  ArrayList<User> users = (ArrayList<User>) request.getAttribute("users");
        for(int i = 0; i < users.size(); i++) { %>
        <tr>
            <td><%=users.get(i).getId() %></td>
            <td><%=users.get(i).getLogin() %></td>
            <td><%=users.get(i).getPass() %></td>
        </tr>
    <% } %>
    </tbody>
</table>
</body>
</html>
