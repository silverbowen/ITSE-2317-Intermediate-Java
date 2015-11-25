<!DOCTYPE html>
<!-- asg12 cookieCreator.jsp -->
<html>
    <head>
        <title>ASG 12 - Cookies - cookieCreator.jsp</title>
        <link rel="stylesheet" href="css-1.css">
        <style type="text/css">
            ol { margin-left: 80px; }
            li { font-size: 2em; text-align: left}
            p { font-size: 1em; line-height: 1;}
        </style>
    </head>
    <%@ include file="cookieCreatorProcessor.jsp" %>
    <body>        
        <div class=""center">
             <h1>Three cookies created:</h1>
            <ol>
                <li><p><b>Animal:</b>
                            <%= request.getParameter("animal") %>
                    </p>
                </li>
                <li><p><b>Flower:</b>
                            <%= request.getParameter("flower") %>
                    </p>
                </li>    
                <li><p><b>Country:</b>        
                            <%=  request.getParameter("country")%>
                    </p>
                </li>    
            </ol>
            <button onclick="location.href = 'readingCookies.jsp'"
                    class="coral_color">Go to readingCookies.jsp</button>
        </div>
    </body>
</html >
