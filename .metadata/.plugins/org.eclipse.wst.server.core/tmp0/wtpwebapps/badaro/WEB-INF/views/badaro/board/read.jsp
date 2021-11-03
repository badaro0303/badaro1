<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Document</title>
    <link rel="preconnect" href="https://fonts.gstatic.com">
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/board/reset.css">
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/board/boardList.css">
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/board/style_main.css">
	<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/board/post.css">
	<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/board/style_main.css">
	    <!-- Custom fonts for this template -->
    <link href="/resources/vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">
        <!-- Custom styles for this template -->
    <link href="/resources/css/sb-admin-2.min.css" rel="stylesheet">
        <!-- Custom styles for this page -->
    <link href="/resources/vendor/datatables/dataTables.bootstrap4.min.css" rel="stylesheet">
    
    <link href="/resources/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">
    <script type="text/javascript" src="/resources/vendor/jquery/jquery.js"></script>
    
     <!-- modal창 start -->
    <div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hiddn="true">
    	<div class="modal-dialog">
    		<div class="modal-content">
    			<div class="modal-header">
    				<button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
    				<h4 class="modal-title" id="myModalLabel">Reply Modal</h4>
    			</div>
    			<div class="modal-body">
    				<div class="form-group">
    					<label>Reply</label>
    					<input class="form-control" name="reply" value="New Reply!!!">
    				</div>
    				<div class="form-group">
    					<label>Replyer</label>
    					<input class="form-control" name="replyer" value="replyer">
    				</div>
    				<div class="form-group">
    					<label>Reply Date</label>
    					<input class="form-control" name="replyDate" value="">
    				</div>
    			</div><!--  class="modal-body" 끝 -->
    			<div class="modal-footer">
    				<button id="modalModBtn" type="button" class="btn btn-warning">Modify</button>
    				<button id="modalRemoveBtn" type="button" class="btn btn-danger">Remove</button>
    				<button id="modalRegisterBtn" type="button" class="btn btn-primary">Register</button>
    				<button id="modalCloseBtn" type="button" class="btn btn-default">Close</button>
    			</div>
    		</div><!--  class="modal-content" 끝 -->
    	</div>
    </div>
        <!-- modal창 end -->
        <script type="text/javascript" src="/resources/js/reply.js"></script>

</head>
<body>
    <div id="wrap">
        <header id="header">
            <div class="headerIn">
                <h1 class="logo"><a href="/badaro/main/index">바다로</a></h1>
                <div class="member">
                    <p class="join"><a href="">마이페이지</a></p>
                    <p class="login"><a href="">로그아웃</a></p>
                </div>
            </div><!--.headerIn-->
        </header><!--#header-->
        <div class="gnb">
            <div class="aside">
                <ul>
                    <li><a href="">동해</a></li>
                    <li><a href="">menu2</a></li>
                    <li><a href="">menu3</a></li>
                    <li><a href="">menu4</a></li>
                    <li><a href="">menu5</a></li>
                </ul>
                <button><img src="img/btn_open.png" alt=""></button>
            </div>
        </div> <!--.gnb-->
        <div id="container">
            <div class="row1"></div>
            <div class="text">
                <div class="row2">
                    <div class="title">
                        <p>${read.p_title}</p>
                    </div>
                    <div class="form-group" hidden>
						<label for="name">작성자</label>
						<input class="form-control" id="p_user" name="p_user" value="${read.p_user}" readonly>
						<label for="name">조회수</label>
						<input class="form-control" id="p_count" name="p_count" value="${read.p_count}" readonly>
						<input type="text" id="p_turn" name="p_turn" value="${read.p_turn}">
					</div>
	                <div class="r1btns">
	                	<p class="change"><a href="/badaro/board/modify?p_turn=${read.p_turn}">수정</a></p>
	                    <p class="delete"><a href="/badaro/board/remove?p_turn=${read.p_turn}">삭제</a></p>
	               	</div>


                </div> <!--.row2-->
    
                <div class="row3">
                    <div class="memo">
                        <form action="">
                            <p class="m1">${read.p_content}</p>
                        </form>
                    </div>
                </div> <!--.row3-->
                
                
	           	<div class="row"><!-- class="row" 시작 -->
					<div class="col-lg-12"><!-- class="col-lg-12" 시작 -->
						<div class="panel panel-default"><!-- class="panel panel-default" 시작 -->
							<div class="panel-heading"><!-- class="panel-heading" 시작 -->
								<i class="fa fa-comments fa-fw"></i>Reply
								<button id="addReplyBtn" class="btn btn-primary btn-xs pull-right">댓글 쓰기</button>
							</div><!-- class="panel-heading" 끝 -->
							
							
							
							<div class="panel-body"><!-- class="panel-body" 시작 -->
								<ul class="chat"><!-- class="chat" 시작 -->
				
								</ul><!-- class="chat" 끝-->
							</div><!-- class="panel-body" 끝 -->
							<!-- .panel .chat-panel -->
							<div class="panel-footer">
							</div>
						</div><!-- class="panel panel-default" 끝 -->
					</div><!-- class="col-lg-12" 끝 -->
				</div><!-- class="row" 끝 -->
            </div>
        </div> <!--c-->
        
        <footer id="footer">
            <div class="footerIn">
                Footer
            </div>
        </footer><!--#footer-->
    </div> <!--#wrap-->

    <script src="${pageContext.request.contextPath}/resources/js/board/script_main.js"></script>
        <!-- Bootstrap Core JavaScript -->
    <script src="/resources/vendor/bootstrap/js/bootstrap.min.js"></script>

    <!-- Metis Menu Plugin JavaScript -->
    <script src="/resources/vendor/metisMenu/metisMenu.min.js"></script>

    <!-- Custom Theme JavaScript -->
    <script src="/resources/dist/js/sb-admin-2.js"></script>
            
</body>
</html>