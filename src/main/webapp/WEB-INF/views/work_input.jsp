<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style>
 section{
  width:80%;
   margin:auto;
   margin-top:100px;
 }
 section table input[type=text],table input[type=number]{
  width:200px;
 }
 #pay{
  width:100px;
 }
 #pay::placeholder{
  text-align:center;
 }
</style>

<script>

/*  input태그에 현재시간 기본값 설정하는부분 */
onload=function(){
	var wday=document.getElementById('wday');
	var today=new Date().toISOString().slice(0, 10); // 오늘날짜 ex) 2022-09-20
	wday.value=today; 
	wday.min=today;
	
}

</script>
</head>
<body>
 <section>
<form method="post" action="work_input_ok">
  <table align="center" >
   <caption><h2> 일자리 상세 </h2></caption>
	   <tr>
	   <td width="150">날짜</td><td><input id="wday" type="date" name="workday"></td> </tr><tr> 
	   <td>근무지</td><td><input type="text" name="workname" placeholder="근무지"></td> </tr><tr>
	   <td>위치</td><td><input type="text" name="workplace" placeholder="위치"></td>  </tr><tr>
	  
	   <td>모집내용</td>
	   <td>
	   <textarea name="content" cols="40" rows="5"></textarea></td>  
	   </tr><tr>
	
	   <td>근무시간</td>
	   <td>
	    <input type="time" name="start_time" value="06:00" required> ~<input type="time" name="close_time" value="17:00" required>
	   </td> 
	  
	    </tr><tr>
	   <td>인원</td><td><input type="number" name="inwon" placeholder="인원" min="0" max="50"></td>  </tr><tr>
	   <td>성별</td><td>
	     무관 <input type="radio" name="gender" value="0" checked> 남자 <input type="radio" name="gender" value="1"> 여자 <input type="radio" name="gender" value="2">
	   </td>  </tr>
	   <tr>
	   <td>시급/일급</td>
	   <td>
	      일급 <input type="radio" name="paytype" value="0" checked>  시급 <input type="radio" name="paytype" value="1"><br>  
	    <input type="number" id="pay" name="pay" placeholder="금액">원
	   </td> 
	   </tr>
	   <tr>
	  <tr>
	  <td colspan="2" align="center"> <input type="submit" value="작성">  </td>
	  </tr> 
	  </table>
</form>	  
</section>
</body>
</html>