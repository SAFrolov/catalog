<%-- 
    Document   : categories
    Created on : 03.02.2018, 12:25:52
    Author     : s.frolov
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix ="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Категории продуктов</title>
        <link rel="stylesheet" href="styleTable.css">
    </head>
    <body>
        <h1>Категории продуктов</h1>
        <a href="/WirkWithDataBased/insite.jsp"> Создать новую категорию </a>
        <a href="/WirkWithDataBased/DeleteServlet"> удалить категорию </a>        
        <table class ="tdata">
            <tr>
                <th width ="1%"> идентификатор </th>
                <th> Код </th>
                <th> Название </th>
            </tr>
            
            <c:forEach var = "category" items="${categories}">
                <tr>
                    <td width="1%"><a href="/WirkWithDataBased/categoryServlet?cid=${category.id}">${category.id}</a></td>
                    <td><a href="/WirkWithDataBased/categoryServlet?cid=${category.id}">${category.name}</a></td>
                    <td><a href="/WirkWithDataBased/categoryServlet?cid=${category.id}">${category.code}</a></td>
                </tr>
            </c:forEach>
        </table>
    </body>
</html>
