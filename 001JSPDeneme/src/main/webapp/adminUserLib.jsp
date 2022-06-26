<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
      <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Hoşgeldiniz ${adminName}</h1>
 
   <p>
 

<c:forEach items="${files}" var="val" >
   <a href="yazi/${val.key}">${val.key}</a><br>
</c:forEach>
   
   </p>
 
    
     <hr>
    <p>Admin Komutları</p><br>
    <form action="addText.jsp">
    <input type="submit" value="Yazı Ekle" height="20" width="20"  >
    </form>
    <form action="delText.jsp">
    <input type="submit" value="Yazı Sil" height="20" width="20"  >
    </form>
    
    
    
</body>
</html>