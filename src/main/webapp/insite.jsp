<%-- 
    Document   : insite
    Created on : 03.02.2018, 14:19:08
    Author     : s.frolov
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ввод</title>
    </head>
    <body>
        <p>Добавление даты/p>
        <form action="InServlet" method="post">
        <table class ="tdata">
        
            <tr>
                <td width ="1%"> Код   </td>
                <td><input type="text" name="name"/> </td>
            </tr>
            
            <tr>
                <td width ="1%"> Название   </td>
                <td><input type="text" name="code"/></td>
            </tr>
          
        </table>
   
            
            <button type="submit" value="OK">OK</button>
        </form>
        
        <h1>
                <a href="/WirkWithDataBased/categories"> Назад </a>
        </h1>
    </body>
</html>
