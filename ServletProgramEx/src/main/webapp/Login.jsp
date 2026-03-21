<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Login Page</title>
</head>
<body>

<h2>User Login</h2>
<%
    String error = (String)request.getAttribute("error");

    if (error != null) {
%>
    <p style="color:red;"><%= error %></p>
<%
    }
%>
<form action="login" method="post">
    <label>Email:</label><br>
    <input type="email" name="email" required><br><br>

    <label>Password:</label><br>
    <input type="password" name="password" required><br><br>

    <input type="submit" value="Login">
</form>

</body>
</html>