<%--
  Created by IntelliJ IDEA.
  User: 21070087
  Date: 2021/7/14
  Time: 7:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>首页</title>
    <style>

        h1{
          width:180px;
          height:38px;
          margin: 100px auto;
          text-align: center;
          line-height: 38px;
          background-color: aquamarine;
          border-radius: 5px;
        }
        a{
            text-decoration: none;
            color: black;
            font-size: 20px;

        }
    </style>
  </head>
  <body>
    <h1>
      <a href="${pageContext.request.contextPath}/star/allstar">了解全明星</a>
    </h1>
  </body>
</html>
