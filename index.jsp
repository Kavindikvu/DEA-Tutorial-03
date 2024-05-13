<%-- 
    Document   : index
    Created on : May 11, 2024, 6:10:21 PM
    Author     : Umesha
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="SignupServlet" method="POST">
            <table>
                <tr>
            <td>Username: <input type="text" name="uname"/></td>
                </tr>
                
                <tr>
            <td>Email: <input type="text" name="email"></td>    
                </tr>
                
                <tr>
            <td>Password: <input type="password" name="pwd"></td>   
                </tr>
                
                <tr>
            <td>Confirm Password: <input type="password" name="cpwd"></td>
                </tr>
               
                <td>
            <input type="submit" value="Submit"></td>
            </td>
                
            </table>  
    </body>
</html>
