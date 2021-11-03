<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<meta id="_csrf" name="_csrf" content="${_csrf.token}" />
<meta id="_csrf_header" name="_csrf_header" content="${_csrf.headerName}" />
<link rel="preconnect" href="https://fonts.gstatic.com">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/login/css2.css">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/login/jquery-ui.css">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/login/reset.css">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/login/style_login.css">
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/login/jquery-ui.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/login/jquery.min.js"></script>
</head>
<body>
	<div id="wrap">
        <div class="login">
            <h1 class="logo"><a href="/badaro/main/index">바다로</a></h1>
            <c:if test="${member == null}">
                <form action="login" method="post">
                <label>아이디</label>
                <input type="text" id="id" name="id" placeholder="아이디를 입력하세요.">
                <br>
                <label>비밀번호</label>
                <input type="password" id="password" name="password" placeholder="비밀번호를 입력하세요.">
                <br>
                <button class="loginBtn" type="submit">로그인</button>
                <button class="joinBtn"><a href="/badaro/join/join">회원가입</a></button>
            </form>
            </c:if>
            
            <c:if test="${member != null}">
				<c:redirect url="/badaro/main/index"/>
			</c:if>


        </div>
    </div>
</body>
</html>