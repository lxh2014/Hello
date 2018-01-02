<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/1/2
  Time: 15:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Student</title>
</head>
<body>
    <form action="Student">
        <table>
            <tr>
                <td><form:label path="name">名字：</form:label></td>
                <td><form:input path="name" /></td>
            </tr>
            <tr>
                <td><form:label path="age">年龄：</form:label></td>
                <td><form:input path="age" /></td>
            </tr>
            <tr>
                <td><form:label path="id">编号：</form:label></td>
                <td><form:input path="id" /></td>
            </tr>
            <tr>
                <td colspan="2">
                    <input type="submit" value="提交表单"/>
                </td>
            </tr>
        </table>
    </form>

</body>
</html>
