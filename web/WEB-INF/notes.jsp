<%-- 
    Document   : notes
    Created on : Apr 22, 2020, 5:17:44 PM
    Author     : aymen
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Notes</title>
    </head>
    <body>
        <h1>Notes!</h1>
        <table>
            <tr>
                <th>Date Created</th>
                <th>Title</th>
                <th></th>
            </tr>
            <c:forEach var="notes" items="${note}">
                <tr>
                    <td>${notes.datecreated}</td>
                    <td>${notes.title}</td>
                    <td>
                        <form method="POST">
                            <input type="submit" name="btnEdit" value="Edit"/>
                        </form>
                    </td>
                </tr>
        </table>
    </body>
</html>
