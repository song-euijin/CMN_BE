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
</head>
<body>
	<a href="testList.do">뒤로</a>
	<form action="/testReg.do" method="post" id="regForm" style="margin: auto;">
		<table>
			<tr>
				<td>아이디</td>
				<td><input type="text" name="userId" /></td>
			</tr>
			<tr>
				<td>암호</td>
				<td><input type="text" name="userPw" /></td>
			</tr>
			<tr>
				<td>성</td>
				<td><input type="text" name="userFirstName" /></td>
			</tr>
			<tr>
				<td>이름</td>
				<td><input type="text" name="userLastName" /></td>
			</tr>
			<tr>
				<td>부서</td>
				<td>
					<select name="userDept">
						<option hidden="hidden">부서 선택</option>
						<c:forEach items="${deptList }" var="d">
							<option value="${d.commonCode}">${d.codeName}</option>
						</c:forEach>
					</select>
				</td>
			</tr>
			<tr>
				<td>직급</td>
				<td>
					<select name="userRank">
						<option hidden="hidden">직급 선택</option>
						<c:forEach items="${rankList }" var="r">
							<option value="${r.commonCode}">${r.codeName}</option>
						</c:forEach>
					</select>
				</td>
			</tr>
			<tr>
				<td>직책</td>
				<td>
					<select name="userPosition">
						<option hidden="hidden">직급 선택</option>
						<c:forEach items="${positionList }" var="p">
							<option value="${p.commonCode}">${p.codeName}</option>
						</c:forEach>
					</select>
				</td>
			</tr>
			<tr>
				<td>권한</td>
				<td>
					<select name="userAuthority">
						<option hidden="hidden">권한 선택</option>
						<c:forEach items="${authorityList }" var="a">
							<option value="${a.commonCode}">${a.codeName}</option>
						</c:forEach>
					</select>
				</td>
			</tr>
			<tr>
				<td>연락처</td>
				<td><input type="text" name="userPhone" /></td>
			</tr>
			<tr>
				<td>내선번호</td>
				<td><input type="text" name="userLandLineNumber" /></td>
			</tr>
			<tr>
				<td>우편번호</td>
				<td><input type="text" name="userZipCode" /></td>
			</tr>
			<tr>
				<td>주소</td>
				<td><input type="text" name="userAddr" /></td>
			</tr>
			<tr>
				<td>주소상세</td>
				<td><input type="text" name="userAddrDetail" /></td>
			</tr>
		</table>
		<div>
			<button id="regBtn" type="submit" style=" display: inline-block; width: 100px; margin-top: 20px; margin-left: 80px;">등록</button>
		</div>
	</form>

</body>
</html>