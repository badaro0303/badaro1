<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/write/style.css">
</head>
<body>
	 <div id="wrap">
        <header>
            <div class="logo">
                <a href="/badaro/main/index">바다로</a>
            </div>
            
         	<form action="modify" method="post">
	            <div class="publication">
	                <button type="submit">수정</button>
	            </div>
        </header>
        <div id="container">
            <div class="con_in">
                <div class="top">
                    <div class="top_info">
                        <div class="top_category">해수욕장 목록 스크립트 적용 예정</div>
                        <div class="star">
                            <span>별점</span>
                            <div class="star-rating" name = "p_rating">
                                <input type="radio" id="5stars" name="rating" value="5" v-model="ratings" />
                                <label for="5stars" class="star pr-4">★</label>
                                <input type="radio" id="4stars" name="rating" value="4" v-model="ratings" />
                                <label for="4stars" class="star">★</label>
                                <input type="radio" id="3stars" name="rating" value="3" v-model="ratings" />
                                <label for="3stars" class="star">★</label>
                                <input type="radio" id="2stars" name="rating" value="2" v-model="ratings" />
                                <label for="2stars" class="star">★</label>
                                <input type="radio" id="1stars" name="rating" value="1" v-model="ratings" />
                                <label for="1stars" class="star">★</label>
                            </div>
                        </div>
                        
                    </div>    
                <div class="top_title">
                    <p><textarea style="resize: none;" name="p_title" id="title_text" placeholder="제목">${modify.p_title}</textarea></p>
                    <input type="hidden" name="p_turn" value="${modify.p_turn}">
                </div>
                </div> <!--.top-->
                <div class="write">
                    <button>본문 이미지 첨부</button>
                    <p><textarea style="resize: none;" name="p_content" id="input_text" placeholder="내용">${modify.p_content}</textarea></p>
                </div>
            </div>
        </div>
        </form>
    </div>
</body>
</html>