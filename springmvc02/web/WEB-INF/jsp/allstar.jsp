<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 21070087
  Date: 2021/7/14
  Time: 16:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>球星展示</title>
    <!-- 新 Bootstrap 核心 CSS 文件 -->
    <link href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
    <div class="container">
        <div class="row clearfix">     <!--清除浮动 -->
            <div calss="col-md-12 column">
                <div calss="page-header">
                    <h1>
                        <small>球星列表</small>
                    </h1>

                </div>
            </div>

        </div>

        <div class="row">
            <div class="col-md-4 column">
                <a class="btn btn-primary" href="${pageContext.request.contextPath}/star/toAddStar">加入球星</a>

            </div>

        </div>
    </div>

    <div class="container">
        <div calss="col-md-12 column">
            <table class="table table-hover table-striped">
                <thead>
                    <tr>
                        <th>球星排名</th>
                        <th>球星姓名</th>
                        <th>球星年龄</th>
                        <th>球星特长</th>
                        <th>操作</th>
                    </tr>

                </thead>
                <tbody>
                    <c:forEach var="star" items="${stars}">
                        <tr>
                            <td>${star.rankId}</td>
                            <td>${star.name}</td>
                            <td>${star.age}</td>
                            <td>${star.advantage}</td>
                            <td>
                                <a href="${pageContext.request.contextPath}/star/deletestar/${star.name}">删除</a>
                                &nbsp; | &nbsp;
                                <a href="${pageContext.request.contextPath}/star/toupdate?name=${star.name}">修改</a>
                            </td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
        </div>
    </div>
</body>
</html>
