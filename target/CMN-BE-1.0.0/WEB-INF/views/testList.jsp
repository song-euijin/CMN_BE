<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
request.setCharacterEncoding("utf-8");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="../js/jquery-3.6.1.min.js"></script>
</head>
<body>
	<a href="testReg.do">추가</a>
	<a id="mdf" href="#">수정</a>
	<a id="dlt" href="#">삭제</a>
	<table>
		<tr>
			<td>선택</td>
			<td>아이디</td>
			<td>비밀번호</td>
			<td>성</td>
			<td>이름</td>
		</tr>
		<c:choose>
			<c:when test="${!empty userList}">
				<c:forEach items="${userList}" var="result" varStatus="status">
					<tr>
						<td class="td_c">
							<input type="checkbox" class="chk" name="checkedUser" value="${result.userId}"/>
						</td>
						<td class="td_c" id="userId">${result.userId}</td>
						<td class="td_c">${result.userPw}</td>
						<td class="td_c">${result.userFirstName}</td>
						<td class="td_c">${result.userLastName}</td>
					</tr>
				</c:forEach>
			</c:when>
			<c:otherwise>
				<tr>
					<td colspan="4">유저가 없습니다.</td>
				</tr>
			</c:otherwise>
		</c:choose>
	</table>
	<script type="text/javascript">
		$(function(){
			$('.chk').click(function(){
				if($(this).prop('checked')){
					$('.chk').prop('checked', false);
					$(this).prop('checked', true);
				}
			})		
			
			$('#mdf').click(function(){
				var checkbox = $("input[name=checkedUser]:checked");
				var userId = "";
				checkbox.each(function(i){
					var userId = $(this).val();
					console.log(userId, 'u');
					location.href = "/testModify.do?userId=" + userId;
				});
			});
			
			$('#dlt').click(function(){
				var checkbox = $("input[name=checkedUser]:checked");
				var userId = "";
				checkbox.each(function(i){
					var userId = $(this).val();
					console.log(userId, 'u');
					var request =
	    				$.ajax({
	    					url: "/testDelete.do",
	    					type: "POST",
	    					data : {
	    							"userId" : userId
	    					},
	    					success: function(data){
	    						location.reload()
	    					}
	    				});
	    				request.fail(function( jqXHR, textStatus ) {
	    					location.reload()
	    				});
				});
			});
			
		})
	</script>
</body>
</html>