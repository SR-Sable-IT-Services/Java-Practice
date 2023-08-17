<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Delete User</title>
</head>
<body>
    <h1>Delete User</h1>
    <form action="/deleteUser" method="post">
        <input type="hidden" name="id" value="${user.id}" />
        <p>Are you sure you want to delete this user?</p>
        <p>User ID: ${user.id}</p>
        <p>User Name: ${user.userName}</p>
        <input type="submit" value="Delete" />
    </form>
</body>
</html>
