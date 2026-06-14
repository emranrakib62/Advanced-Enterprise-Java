<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Result Page</title>
    </head>
    <body>
        <%! 
         
            int square(int n) {
                return n * n;
            }
        %>               
        <%
            // Scriptlet Tag
            String value = request.getParameter("num");
            int number = Integer.parseInt(value);
            
            int result = number * number; 
        %>

        <h2>Result Page</h2>
        <!-- Expression Tag -->
        Square of <%= number %> is <%= result %>
    </body>
</html>