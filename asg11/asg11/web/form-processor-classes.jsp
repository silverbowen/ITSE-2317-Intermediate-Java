<!DOCTYPE html>
<!-- form-processor-classes.jsp -->
<%@ page import="vehicles.*, java.io.*, java.util.*" %>
<html>
    <head>
        <meta charset="utf-8">
        <title>Output of form-processor-classes</title>
        <link rel="stylesheet" href="css-1.css">
        <script src="http://html5shiv.googlecode.com/svn/trunk/html5.js"></script>
    </head>
    <body>
        <%
            // get parameters from request object
            String airMake = request.getParameter("airMake");
            String airModel = request.getParameter("airModel");
            String airColor = request.getParameter("airColor");
            String airReg = request.getParameter("airReg");

            String autoMake = request.getParameter("autoMake");
            String autoModel = request.getParameter("autoModel");
            String autoColor = request.getParameter("autoColor");
            String autoReg = request.getParameter("autoReg");

            // create objects
            Aircraft aircraft = new Aircraft(airMake, airModel,
                    airColor, airReg);
            Automobile automobile = new Automobile(autoMake, autoModel,
                    autoColor, autoReg);
        %>
        <header>
            <h1>Thanks for entering<br>the information.</h1>
        </header>
        <section>
            <h2>Aircraft data entered:</h2>
        </section>
        <table class="inline-block, center">            
            <tr>
                <th id="th-id1" colspan="2">Aircraft Information</th>
            </tr>
            <tr>
                <td>Aircraft Make:</td>
                <td><%= aircraft.getAirMake()%></td>
            <tr>            
            <tr>
                <td>Aircraft Model:</td>
                <td><%= aircraft.getAirModel()%></td>
            <tr>
            <tr>
                <td>Aircraft Color:</td>
                <td><%= aircraft.getAirColor()%></td>
            <tr>
            <tr>
                <td>Aircraft Registration:</td>
                <td><%= aircraft.getAirReg()%></td>
            <tr>
        </table>
        <section>
            <h2>Automobile data entered:</h2>
        </section>
        <table class="inline-block, center">            
            <tr>
                <th id="th-id1" colspan="2">Automobile Information</th>
            </tr>
            <tr>
                <td>Automobile Make:</td>
                <td><%= automobile.getAutoMake()%></td>
            <tr>            
            <tr>
                <td>Automobile Model:</td>
                <td><%= automobile.getAutoModel()%></td>
            <tr>
            <tr>
                <td>Automobile Color:</td>
                <td><%= automobile.getAutoColor()%></td>
            <tr>
            <tr>
                <td>Automobile Registration:</td>
                <td><%= automobile.getAutoReg()%></td>
            <tr>
        </table>
            <section>
                <p>To return to the forms and enter new 
                information,<br>select the button below.</p>
            </section>
        <form action="index.html" method="get">
        <input type="submit" class="table_header"
               value="Enter new information">
        <br>
        <br>
        <br>
        <br>
    </body>
</html >
