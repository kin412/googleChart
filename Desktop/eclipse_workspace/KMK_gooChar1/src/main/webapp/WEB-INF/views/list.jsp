<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

	<c:forEach items="${list}" var = "list">
		<c:out value="${list.st_dt}" /> ||
		<c:out value="${list.et_dt}" /> ||
		<c:out value="${list.nm}" />
		<br><br>
	</c:forEach>

</body>
</html>