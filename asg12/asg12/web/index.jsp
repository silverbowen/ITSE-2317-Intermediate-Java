<!doctype html>
<!--asg12 index.jsp-->
<html lang="en">
    <head>
        <title>ASG 12 - Cookies - index.jsp</title>
        <link rel="stylesheet" href="css-1.css">
    </head>
    <body>
        <div class=""center">
            <h1>Enter Cookie Data</h1>
            <form action="cookieCreator.jsp" method="GET">
                <table class="inline-block">
                    <tr><th id="th-id1" colspan="2">Cookie Information</th></tr>
                    <tr>
                        <td>Animal:</td>
                        <td><input type="text" name="animal"></td>
                    </tr>
                    <tr>
                        <td>Flower:</td>
                        <td><input type="text" name="flower"></td>
                    </tr>
                    <tr>
                        <td>Country:</td>
                        <td><input type="text" name="country"></td>
                    </tr>
                    <tr>
                        <td></td>
                        <td><br><input type="submit" class="coral_color"
                                       value="Create Cookies"></td>
                    </tr>
                </table>
            </form>
        </div>
    </body>
</html>

