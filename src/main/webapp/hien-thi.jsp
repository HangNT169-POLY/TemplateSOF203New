<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: hangnt
  Date: 27/8/24
  Time: 14:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table>
    <tr>
        <th>STT</th>
        <th>MSSV</th>
        <th>Tên</th>
        <th>Tuổi</th>
        <th>Địa chỉ</th>
        <th>Giới tính</th>
        <th colspan="2">Action</th>
    </tr>
    </thead>
    <tbody>
    <%--    for(Doi tuong: ten mang)--%>
    <c:forEach items="${lists}" var="sv" varStatus="i">
        <tr>
            <td>${i.index}</td>
            <td>${sv.maGV}</td>
            <td>${sv.ten}</td>
            <td>${sv.tuoi}</td>
            <td>${sv.loai}</td>
            <td>${sv.bac}</td>
            <td>${sv.gioiTinh}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
