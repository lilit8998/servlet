<%--
  Created by IntelliJ IDEA.
  User: dream
  Date: 07.02.2021
  Time: 14:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Home</title>
  </head>
  <body>
  <h2>Hello world!!!</h2>
  <h1>Գրանցում</h1>
  <form action="/register" method="post">
    <input type="text" name="name" placeholder="Անուն"> <br>
    <input type="text" name="surname" placeholder="Ազգանուն"> <br>
    <input type="email" name="email" placeholder="Email"> <br>
    <input type="password" name="password" placeholder="Գաղտանաբառ"> <br>
    <input type="submit" value="Գրանցում">
  </form>
  </body>
</html>
