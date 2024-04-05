<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Food Waste Reduction Platform</title>
    <style>
        /* Basic styling for buttons and forms */
        .button {
            display: inline-block;
            padding: 10px 20px;
            margin: 5px;
            font-size: 16px;
            cursor: pointer;
            text-align: center;
            text-decoration: none;
            outline: none;
            color: #fff;
            background-color: #4CAF50;
            border: none;
            border-radius: 15px;
            box-shadow: 0 9px #999;
        }

        .button:hover {background-color: #3e8e41}

        .button:active {
            background-color: #3e8e41;
            box-shadow: 0 5px #666;
            transform: translateY(4px);
        }

        .form-container {
            display: none;
            margin-top: 20px;
        }
    </style>
    <script>
        function showForm(formId) {
            // Hide both forms initially
            document.getElementById('loginForm').style.display = 'none';
            document.getElementById('registrationForm').style.display = 'none';
            
            // Show the requested form
            document.getElementById(formId).style.display = 'block';
        }
    </script>
</head>
<body>
    <header>
    <h1>Food Waste Reduction Platform</h1>
    <div style="margin-bottom: 10px;"> <!-- Container for links -->
        <a href="index.jsp">Home</a> |
        <a href="about-contact.jsp">About/Contact</a> |
	<a href="foodItem.jsp">Surplus Foods</a> |
	<a href="subscribe-alerts.jsp">Subscribe</a>
    </div>
    <div> <!-- Container for buttons -->
        <button class="button" onclick="showForm('loginForm')">Login</button>
        <button class="button" onclick="showForm('registrationForm')">Register</button>
    </div>
	</header>

    
    <!-- Login Form -->
    <div id="loginForm" class="form-container">
        <h2>Login</h2>
        <form>
            <label for="loginUsername">Username:</label><br>
            <input type="text" id="loginUsername" name="username" required><br>
            <label for="loginPassword">Password:</label><br>
            <input type="password" id="loginPassword" name="password" required><br><br>
            <input type="submit" value="Login">
        </form>
    </div>
    
    <!-- Registration Form -->
    <div id="registrationForm" class="form-container">
        <h2>Registration</h2>
        <form>
            <label for="registerUsername">Username:</label><br>
            <input type="text" id="registerUsername" name="username" required><br>
            <label for="registerPassword">Password:</label><br>
            <input type="password" id="registerPassword" name="password" required><br>
            <label for="userType">User Type:</label><br>
            <select name="userType" id="userType" required>
                <option value="consumer">Consumer</option>
                <option value="charitableOrganization">Charitable Organization</option>
                <option value="retailer">Retailer</option>
            </select><br><br>
            <input type="submit" value="Register">
        </form>
    </div>

    <footer>
        <p>Food Waste Reduction Platform © 2024</p>
    </footer>

    <script>
        // Additional scripts can be placed here
    </script>
</body>
</html>
