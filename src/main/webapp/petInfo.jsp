<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>宠物信息</title>
</head>
<body>
<table>
    <tr>
        <th>宠物编号</th>
        <th>宠物名字</th>
        <th>宠物类型</th>
        <th>宠物年龄</th>
        <th>宠物可爱度</th>
    </tr>
    <c:forEach var="pet" items="${list}">
        <tr>
            <td>${pet.id}</td>
            <td>${pet.name}</td>
            <td>${pet.type}</td>
            <td>${pet.age}</td>
            <td>${pet.love}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
