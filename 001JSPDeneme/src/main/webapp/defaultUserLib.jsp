<%@page import="java.util.Map"%>
<%@page import="Controller.LibUpload"%>
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
<h1>Hoşgeldiniz!!</h1>
 
   <p>
 
<%
LibUpload lp=new LibUpload();
Map<String, String> fileMap=lp.getFileMap();

request.getSession().setAttribute("files", fileMap);
%>


<c:forEach items="${files}" var="val" >
   <a href="yazi/${val.key}">${val.key}</a><br>
</c:forEach>
   
   </p>
 
    
  
</body>
</html>