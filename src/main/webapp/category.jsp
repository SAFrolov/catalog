<%-- 
    Document   : category
    Created on : 03.02.2018, 12:54:26
    Author     : s.frolov
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Карточка</title>
        <link rel="stylesheet" href="styleTable.css">
    </head>
    <body>
        <h1> Карточка продукта </h1>
        <table class ="tdata">
            <tr>
                <td width ="1%"> Категория </td>
                <td> Значение </td>
            </tr>
            
            <tr>
                <td width ="1%"> идентификатор  </td>
                <td>${category.id}</a></td>
            </tr>

            <tr>
                <td width ="1%"> Код   </td>
                <td>${category.code}</a></td>
            </tr>
            
            <tr>
                <td width ="1%"> Название   </td>
                <td>${category.name}</a></td>
            </tr>

            <tr>
                <td width ="1%"> Дата создания  </td>
                <td>${category.creatData}</a></td>
            </tr>
            
        </table>
            <h1>
                <a href="/WirkWithDataBased/categories"> Назад </a>
            </h1>
    </body>
</html>
