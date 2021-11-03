<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
    
<%@include file ="header.jsp"%>

<div id="container">
	<div class="row1"></div>
	<div id="board_list_wrap">
		<div id="board_list_wrap_in">
			<div class="btns">
			<a href="/badaro/board/register"><input type="button" value="글작성"></a>
			</div>
                <table class="board_list">
                    <caption>게시판 목록</caption>
                    <thead>
                        <tr>
                            <th>해수욕장</th>
                            <th>제목</th>
                            <th>별점</th>
                            <th>이름</th>
                            <th>날짜</th>
                            <th>조회수</th>
                        </tr>
                    </thead>
                    <tbody>
                    <c:forEach var="boardlist" items="${list}">
                        <tr>
                            <td>${boardlist.p_beach}</td>
                            <td class="title"><a href="/badaro/board/read?p_turn=${boardlist.p_turn}">${boardlist.p_title}</a></td>
                            <td class="rating">★★★★★</td>
                            <td>${boardlist.p_user}</td>
                            <td>${boardlist.p_date}</td>
                            <td>${boardlist.p_count}</td>
                        </tr>
                       </c:forEach>
                    </tbody>
                </table>
				<ul class="pagination">
				<c:if test="${pageMaker.prev}">
			    	<li class="paginate_button prev"><a href="/badaro/board/boardList?pageNum=${pageMaker.startPage-1}&amount=${pageMaker.cri.amount}&type=${pageMaker.cri.type}&keyword=${pageMaker.cri.keyword}">Previous</a></li>
			    </c:if>
			    <c:forEach var="num" begin="${pageMaker.startPage}" end="${pageMaker.endPage}">
				    	<li class="paginate_button page-item ${pageMaker.cri.pageNum==num?'active':''}">
				    		<a href="/badaro/board/boardList?pageNum=${num}&amount=${pageMaker.cri.amount}&type=${pageMaker.cri.type}&keyword=${pageMaker.cri.keyword}" class="page-link">${num}</a>
				    	</li>
			    </c:forEach>
			     <c:if test="${pageMaker.next}">
			    	<li class="paginate_button next"><a href="/badaro/board/boardList?pageNum=${pageMaker.endPage+1}&amount=${pageMaker.cri.amount}&type=${pageMaker.cri.type}&keyword=${pageMaker.cri.keyword}">Next</a></li>
			    </c:if>
			    </ul>
            </div> <!--#board_list_wrap_in-->
		</div> <!--#board_list_wrap-->
		</div>

	<%@include file ="footer.jsp" %>