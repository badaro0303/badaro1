<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="preconnect" href="https://fonts.gstatic.com">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/board/css2.css">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/board/jquery-ui.css">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/board/reset.css?after">
<link rel="stylesheet" type="text/css" href="/resources/css/board/boardList.css">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/board/style_main.css?after1">
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/board/jquery-ui.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/board/jquery.min.js"></script>
</head>
<body>
    <div id="wrap">
        <header id="header">
            <div class="headerIn">
                <h1 class="logo"><a href="/badaro/main/index">바다로</a></h1>
                <div class="member">                   
                        <c:choose>
                 	    	<c:when test="${member == null}">
                 	    		<p class="join"><a href="/badaro/join/join">회원가입</a></p>
                    			<p class="login"><a href="/badaro/login/login">로그인</a></p>
                    		</c:when>
                    	<c:otherwise>
                    		<p class="mypage"><a href="">마이 페이지</a></p>
                    		<p class="logout"><a href="/badaro/login/logout">로그아웃</a></p>
                    	</c:otherwise>
                 	</c:choose>
                </div>
            </div><!--.headerIn-->
        </header><!--#header-->
        <div class="gnb">
            <div class="aside">
                <ul>
                    <li><a href="badaro/board/boardList">동해</a></li>
                    <li><a href="">menu2</a></li>
                    <li><a href="">menu3</a></li>
                    <li><a href="">menu4</a></li>
                    <li><a href="">menu5</a></li>
                </ul>
                <button><img src="${pageContext.request.contextPath}/resources/img/btn_open.png" alt=""></button>
            </div>
        </div> <!--.gnb-->