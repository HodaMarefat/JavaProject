<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Subscribe to Surplus Food Alerts</title>
    <style>
        body { font-family: Arial, sans-serif; }
        .container { width: 80%; margin: auto; padding: 20px; }
        .form-group { margin-bottom: 15px; }
        label { display: block; margin-bottom: 5px; }
        input, select { width: 100%; padding: 10px; margin-top: 5px; }
        button { padding: 10px 20px; margin-top: 10px; }
    </style>
</head>
<body>
    <div class="container">
        <h1>Subscribe to Surplus Food Alerts</h1>
        <p>Fill out the form below to receive alerts about surplus food items based on your preferences and location.</p>
        
        <form action="processSubscription.jsp" method="post">
            <div class="form-group">
                <label for="name">Name:</label>
                <input type="text" id="name" name="name" required>
            </div>
            <div class="form-group">
                <label for="email">Email:</label>
                <input type="email" id="email" name="email" required>
            </div>
            <div class="form-group">
                <label for="location">Location:</label>
                <input type="text" id="location" name="location" required>
            </div>
            <div class="form-group">
                <label for="preference">Food Preference:</label>
                <select id="preference" name="preference">
                    <option value="vegetables">Vegetables</option>
                    <option value="fruits">Fruits</option>
                    <option value="dairy">Dairy Products</option>
                    <option value="bakedgoods">Baked Goods</option>
                    <!-- Add more options based on your inventory categories -->
                </select>
            </div>
            
            <button type="submit">Subscribe</button>
        </form>
    </div>
</body>
</html>
