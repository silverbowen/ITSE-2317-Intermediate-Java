<!DOCTYPE html>
<!-- form-processor-one.jsp -->
<%@ page import="jave.io.*, java.util.*" %>
<html>
    <head>
        <meta charset="utf-8">
        <title>Output of form-processor-one</title>
        <link rel="stylesheet" href="css-1.css">
        <script src="http://html5shiv.googlecode.com/svn/trunk/html5.js"></script>
    </head>
    <body>
        <%
            // get parameters from request object
            String favoriteSport = request.getParameter("favoriteSport");
            String favoriteTeam = request.getParameter("favoriteTeam");
            String favoritePlayer = request.getParameter("favoritePlayer");
            String reasonFavorite = request.getParameter("reasonFavorite");
        %>
        <header>
            <h1>Thanks for entering the information.</h1>
        </header>
        <section>
            <h2>This is what you entered:</h2>
        </section>
        <table class="inline-block, center">            
            <tr>
                <th id="th-id1" colspan="2">Information Entered</th>
            </tr>
            <tr>
                <td>Favorite Sport:</td>
                <td><%= favoriteSport%></td>
            <tr>
            <tr>
                <td>Favorite Team:</td>
                <td><%= favoriteTeam%></td>
            <tr>    
            <tr>
                <td>Favorite Player:</td>
                <td><%= favoritePlayer%></td>
            <tr> 
            <tr>
                <td>Reason Favorite:</td>
                <td><%= reasonFavorite%></td>
            <tr>   
        </table>
    </body>
</html >
