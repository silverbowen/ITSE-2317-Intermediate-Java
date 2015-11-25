<!doctype html>
<!-- asg12 sessionCreation.jsp -->
<html lang="en">
    <head>
        <title>ASG 12 - Sessions -sessionCreation.jsp</title>
        <link rel="stylesheet" href="css-1.css">
    </head>
    <%@ page import="java.util.*" %>
    <body>
        <div class="center">
            <h1>Sessions</h1>
            <h2>Enter your values</h2>
            <form action="sessionCreation.jsp" method="GET">
                <table class="inline-block">
                    <tr id="th-id1">
                    <tr>
                        <td>Artist:</td>
                        <td><input type="text" name="artistInput"></td>
                    </tr>
                    <tr>
                        <td>Color:</td>
                        <td><input type="text" name="colorInput"></td>
                    </tr>
                    <tr>
                        <td></td>
                        <td><br><input type="submit" class="table_header"
                                       value="Submit Information"></td>
                    </tr>
                </table>
            </form>
            <%
                // get values
                String artistValue = request.getParameter("artistInput");
                String colorValue = request.getParameter("colorInput");
                
                // set key/Value session pairs
                if (artistValue == null || artistValue == "") {
                    session.setAttribute("artistKey", "no current value");
                } else {
                    session.setAttribute("artistKey", artistValue);
                }
                if (colorValue == null || colorValue == "") {
                    session.setAttribute("colorKey", "no current value");
                } else {
                    session.setAttribute("colorKey", colorValue);
                }
            %>

            <h1>Session Attributes</h1>
            <h2>Values you entered</h2>
            <table class="inline-block">
                <tr id="th-id1">
                    <th> Key </th>
                    <th> Value </th>
                </tr>
                <tr>
                    <td> Artist </td>
                    <td><%= (String) session.getAttribute("artistKey")%></td>
                </tr>
                <tr>
                    <td> Color </td>
                    <td><%= (String) session.getAttribute("colorKey")%></td>
                </tr>
            </table>
        </div>
    </body>
</html>

