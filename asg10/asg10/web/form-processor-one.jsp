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
            String firstName = request.getParameter("firstName");
            String lastName = request.getParameter("lastName");
            String collegeName = request.getParameter("collegeName");
            String phoneNumber = request.getParameter("phoneNumber");
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
                <td>First Name:</td>
                <td><%= firstName%></td>
            <tr>
            <tr>
                <td>Last Name:</td>
                <td><%= lastName%></td>
            <tr>    
            <tr>
                <td>College Name:</td>
                <td><%= collegeName%></td>
            <tr> 
            <tr>
                <td>Phone Number:</td>
                <td><%= phoneNumber%></td>
            <tr>   
        </table>
    </body>
</html >
