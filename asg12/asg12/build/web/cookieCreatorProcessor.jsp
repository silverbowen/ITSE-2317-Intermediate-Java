<!-- asg12 cookieCreatorProcessor.jsp -->

<%
    // create cookies with parameters from request object
    Cookie animal = new Cookie("animal",
            request.getParameter("animal"));
    Cookie flower = new Cookie("flower",
            request.getParameter("flower"));
    Cookie country = new Cookie("country",
            request.getParameter("country"));

    // set expiration to two hours
    animal.setMaxAge(60 * 60 * 2);
    flower.setMaxAge(60 * 60 * 2);
    country.setMaxAge(60 * 60 * 2);

    // add cookies to response object
    response.addCookie(animal);
    response.addCookie(flower);
    response.addCookie(country);
%>
