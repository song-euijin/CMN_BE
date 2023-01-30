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
<meta content="width=device-width, initial-scale=1.0" name="viewport">

<title>CRM</title>
<meta content="" name="description">
<meta content="" name="keywords">

</head>

<body>

	<!-- ======= 메인 공간!! ======= -->
	<main id="main" class="main">
		<a href="testList.do">은승호 테스트 페이지</a>
		<table>
			<tr>
				<td>아이디</td>
				<td>비밀번호</td>
				<td>성</td>
				<td>이름</td>
			</tr>
			<c:choose>
				<c:when test="${!empty resultList}">
					<c:forEach items="${resultList}" var="result" varStatus="status">
						<tr>
							<td class="td_c">${result.USER_ID}</td>
							<td class="td_c">${result.USER_PW}</td>
							<td class="td_c">${result.USER_FIRST_NAME}</td>
							<td class="td_c">${result.USER_LAST_NAME}</td>
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
	</main>

</body>

</html>