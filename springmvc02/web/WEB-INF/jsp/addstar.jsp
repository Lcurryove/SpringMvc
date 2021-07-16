<%--
  Created by IntelliJ IDEA.
  User: 21070087
  Date: 2021/7/15
  Time: 10:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>加入球星</title>
    <link href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>

    <div class="container">
        <div class="row clearfix">     <!--清除浮动 -->
            <div calss="col-md-12 column">
                <div calss="page-header">
                    <h1>
                        <small>加入球星</small>
                    </h1>

                </div>
            </div>
        </div>
    </div>

    <form action="${pageContext.request.contextPath}/star/addstar" method="post">
        <div clss="form-group">
            <label >球星排名</label>
            <input type="text" name ="RankId" class="form-control" >
        </div>
        <div clss="form-group">
            <label >球星姓名</label>
            <input type="text" name="name" class="form-control" >
        </div>
        <div clss="form-group">
            <label >球星年龄</label>
            <input type="text" name="age" class="form-control" >
        </div>
        <div clss="form-group">
            <label >球星特长</label>
            <input type="text" name="advantage" class="form-control" >
        </div>
        <div clss="form-group">

            <input type="submit" class="form-control" value="添加">
        </div>
    </form>

</body>
</html>
