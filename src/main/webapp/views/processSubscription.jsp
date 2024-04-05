<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Subscription Confirmation</title>
</head>
<body>
    <h2>Subscription Details</h2>
    <p>Name: <%= request.getParameter("name") %></p>
    <p>Email: <%= request.getParameter("email") %></p>
    <p>Location: <%= request.getParameter("location") %></p>
    <p>Preference: <%= request.getParameter("preference") %></p>
    <p><a href="index.jsp">Return to Home</a></p>
</body>
</html>
