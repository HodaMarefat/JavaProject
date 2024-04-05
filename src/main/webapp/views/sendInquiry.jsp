<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Submission Received</title>
</head>
<body>
    <h1>Thank you for your inquiry, <%= request.getParameter("name") %></h1>
    <p>We have received your message and will be in touch soon.</p>
    <p><b>Your Message:</b> <%= request.getParameter("message") %></p>
    <p><b>Your Email:</b> <%= request.getParameter("email") %></p>
    <a href="index.jsp">Return to Home Page</a>
</body>
</html>
