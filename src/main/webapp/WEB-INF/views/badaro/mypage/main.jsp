<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="preconnect" href="https://fonts.gstatic.com">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/mypage/css2.css">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/mypage/jquery-ui.css">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/mypage/reset.css?after">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/mypage/style_user_detail.css">
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/mypage/jquery-ui.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/mypage/jquery.min.js"></script>
</head>
<body>
	    <div id="wrap">
        <header id="header">
            <div class="headerIn">
                <h1 class="logo"><a href=/badaro/main/index"">바다로</a></h1>
                <div class="member">
                    <p class="join"><a href="">회원가입</a></p>
                    <p class="login"><a href="">로그인</a></p>
                </div>
            </div><!--.headerIn-->
        </header><!--#header-->
        <div id="container">
            <h2>마이페이지</h2>
            <from action="" name="" method="">
                <table  id="detail" border="1">
                    <tr>
                        <td>아이디</td>
                        <td>아이디 받아오기</td>
                    </tr>
                    <tr>
                        <td>비밀번호</td>
                        <td>비밀번호 받아오기</td>
                    </tr>
                    <tr>
                        <td>이름</td>
                        <td>이름 받아오기</td>
                    </tr>
                    <tr>
                        <td>나이</td>
                        <td>나이 받아오기</td>
                    </tr>
                    <tr>
                        <td>성별</td>
                        <td>성별 받아오기</td>
                    </tr>
                    <tr>
                        <td>이메일</td>
                        <td>이메일 받아오기</td>
                    </tr>
                    <tr>
                        <td>회원가입일</td>
                        <td>회원가입일 받아오기</td>
                    </tr>
                </table>
                <div class="btns">
                    <button type="button"><a href="#">회원정보 수정</a></button>
                    <button type="button" class="withdrawal">회원탈퇴</button>
                </div>
            </from>
        </div><!--#container-->

        <footer id="footer">
            <div class="footerIn">
                Footer
            </div>
        </footer><!--#footer-->
    </div><!--#wrap-->
</body>
</html>