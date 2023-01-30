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
	<form action="/testModify.do" method="post" id="mdfForm" style="margin: auto;">
		<c:forEach items="${targetInfo}" var="target">
			<input type="hidden" name="targetId" value="${target.userId }"/>
			<table>
				<tr>
					<td>아이디</td>
					<td><input type="text" name="userId" value="${target.userId }"/></td>
				</tr>
				<tr>
					<td>암호</td>
					<td><input type="text" name="userPw" value="${target.userPw }"/></td>
				</tr>
				<tr>
					<td>성</td>
					<td><input type="text" name="userFirstName" value="${target.userFirstName }"/></td>
				</tr>
				<tr>
					<td>이름</td>
					<td><input type="text" name="userLastName" value="${target.userLastName }"/></td>
				</tr>
				<tr>
					<td>부서</td>
					<td>
						<select name="userDept">
							<c:forEach items="${deptList }" var="d">
								<c:choose>
									<c:when test="${target.userDept eq d.commonCode}">
										<option selected="selected" value="${target.userDept }">
											${d.codeName}
										</option>
									</c:when>
									<c:otherwise>
										<option value="${d.commonCode}">
											${d.codeName}
										</option>
									</c:otherwise>
								</c:choose>
							</c:forEach>
						</select>
					</td>
				</tr>
				<tr>
					<td>직급</td>
					<td>
						<select name="userRank">
							<c:forEach items="${rankList }" var="r">
								<c:choose>
									<c:when test="${target.userRank eq r.commonCode}">
										<option selected="selected" value="${target.userRank }">
											${r.codeName}
										</option>
									</c:when>
									<c:otherwise>
										<option value="${r.commonCode}">
											${r.codeName}
										</option>
									</c:otherwise>
								</c:choose>
							</c:forEach>
						</select>
					</td>
				</tr>
				<tr>
					<td>직책</td>
					<td>
						<select name="userPosition">
							<c:forEach items="${positionList }" var="p">
								<c:choose>
									<c:when test="${target.userPosition eq p.commonCode}">
										<option selected="selected" value="${target.userPosition }">
											${p.codeName}
										</option>
									</c:when>
									<c:otherwise>
										<option value="${p.commonCode}">
											${p.codeName}
										</option>
									</c:otherwise>
								</c:choose>
							</c:forEach>
						</select>
					</td>
				</tr>
				<tr>
					<td>권한</td>
					<td>
						<select name="userAuthority">
							<c:forEach items="${authorityList }" var="a">
								<c:choose>
									<c:when test="${target.userAuthority eq a.commonCode}">
										<option selected="selected" value="${target.userAuthority }">
											${a.codeName}
										</option>
									</c:when>
									<c:otherwise>
										<option value="${a.commonCode}">
											${a.codeName}
										</option>
									</c:otherwise>
								</c:choose>
							</c:forEach>
						</select>
					</td>
				</tr>
				<tr>
					<td>상태</td>
					<td>
						<select name="userStatus">
							<c:forEach items="${statusList }" var="s">
								<c:choose>
									<c:when test="${target.userStatus eq s.commonCode}">
										<option selected="selected" value="${target.userStatus }">
											${s.codeName}
										</option>
									</c:when>
									<c:otherwise>
										<option value="${s.commonCode}">
											${s.codeName}
										</option>
									</c:otherwise>
								</c:choose>
							</c:forEach>
						</select>
					</td>
				</tr>
				<tr>
					<td>연락처</td>
					<td><input type="text" name="userPhone" value="${target.userPhone }"/></td>
				</tr>
				<tr>
					<td>내선번호</td>
					<td><input type="text" name="userLandLineNumber" value="${target.userLandLineNumber }"/></td>
				</tr>
				<tr>
					<td>우편번호</td>
					<td><input type="text" name="userZipCode" value="${target.userZipCode }"/></td>
				</tr>
				<tr>
					<td>주소</td>
					<td><input type="text" name="userAddr" value="${target.userAddr }"/></td>
				</tr>
				<tr>
					<td>주소상세</td>
					<td><input type="text" name="userAddrDetail" value="${target.userAddrDetail }"/></td>
				</tr>
			</table>
		</c:forEach>
		<div>
			<button id="mdfBtn" type="submit" style=" display: inline-block; width: 100px; margin-top: 20px; margin-left: 80px;">수정</button>
		</div>
	</form>

</body>
</html>