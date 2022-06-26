<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<form action="delete.file" method="get">
<p>Silinecek Yazının Adını Giriniz: </p><input type="text" name="delThisFile">
</form>

  ${delMessage}

</body>
</html>