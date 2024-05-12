<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<!--here now we change above because we wanna access the value of the object being passed-->
    Welcome ${obj.aid}, ${obj.aname}, ${obj.lang}
</body>
</html>


<!-- whenever I request for home, the url I want to go for is below-->
<!-- whenever you call for home it calls home.jsp -->
<!-- this is our view below in MVC -->
<!-- this request goes to controller and controller will call this home.jsp-->
<!-- we don't have a controller thus we go make one -->

