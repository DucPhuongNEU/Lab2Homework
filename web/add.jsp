<%--
  Created by IntelliJ IDEA.
  User: Duc Phuong
  Date: 21-Feb-19
  Time: 5:22 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Calculator</title>
</head>
<body>
    <form action="/calculator" method="post">
        <h1>Calculator</h1>
        <div >
            <input type="text" name="input1" placeholder="Nhập số" />
            <%--<ul class="dropdown-menu">--%>
                <%--<li><a href="#">+</a></li>--%>
                <%--<li><a href="#">-</a></li>--%>
                <%--<li><a href="#">*</a></li>--%>
                <%--<li><a href="#">/</a></li>--%>
            <%--</ul>--%>
            <select name="pheptinh">
                <option value="add">+</option>
                <option value="sub">-</option>
                <option value="mul">*</option>
                <option value="div">/</option>
            </select>
            <input type="text" name="input2" placeholder="Nhập số" />
            <button type="submit" class="btn btn-default">Kết quả</button>
        </div>
    </form>
</body>
</html>
