<!DOCTYPE html>
<!-- asg12 readingCookies.jsp -->
<html>
    <head>
        <title>ASG 12 - Cookies - readingCookies.jsp</title>
        <link rel="stylesheet" href="css-1.css">
    </head>
    <body>        
        <div class=""center">         
             <h1>Reading Cookies</h1>
            <%
                Cookie cookies[] = null;

                // get array of cookies
                cookies = request.getCookies();
                out.println("<h2 class=\"blue_color\">"
                        + "Found cookies: Name --- Value </h2>");
                for (int i = 0; i < cookies.length; ++i) {
                    out.println("<h3>Name: " + cookies[i].getName() + " --- ");
                    if (cookies[i].getValue().length() > 0) {
                        out.println("Value: " + cookies[i].getValue() + "</h3>");
                    } else {
                        out.println("Value: no value found!</h3>");
                    }
                }
            %>
            <button onclick="location.href = 'sessionCreation.jsp'"
                    class="coral_color">Go to sessionCreation.jsp</button>
        </div>
    </body>
</html >
