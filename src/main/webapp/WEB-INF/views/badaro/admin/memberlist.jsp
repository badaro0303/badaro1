<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>바다로 관리자 페이지</title>

		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/admin/all.css">
   		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/admin/reset.css">
   		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/admin/member_list.css">
		<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/admin/jquery.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/admin/all.js"></script>
	</head>
</head>
<body>
	<header id="header">
        <div class="topbar" style="position: absolute; top:0;">
            <!-- 왼쪽 메뉴 -->
            <div class="left side-menu">
                <div class="sidebar-inner">
                    <div id="sidebar-menu">
                        <ul>
                            <li class="has_sub"><a href="javascript:void(0);" class="waves-effect">
                                <i class="fas fa-bars"></i>
                            </a></li>
                        </ul>
                    </div>
                </div>
            </div>
            <!-- 왼쪽 서브 메뉴 -->
            <div class="left_sub_menu">
                <div class="sub_menu">
                    <input type="search" name="SEARCH" placeholder="SEARCH">
                    <h2>분류</h2>
                    <ul class="big_menu">
                        <li>회원 관리 <i class="arrow fas fa-angle-right"></i></li>
                        <ul class="small_menu">
                            <a href="/badaro/admin/memberlist"><li>회원목록</li></a>
                            <a href=""><li>소메뉴1-2</li></a>
                        </ul>
                    </ul>
                    <ul class="big_menu">
                        <li>게시물 관리 <i class="arrow fas fa-angle-right"></i></li>
                        <ul class="small_menu">
                            <a href=""><li>소메뉴2-1</li></a>
                            <a href=""><li>소메뉴2-2</li></a>
                        </ul>
                    </ul>
                    <ul class="big_menu">
                        <li><a href="/badaro/main/index">바다로 메인</a></li>
                    </ul>
                </div>
            </div>
        </div>
        <div class="headerIn">
            <h1 class="title"><a href="/badaro/admin/main">바다로 관리자</a></h1> 
            <ul>
                <li><a href="#">내정보</a></li>
                <li><a href="#">로그아웃</a></li>
            </ul>     
        </div>
    </header>
    <div id="container">
        <h2>회원목록</h2>
        <table border="1" width="900px" height="70px">
            <tr>
                <th>아이디</th>
                <th>비밀번호</th>
                <th>이름</th>
                <th>생년월일</th>
                <th>전화번호</th>
            </tr>
            <c:forEach var="memberlist" items="${list}">
	            <tr>
	                <td>${memberlist.id}</td>
	                <td>${memberlist.password}</td>
	                <td>${memberlist.name}</td> 
	                <td>${memberlist.birth}</td>
	                <td>${memberlist.phone}</td>
	            </tr>
            </c:forEach>
        </table>
    </div>
        <script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/admin/member_list.js"></script>
</body>
</html>