<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
  <%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style>
 section{
  width:80%;
  height:600px;
  margin:auto;
  text-align:center;
 }
 section table{
  margin-top:100px;
  width:600px;
 }
</style>
</head>
<body>
<section>
<table align="center" border="1">
 <tr>
  <td>근무일</td>
  <td>근무지</td>
  <td>지원인원</td>
  <td>지원자명</td>
 </tr>
  <c:forEach items="${list}" var="wvo">
  <tr>
   <td> ${wvo.workday}</td>
   <td>${wvo.workname}</td>
   
    <c:set var="apply" value="${fn:split(wvo.apply,',')}"/>
    <c:set var="len" value="${fn:length(apply)}"/> <!-- 배열크기 -->
   <td>${len}명</td>
   <td>
      <%--  
      <c:forEach items="${apply}" var="apply_name">
        ${apply_name}
       </c:forEach> 
       --%>
       ${wvo.apply}
  </td>
  
  </tr>
 </c:forEach>
</table>

</section>
</body>
</html>