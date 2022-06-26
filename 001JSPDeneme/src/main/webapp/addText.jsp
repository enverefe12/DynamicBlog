<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div>
		<h3>Choose File to Upload in Server</h3>
		<form action="file.upload" method="post" enctype="multipart/form-data">
			<input type="file" name="file" /> 
			<input type="submit" value="upload" />
		</form>
	</div>
	<p><font color="red" size=22>Yükleyeceğiniz dosyalar html ile düzenlenmiş durumda ve de html uzantılı dosyalar olması gerekmektedir!</font></p>
</body>
</html>