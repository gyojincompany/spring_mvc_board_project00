<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판 글 목록</title>
</head>
<body>
	<h2>자유게시판 글 목록</h2>
	<hr>
	<table width="1000" cellpadding="0" cellspacing="0" border="1">
		<tr>
			<td align="center">번호</td>
			<td align="center">글쓴이</td>
			<td align="center">글제목</td>
			<td align="center">등록일</td>
			<td align="center">조회수</td>
		</tr>
		<c:forEach items="${list }" var="dto">
		<tr>
			<td>${dto.bId }</td>
			<td>${dto.bName }</td>			
			<td><a href="content_view?bId=${dto.bId }">${dto.bTitle }</a></td>
			<td>${dto.bDate }</td>
			<td>${dto.bHit }</td>
		</tr>
		</c:forEach>
		<tr>
			<td colspan="5"><a href="write_view">글쓰기</a></td>
		</tr>
	
	
	</table>
</body>
</html>