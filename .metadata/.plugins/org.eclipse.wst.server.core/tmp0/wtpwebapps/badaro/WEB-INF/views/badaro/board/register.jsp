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
            
         	<form action="register" method="post">
	            <div class="publication">
	                <button type="submit">발행</button>
	            </div>
        </header>
        <div id="container">
            <div class="con_in">
                <div class="top">
                    <div class="top_info">
                    	<div>
                    	
                    		<label>지역</label>
							 <select class="category1">
							  <option value="">전체</option>
							 </select>
							 
							 <label>해수욕장</label>
							 <select class="category2" name="p_beach">
							  <option value="">전체</option>
							 </select>
                    	</div>

							 
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
                        <div class="form-group">
							   <label for="p_user">작성자</label>
							   <input class="form-control" id="p_user" name="p_user">
						</div>                       
                    </div>    
                    
	                <div class="top_title">
	                    <p><textarea style="resize: none;" name="p_title" id="p_title" placeholder="제목"></textarea></p>
	                </div>
                </div> <!--.top-->
                
                <div class="write">
                    <button>본문 이미지 첨부</button>
                    <p><textarea style="resize: none;" name="p_content" id="p_content" placeholder="내용"></textarea></p>
                </div>
            </div>
        </div>
        </form>
    </div>
   	<script type="text/javascript" src="/resources/js/write/jquery.js"></script>
    <script>
		 // 컨트롤러에서 데이터 받기
		    var jsonData = JSON.parse('${category}');
		    console.log(jsonData);
		
		    var cate1Arr = new Array();
		    var cate1Obj = new Object();
		
		    // 1차 분류 셀렉트 박스에 삽입할 데이터 준비
		    for(var i = 0; i < jsonData.length; i++) {
		     
		     if(jsonData[i].tier == "1") {
		      cate1Obj = new Object();  //초기화
		      cate1Obj.cateCode = jsonData[i].cateCode;
		      cate1Obj.cateName = jsonData[i].cateName;
		      cate1Arr.push(cate1Obj);
		     }
		    }
		
		    // 1차 분류 셀렉트 박스에 데이터 삽입
		    var cate1Select = $("select.category1")
		
		    for(var i = 0; i < cate1Arr.length; i++) {
		     cate1Select.append("<option value='" + cate1Arr[i].cateCode + "'>"
		          + cate1Arr[i].cateName + "</option>"); 
		    }
		
		
		    $(document).on("change", "select.category1", function(){
		
		    	 var cate2Arr = new Array();
		    	 var cate2Obj = new Object();
		    	 
		    	 // 2차 분류 셀렉트 박스에 삽입할 데이터 준비
		    	 for(var i = 0; i < jsonData.length; i++) {
		    	  
		    	  if(jsonData[i].tier == "2") {
		    	   cate2Obj = new Object();  //초기화
		    	   cate2Obj.cateCode = jsonData[i].cateCode;
		    	   cate2Obj.cateName = jsonData[i].cateName;
		    	   cate2Obj.cateCodeRef = jsonData[i].cateCodeRef;
		    	   
		    	   cate2Arr.push(cate2Obj);
		    	  }
		    	 }
		    	 
		    	 var cate2Select = $("select.category2");
		    	 
		    	 /*
		    	 for(var i = 0; i < cate2Arr.length; i++) {
		    	   cate2Select.append("<option value='" + cate2Arr[i].cateCode + "'>"
		    	        + cate2Arr[i].cateName + "</option>");
		    	 }
		    	 */
		    	 
		    	 cate2Select.children().remove();
		
		    	 $("option:selected", this).each(function(){
		    	  
		    	  var selectVal = $(this).val();  
		    	  cate2Select.append("<option value=''>전체</option>");
		    	  
		    	  for(var i = 0; i < cate2Arr.length; i++) {
		    	   if(selectVal == cate2Arr[i].cateCodeRef) {
		    	    cate2Select.append("<option value='" + cate2Arr[i].cateCode + "'>"
		    	         + cate2Arr[i].cateName + "</option>");
		    	   }
		    	  }
		    	  
		    	 });
		    	 
		    	});
    </script>
</body>
</html>